package Array2d.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LS_String {
    public static void main(String[] args) {
    String name="DheeRa";
    char letter='R';
    Scanner dj =new Scanner(System.in);
    System.out.println("Enter char which you want to check");
    char charForCheck=dj.next().charAt(0);

    // var result=checkChar(name, letter);
    // System.out.println(result);
        var result=checkChar(name, charForCheck);
    System.out.println(result);

    // to print a String like an araay
    System.out.println(Arrays.toString(name.toCharArray()));

    
    }

    //linear search on string for char   
    public static Boolean checkChar(String str,char letter) {//lenght() because String is a function
        // not a variable
        for (int i = 0; i < str.length(); i++) {
            if(letter==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
