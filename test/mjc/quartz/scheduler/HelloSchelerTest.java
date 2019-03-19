package mjc.quartz.scheduler;

import junit.framework.TestCase;
import mjc.quartz.job.HellloJob;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.Date;

import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by gcb on 2019/1/22.
 *  qurtz  2.x 后的 DSL风格（通常意味着fluent interface风格）
 */
public class HelloSchelerTest extends TestCase {


    public void testA(){

        try {


        //创建scheduler
        Scheduler sched= StdSchedulerFactory.getDefaultScheduler();



            //newJob   JobBuilder 中的静态方法
            //`javascript` 里叫链式调用，不知道 `java` 里具体叫啥。实现上其实就是方法里返回自己
        JobDetail job = newJob(HellloJob.class)
                .withIdentity("job1", "group1")
                .build();



        //定义一个Trigger
        // compute a time that is on the next round minute
        Date runTime = evenMinuteDate(new Date());
            //定义一个Trigger
            Trigger trigger = newTrigger().withIdentity("trigger1", "group1") //定义name/group
                    .startNow()//一旦加入scheduler，立即生效
                    .withSchedule(simpleSchedule() //使用SimpleTrigger
                            .withIntervalInSeconds(1) //每隔一秒执行一次
                            .repeatForever()) //一直执行，奔腾到老不停歇
                    .build();


        //加入这个调度
        sched.scheduleJob(job, trigger);

        sched.start();

        //运行一段时间后关闭
        Thread.sleep(10000);
        sched.shutdown(true);

        }catch (Exception e){

        }

    }


    /**
     * setter  风格
     * 可以对比一下
     */
    public void testB(){

        JobDetail jobDetail=new JobDetailImpl("jobDetail1","group1",HellloJob.class);
        jobDetail.getJobDataMap().put("name", "quartz");

        SimpleTriggerImpl trigger=new SimpleTriggerImpl("trigger1","group1");
        trigger.setStartTime(new Date());
        trigger.setRepeatInterval(1);
        trigger.setRepeatCount(-1);

    }




}