package mjc.quartz.job;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by gcb on 2019/1/22.
 */
public class HellloJob implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 实际scheler  调用的是 job
        JobDetail detail = context.getJobDetail();
        String name = detail.getJobDataMap().getString("name");
        System.out.println("say hello to " + name + " at " + new Date());
    }

}
