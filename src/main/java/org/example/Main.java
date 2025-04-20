package org.example;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        final Random r = new Random();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int n = r.nextInt(1, 15);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}