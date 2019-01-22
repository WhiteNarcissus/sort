package mjc.quartz.scheduler;

import mjc.quartz.job.HellloJob;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by gcb on 2019/1/22.
 */
public class HelloScheler   {


    public static void main(String[] args) {
        try {
            //创建scheduler
            Scheduler sched = StdSchedulerFactory.getDefaultScheduler();


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

        } catch (Exception e) {


        }


    }


}
