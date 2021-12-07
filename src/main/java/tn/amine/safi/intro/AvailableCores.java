package tn.amine.safi.intro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AvailableCores {
    public static void main(String[] args) {
        // get count of available cores
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Core Count ==> " + coreCount);

        // create the pool
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        // submit the tasks for execution
        for (int i = 0; i < 100; i++) {
            service.execute(new CpuIntensiveTask());
        }
    }

    static class CpuIntensiveTask implements Runnable {

        @Override
        public void run() {
            // some CPU intensive operations
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
