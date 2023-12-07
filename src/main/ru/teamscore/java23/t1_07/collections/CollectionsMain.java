package ru.teamscore.java23.t1_07.collections;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class CollectionsMain {
    final static int LIST_EDIT_COUNT = 100_000;
    final static int OUEUE_EDIT_COUNT = 1_000_000;
    final static int SEED = 10;
    public static void main(String[] args) {
        // List
        System.out.println("LISTS");
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        Random rnd = new Random(SEED);
        Instant startTime, finishTime;

        startTime = Instant.now();
        for (int i = 0; i < LIST_EDIT_COUNT; i++) {
            arrayList.add(rnd.nextInt(arrayList.size() + 1), rnd.nextDouble());
            if (i % 3 == 2) {
                arrayList.remove(rnd.nextInt(arrayList.size()));
            }
        }
        finishTime = Instant.now();
        System.out.println("ArrayList insert/remove time: " + Duration.between(startTime, finishTime).toMillis());

        rnd = new Random(SEED);
        startTime = Instant.now();
        for (int i = 0; i < LIST_EDIT_COUNT; i++) {
            linkedList.add(rnd.nextInt(linkedList.size() + 1), rnd.nextDouble());
            if (i % 3 == 2) {
                linkedList.remove(rnd.nextInt(linkedList.size()));
            }
        }
        finishTime = Instant.now();
        System.out.println("LinkedList insert/remove time: " + Duration.between(startTime, finishTime).toMillis());

        // Stack
        System.out.println("A-LA STACK");
        Deque<Double> deque = new ArrayDeque<>();

        startTime = Instant.now();
        for (int i = 0; i < OUEUE_EDIT_COUNT; i++) {
            linkedList.push(rnd.nextDouble());
            if (i % 3 == 2) {
                linkedList.pop();
            }
        }
        finishTime = Instant.now();
        System.out.println("LinkedList push/pop time: " + Duration.between(startTime, finishTime).toMillis());

        startTime = Instant.now();
        for (int i = 0; i < OUEUE_EDIT_COUNT; i++) {
            deque.push(rnd.nextDouble());
            if (i % 3 == 2) {
                deque.pop();
            }
        }
        finishTime = Instant.now();
        System.out.println("ArrayDeque push/pop time: " + Duration.between(startTime, finishTime).toMillis());

        startTime = Instant.now();
        for (int i = 0; i < OUEUE_EDIT_COUNT; i++) {
            arrayList.add(0, rnd.nextDouble());
            if (i % 3 == 2) {
                arrayList.remove(0);
            }
        }
        finishTime = Instant.now();
        System.out.println("ArrayList push/pop time: " + Duration.between(startTime, finishTime).toMillis());
    }
}
