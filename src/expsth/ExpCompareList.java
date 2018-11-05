/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class ExpCompareList {

    public static void main(String[] args) {
        List<Integer> result1 = Arrays.asList(1,3,5,6,7,10);
        List<Integer> result2 = Arrays.asList(4,5,6,8,11);
        List<Integer> common = new ArrayList<Integer>(result1);
        System.out.println(common.size());
        common.retainAll(result2);
        System.out.println(common);
    }
}
