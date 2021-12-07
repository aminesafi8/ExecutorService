package tn.amine.safi.intro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InputOutputOperations {

    public static void main(String[] args) {
        // create the pool
        // 100 => much higher count for IO tasks
        // if our machine can execute at a time 4 threads, we will use the next remaining threads to complete the tasks
        // choose a higher number of threads to avoid threads block/wait
        ExecutorService service = Executors.newFixedThreadPool(100);

        // submit the tasks for execution
        for (int i = 0; i < 100; i++) {
            service.execute(new IOTask());
        }
    }

    static class IOTask implements Runnable {

        @Override
        public void run() {
            // some IO operations which will cause thread to block/wait
        }
    }
}
