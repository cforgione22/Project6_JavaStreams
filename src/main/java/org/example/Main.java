package org.example;

import java.util.Random;
import java.util.random.RandomGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        StreamUtil.timeOdds(random, 6, false);
    }
}


