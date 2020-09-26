/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.algorithms;

/**
 *
 * @author Jeff
 */
public class App {
    
    public static void main(String[] args) {
        
        MissingInteger missingInt = new MissingInteger();
        
        int[] test1 = new int[]{1, 3, 6, 4, 1, 2};
        int test1Min = missingInt.solution(test1);
        printArray(test1);
        System.out.println("Min is: " + test1Min);
        System.out.println();
        
        int[] test2 = new int[]{1, 2, 3};
        int test2Min = missingInt.solution(test2);
        printArray(test2);
        System.out.println("Min is: " + test2Min);
        System.out.println();
        
        int[] test3 = new int[]{-1, -3};
        int test3Min = missingInt.solution(test3);
        printArray(test3);
        System.out.println("Min is: " + test3Min);
        System.out.println();
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
    

