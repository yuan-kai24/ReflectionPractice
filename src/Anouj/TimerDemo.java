package Anouj;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // task to run goes here
                System.out.println("Hello Timer!!!");
            }
        };
        Timer timer = new Timer();
        long delay = 1000;
        long intevalPeriod = 1 * 1000;
        // schedules the task to be run in an interval
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);

        Runnable runnable = new Runnable() {
            public void run() {
                // task to run goes here
                System.out.println("Hello ScheduledExecutorService!!");
            }
        };
        System.out.println("------------------------------------------");
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(runnable, 5, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(2000);
            timer.cancel();
            Thread.sleep(10000);
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("一共用了：" + (endTime - startTime) + "毫秒！");
    }
}
