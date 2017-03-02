package org.bthnpydn.java8.improvements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by bapaydin on 28.02.2017.
 */
public class ConcurrencyDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<String> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<String> submit = executorService.submit(() -> {
                Thread thread = Thread.currentThread();
                return "Name : " + thread.getName() + " State : " + thread.getState();
            });
            futureList.add(submit.get());
        }

        futureList.stream().forEach(System.out::println);

        executorService.execute(() -> System.out.println(Thread.currentThread().getName() + " working..."));
    }
}
