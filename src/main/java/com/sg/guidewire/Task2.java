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
public class Task2 {
    
    public int solution(String S) {
        int SConverted = Integer.parseInt(S,2); // Convert S to integer.
        int numOfOperations = 0; // Initialize count of operations.
        // Check if conversion works.
//        System.out.println(S + " is now " + binaryConverted);
        
        /* Per specs, if the S is odd, subtract 1. If the S is even, divide it 
        by 2. Keep performing those operations and keep count until S is 
        decremented all the way to 0. Return count of operations performed.
        */
        while(SConverted > 0) {
            if (SConverted % 2 == 0) {
                SConverted /= 2;
            } else {
                SConverted -= 1;
            }
            numOfOperations++;
        }
        return numOfOperations;
    }
}
