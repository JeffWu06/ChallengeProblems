/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jeff
 */
public class BirthdayChocolate {
    public static void main(String[] args) {
        List<Integer> testCase3 = initializeList3();
        System.out.println("Possible combinations: " 
                + birthday(testCase3, 18, 7));
        
        List<Integer> testCase0 = initializeList0();
        System.out.println("Possible combinations: " 
                + birthday(testCase0, 3, 2));
        
        List<Integer> testCase2 = initializeList2();
        System.out.println("Possible combinations: " 
                + birthday(testCase2, 4, 1));
    }

    public static List<Integer> initializeList0() {
        List<Integer> testCase = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));
        return testCase;
    }

    public static List<Integer> initializeList2() {
        List<Integer> testCase = new ArrayList<>(Arrays.asList(4));
        return testCase;
    }

    public static List<Integer> initializeList3() {
        List<Integer> testCase = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 4, 
                3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1));
        return testCase;
    }
    
    public static int birthday(List<Integer> s, int d, int m) {
        int comboCount = 0;
        for (int index = 0; index < s.size(); index++) {
            int currSum = 0, countToSum = 0;
            
            /* Since the contiguous piece of chocolate can be less than m pieces
            long, Ensure those sums at the end of the List s that are still 
            considered. */
            if (index + m > s.size()) {
                countToSum = s.size();
            } else {
                countToSum = index + m;
            }
            
            /* Loop through s and get the sum of contiguous m chocolate pieces 
            starting at index (not to span past max s index. */
            for (int j = index; j < countToSum; j++) {
                currSum += s.get(j);
            }
            if (currSum == d){
                comboCount++;
            }
        }
        return comboCount;
    }
}
