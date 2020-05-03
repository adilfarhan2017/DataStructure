package com.practise.model;

import com.practise.mainprograms.LinkedListProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLinkedList {
    Node header = null;
    Node last = null;
    public static Logger logger = LoggerFactory.getLogger(MyLinkedList.class);
    public void add(int data){
        Node node = new Node(data);
        if(header == null){
            header = new Node(0);
            header.setNextNode(node);
            last = new Node(0);
        }
        else{
            last.getNextNode().setNextNode(node);

        }
        last.setNextNode(node);
    }

    public void delete(int data){
        if(header == null){
            logger.info("List is empty !!");
            return;
        }
        Node node = header.getNextNode();
        Node prevNode = header;
        while(node != null){
            if(data == node.getData()){
                 prevNode.setNextNode(node.getNextNode());
             }
            else{
                prevNode = node;
            }

            node = node.getNextNode();
        }


    }


    public void print(){
        if(header == null){
            logger.info("List is empty !!");
            return;
        }
        Node node = header.getNextNode();
        while(node!= null){
            logger.info("Data :  " + node.getData());
             node = node.getNextNode();
        }
    }
}
