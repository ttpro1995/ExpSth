/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.util.HashSet;
import java.util.Set;

/**
 * Let see how can we print a set
 * @author thient
 */
public class ExpWithPrintingASet {
    public static void main(String[] args) {
        printSetOfLong();
    }
    
    
    public static void printSetOfLong(){
        Set<Long> setOfLong = new HashSet<Long>();
        setOfLong.add(1l);
        setOfLong.add(12312123l);
        setOfLong.add(9094l);
        System.out.println(setOfLong);
        System.out.println(String.valueOf(setOfLong));
    }
}
