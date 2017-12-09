package com.test;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //Problem 13
    public int rollDice(int n) {
        int amount = 6;
        if (n != 0) {
            amount = n;
        }
        Random rand = new Random();
        int luck = rand.nextInt(amount) + 1;
        return luck;
    }

    //Problem 5
    public void fizzbuzz(int start, int end) {

        //Handling edge cases
        if (start == end) {
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.print("fizzbuzz");
            } else if (start % 3 == 0) {
                System.out.println("fizz");
            } else if (start % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(start);
            }
            return;
        } else if(end < start) {
            return;
        }
        //End of edge cases

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Problem 6
    public void fib(int num) {
        int times = num;
        if (num <= 0) {
            times = 10;
        }

        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 0;

        System.out.println(prev2);
        for(int i = 2; i < times; ++i) {
            prev3 = prev1 + prev2;
            System.out.println(prev3);
            prev1 = prev2;
            prev2 = prev3;
        }
    }

    //Problem 7

    public int factorial(int num) {
        if (num == 0) {
            return 0;
        }
        return factorialHelper(num);
    }

    private int factorialHelper(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorialHelper(num - 1);
        }
    }
}
