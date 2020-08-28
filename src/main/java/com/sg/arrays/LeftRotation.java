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
public class LeftRotation {
    public static void main(String[] args) {
        
        int[] arr = initializeArray();
        System.out.println("Original array:");
        printArray(arr);
        int[] arrRotated = rotLeft(arr, 4);
        System.out.println("Rotated array:");
        printArray(arrRotated);
    }

    public static int[] initializeArray() {
        int[] arr = new int[5];
        Random randomizer = new Random();
        
        for (int j = 0; j < 5; j++) {
            arr[j] = randomizer.nextInt(10) + 1;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] rotLeft(int[] a, int d) {
        int arraySize = a.length;
        int[] aRotated = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int oldArrayPos = i + d;
            if (oldArrayPos > arraySize - 1) {
                oldArrayPos -= arraySize;
            }
            aRotated[i] = a[oldArrayPos];
        }
        
        return aRotated;
    }
}
