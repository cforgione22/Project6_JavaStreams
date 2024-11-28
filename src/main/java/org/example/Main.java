package org.example;

import java.util.Random;
import java.util.random.RandomGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        StreamUtil.timeOdds(random, 10, false);
        StreamUtil.timeOdds(random, 100, false);
        StreamUtil.timeOdds(random, 1000, false);
        StreamUtil.timeOdds(random, 1000000000, false);
    }
}


