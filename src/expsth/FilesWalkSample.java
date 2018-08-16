/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * We try to chain Files.walk with Files.lines to stream lines from directory
 * @author thient <thient@vng.com.vn>
 */
public class FilesWalkSample {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> pStream = Files.walk(Paths.get("/data/text_data/oa/in-use"))){
            pStream
                .filter(p -> p.toString().endsWith("jl"))
                .flatMap(path -> {
                       try { return Files.lines(path); }
                       catch (IOException e) { throw new UncheckedIOException(e); }
                   })
                .forEach(System.out::println);
                ;
        } catch (UncheckedIOException e){
            e.printStackTrace();
        }
    }
}
