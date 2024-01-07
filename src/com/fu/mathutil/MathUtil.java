/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author anhkhoa
 */
public class MathUtil {
    public static long getFactorial(int n) {
        long result = 1;
        if(n >= 21 || n < 0) {
            throw new IllegalAccessError("Illegal");
        }
        if(n ==0 || n ==1) {
            result = 1;
        }
        else {
            for(long i=2; i <= n; i++) {
                result *= i;
            }
        }
         
        
        return result;
    }
}
