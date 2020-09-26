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
        
        Task1 task1 = new Task1();
        
        String test1 = "eedaaad";
        String test2 = "xxxtxxx";
        String test3 = "uuuuxaaaaxuuu";
        
        System.out.println(test1 + " is now: " + task1.solution(test1));
        System.out.println(test2 + " is now: " + task1.solution(test2));
        System.out.println(test3 + " is now: " + task1.solution(test3));
    }
}
