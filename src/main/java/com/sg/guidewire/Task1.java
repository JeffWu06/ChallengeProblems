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
public class Task1 {
    
    public String solution(String S) {
        /* Create new StringBuilder, add first char, and initialize counter. */
        StringBuilder newString = new StringBuilder("");
        char lastChar = S.charAt(0);
        newString.append(lastChar);
        int counter = 1; // To keep track of consecutives.
        
        for (int i = 1; i < S.length(); i++) {
            char currChar = S.charAt(i);
            
            /* If currChar is the same as lastChar, increment the counter (since
            there are now x+1 consecutive of that char), or else reset counter.
            */
            if (currChar == lastChar) {
                counter++; 
            } else {
                counter = 1;
            }
            
            /* Only append the character to the new String if it is not a third
            (or more) consecutive instance of that character.
            */
            if (counter < 3) {
                newString.append(currChar);
            }
            
            /* Set currChar as the new lastChar for next loop iteration.*/
            lastChar = currChar;
        }
        return newString.toString();
    }
}
