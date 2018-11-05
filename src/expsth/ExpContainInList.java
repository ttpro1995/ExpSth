/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class ExpContainInList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,12);
        System.out.println(intList.contains(10));
        System.out.println(intList.contains(12));
    }
}
