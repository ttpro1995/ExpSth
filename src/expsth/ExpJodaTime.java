/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author thient
 */
public class ExpJodaTime {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println(dt);
        // Format for input
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.println(dtf.print(dt));
    }
}
