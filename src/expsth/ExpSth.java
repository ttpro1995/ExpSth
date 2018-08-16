/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expsth;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class ExpSth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String token = toFlag("xx");
        System.out.println(token);
    }

    public static String toFlag(String country) {
        country = country.toUpperCase();
        int flagOffset = 0x1F1E6;
        int asciiOffset = 0x41;


        int firstChar = Character.codePointAt(country, 0) - asciiOffset + flagOffset;
        int secondChar = Character.codePointAt(country, 1) - asciiOffset + flagOffset;

        String flag = new String(Character.toChars(firstChar))
                + new String(Character.toChars(secondChar));
        return flag;
    }

}
