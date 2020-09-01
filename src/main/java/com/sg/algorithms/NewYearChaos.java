/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.algorithms;

import java.util.Random;

/**
 *
 * @author Jeff
 */
public class NewYearChaos {
    public static void main(String[] args) {
        
    }

    public static int[] initializeArray() {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 5;
        Random randomizer = new Random();
        
        for (int j = 0; j < 5; j++) {
            arr[j] = randomizer.nextInt(10) + 1;
        }
        return arr;
    }
    
}
