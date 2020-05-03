package com.practise.mainprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class FibonacciProgram {

    public static Logger logger = LoggerFactory.getLogger(FibonacciProgram.class);
    public static void main(String[] args) {


        logger.info("Welcome to fibo program !!");
        
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the number: ");
        int number = scanner.nextInt();

        logger.info("Your fibonacci number is : " + fibo(number));

    }

    // 5 = 5 + 4 + 3+ 2 + 1 =  5 + (n-1) = n + (n-1)

    public static int fibo(int number){
        if (number == 0){
            return 0;
        }

        number = number + fibo(number - 1);
        return number;
    }
}



