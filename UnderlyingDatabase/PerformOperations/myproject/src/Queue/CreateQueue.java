package Queue;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class CreateQueue {
    public static void main(String args[])  {

        createScheduleQueue();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("进入 timerTask 1：" + new Date());
                try {
                    // 休眠 5 秒
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Run timerTask 1：" + new Date());
            }
        };
        // 定义任务 2
        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Run timerTask 2：" + new Date());
            }
        };
        // 计时器
        Timer timer = new Timer();
        // 添加执行任务（延迟 1s 执行，每 3s 执行一次）
        timer.schedule(timerTask, 1000, 3000);
        timer.schedule(timerTask2, 1000, 3000);
    }


    public static void createScheduleQueue()  {

        System.out.println("开始创建计划执行队列... ...");
    }
}
//创建计划队列对象



//设置该队列的描述信息



//设置队列的名称



//设置要执行的类和方法

//类名



//方法名



//设置开始时间,在这里我设置为队列创建后立即执行


//设置执行周期,这里设置为每隔10秒执行一次




//最后，将计划任务对象添加到队列






