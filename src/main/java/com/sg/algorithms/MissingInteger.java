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
public class MissingInteger {
    public final int MAX = 1000000;
    
    public int solution(int[] A) {
        int min = 1;
        for (int i = 1; i <= MAX; i++) {
            if (!isNumPresent(A, i)) {
                min = i;
                break;
            }
        }
        return min;
    }
    
    public boolean isNumPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }    
}
