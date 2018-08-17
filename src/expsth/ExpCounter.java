/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.LongStream;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class ExpCounter {
    public static void main(String[] args) {
        AtomicInteger aInt = new AtomicInteger(0);
        LongStream.range(5, 100).parallel().mapToObj((x) -> {
            return "stream  " + Long.toString(x);
        }).forEach(x->{
            int aCount = aInt.incrementAndGet();
            System.out.println("Stream "  + String.valueOf(x) + " atomic " + aCount);
        });
        System.out.println("final atomic " + String.valueOf(aInt.get()));
    }
    
}
