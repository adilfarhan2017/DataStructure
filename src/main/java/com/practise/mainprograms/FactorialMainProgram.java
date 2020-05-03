package com.practise.mainprograms;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class FactorialMainProgram {

    public static Logger logger = LoggerFactory.getLogger(FactorialMainProgram.class);

    public static void main(String[] args) {

        logger.info("Welcome to first factorial program....recursively");
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the number :");
        //integer valid range is -2,147,483,648 to 2,147,483,647 hence used long
        long number = scanner.nextLong();
        long fact  = factorial (number);

        logger.info("your factorial number is :"+ fact);

    }

    public static long factorial(long num){
        if(num == 1){
            return 1;
        }
        num = num * factorial(num - 1);
        return num;
    }

    //inp 3
    // 3 * fact(2) = 3 * 2 = return 6.
    // inp 2
    // 2* fact(1) = 2 * 1 = return 2 .
    //inp 1
    // return 1
}
