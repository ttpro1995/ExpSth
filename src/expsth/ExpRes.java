/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class ExpRes {
    
    public void expGetRes(){
    	StringBuilder result = new StringBuilder("");

	//Get file from resources folder
	ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource("atextfilexxx.txt").getFile());

	try (Scanner scanner = new Scanner(file)) {

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			result.append(line).append("\n");
		}

		scanner.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
        System.out.println(result.toString());
		
    }
    
    public static void main(String[] args) {
        ExpRes exp = new ExpRes();
        exp.expGetRes();
    }
}
