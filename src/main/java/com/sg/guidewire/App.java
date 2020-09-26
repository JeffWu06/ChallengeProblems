/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guidewire;

/**
 *
 * @author Jeff
 */
public class App {
    
    public static void main(String[] args) {
        
//        Task1 task1 = new Task1();
//        
//        String test1 = "eedaaad";
//        String test2 = "xxxtxxx";
//        String test3 = "uuuuxaaaaxuuu";
//        
//        System.out.println(test1 + " is now: " + task1.solution(test1));
//        System.out.println(test2 + " is now: " + task1.solution(test2));
//        System.out.println(test3 + " is now: " + task1.solution(test3));

        Task2 task2 = new Task2();
        String test4 = "011100";
        String test5 = "111";
        String test6 = "1111010101111";
        System.out.println(test4 + " to zero takes " + task2.solution(test4) 
                + " moves.");
        System.out.println(test5 + " to zero takes " + task2.solution(test5) 
                + " moves.");
        System.out.println(test6 + " to zero takes " + task2.solution(test6)
                + " moves.");
    }
}
