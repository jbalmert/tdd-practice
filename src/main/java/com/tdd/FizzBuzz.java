package com.tdd;

public class FizzBuzz {
    public String translate(int number) {
        if (number %3 == 0 && number % 5 == 0){
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return "" + number;
    }
}
