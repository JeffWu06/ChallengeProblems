/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.arrays;

import java.util.Random;

/**
 *
 * @author Jeff
 */
public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = initializeArray();
        print6by6Array(arr);
        System.out.println("Max is " + hourGlassSum(arr));
    }
    public static int[][] initializeArray() {
        int[][] arr = new int[6][6];
        Random randomizer = new Random();
        
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                arr[j][i] = randomizer.nextInt(10);
            }
        }
        return arr;
    }
    
    public static void print6by6Array(int[][] arr) {
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public static int hourGlassSum(int[][] arr) {
        int maxHourGlassSum = (-9) * 7;
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int sum = arr[j][i] + arr[j][i + 1] + arr[j][i + 2] 
                        + arr[j + 1][i + 1] + arr[j + 2][i] + arr[j + 2][i + 1]
                        + arr[j + 2][i + 2];
                System.out.println(sum);
                if (sum > maxHourGlassSum) {
                    maxHourGlassSum = sum;
                }
            }
        }
        
        return maxHourGlassSum;
    }
    
}
