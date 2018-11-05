/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class ReadFileParallel {
    public static void main(String[] args) throws IOException {
        Stream<String> ss = Files.lines(Paths.get("testdata/simple.txt"));
        
        Stream<String> ret =  ss.parallel().map(x->x+1);
        
        Files.write(Paths.get("testdata/outsimple.txt"), (Iterable<String>) ret::iterator);
        
        
    }
}
