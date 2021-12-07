package tn.amine.safi.threadpool.types;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        // it uses a delay queue
        // life cycle : More threads are created if required
        // for scheduling of tasks
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        // task to run after 10 seconds delay
        service.schedule(new Task(), 10, TimeUnit.SECONDS);

        // task to run repeatedly every 10 seconds
        service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);

        // task to run repeatedly 10 seconds after previous task completes
        service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);

    }

    static class Task implements Runnable {

        @Override
        public void run() {
            // task that needs to run
            // based on schedule

        }
    }
}
