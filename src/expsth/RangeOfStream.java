/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class RangeOfStream {
    public static void main(String[] args) {
        LongStream.range(5, 15).parallel().mapToObj((x) -> {
            return Long.toString(x);
        }).forEach(System.out::println);

    IntStream.range(5, 15).mapToObj(x->{return Integer.toString(x);}).forEach(x->{
       System.out.println(x);
    });

    }
            
}
