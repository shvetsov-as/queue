/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qexample;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class Qexample {

    public static Queue<Integer> qc = new LinkedList<>();
     
    public static void main(String[] args) {
        System.out.println("Queue");
        for(int i = 0; i< 10; i++){
            qc.add(i);
        }//for end
        System.out.println(qc);
        Integer result = qc.poll();//peek - vziatb i ydalitb
        System.out.println("dostavili" + result);
        System.out.println(qc);
    }//main end
    
}//class end
