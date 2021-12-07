package tn.amine.safi.threadpool.types;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    // synchronous queue (can hold only 1 task)
    // will create threads if no thread is available to execute a task
    // life cycle : if thread is idle for 60 seconds (no task to execute) then kill the tread
    public static void main(String[] args) {

        // for a lot of short-lived task
        // no nThreads since we don"t know how many threads will be created
        ExecutorService service = Executors.newCachedThreadPool();

        // submit the tasks for execution
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }

    }

    static class Task implements Runnable {

        @Override
        public void run() {
            // short-lived task
        }
    }
}
