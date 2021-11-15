/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qexample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class BQexample {
    public static BlockingQueue<Integer> qc = new LinkedBlockingQueue<>();
     
    public static void main(String[] args) {
        System.out.println("Blicking Queue");
        new Producer().start();
        
        
        new Consumer().start();
        
        
    }//main end
    
    static class Producer extends Thread{
        @Override
        public void run(){
            for (int i=0; i<60; i++){
                try {
                    qc.put(i);
                    System.out.println("Produser  " + i);
                    Thread.sleep((long)(Math.random()*1500));
                } catch (InterruptedException ex) {
                    System.out.println("Prervan Producer");
                }
            }
        }
    }
    
    static class Consumer extends Thread{
        @Override
        public void run(){
            for (int i=0; i<60; i++){
                try {
                    System.out.println("Consumer  " + qc.take()); 
                    Thread.sleep((long)(Math.random()*500));
                } catch (InterruptedException ex) {
                    System.out.println("Prervan Producer");
                }
            }
        }
    }
    
}//class end
