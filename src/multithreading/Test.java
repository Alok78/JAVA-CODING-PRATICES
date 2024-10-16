package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        Queue<Integer> sharedQueue=new LinkedList<>();
        Producer producer=new Producer(sharedQueue);
        Consumer consumer=new Consumer(sharedQueue);
        Thread producerTh=new Thread(producer);
        Thread consumerTh=new Thread(consumer);

        producerTh.start();
        consumerTh.start();;
    }
}
