package tn.amine.safi.threadpool.types;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {

        /* it uses a blocking queue (like the FixedThread pool with a size of 1)
           BUT ALSO when we want to ensure the order of task execution .... (we execute task1, task2, and so on ..)
         create the pool
         */
        ExecutorService service = Executors.newSingleThreadExecutor();

        // submit the tasks for execution, they will be executed ordered
        for (int i = 0; i < 100; i++) {
            service.execute(new FixedThreadPool.Task());
        }

    }

    static class Task implements Runnable {

        @Override
        public void run() {
            // task that needs to run
            // based on schedule

        }
    }
}
