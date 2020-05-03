package com.practise.mainprograms;

import com.practise.model.MyLinkedList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedListProgram {

    public static Logger logger = LoggerFactory.getLogger(LinkedListProgram.class);

    public static void main(String[] args) {
        logger.info("Welcome to linkedlist program !!");

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.print();

        linkedList.delete(10);

        linkedList.print();


    }
}
