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
        StringBuilder sb = new StringBuilder("");
        char lastChar = S.charAt(0);
        sb.append(lastChar);
        int counter = 1;
        
        for (int i = 1; i < S.length(); i++) {
            char currChar = S.charAt(i);
            if (currChar == lastChar) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter < 3) {
                sb.append(currChar);
            }
            lastChar = currChar;
        }
        return sb.toString();
    }
}
