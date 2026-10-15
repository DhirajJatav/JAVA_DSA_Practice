package Array2d;

import java.util.ArrayList;
import java.util.Scanner;

public class DyanmicArray {

    public static void main(String[] args) {
        // dynamic array means arraylist
        // it changes size acording to input we gave there is no limit
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array= new ArrayList<>(10);// i entered 10  but it does not matter

        array.add(1432);
        array.add(12);
        array.add(90);

       array.add(1432);
        array.add(12);
        array.add(90);
       array.add(1432);
        array.add(12);
        array.add(90);
     array.add(1432);
        array.add(12);
        array.add(90);

        // it automatically use the toString conecpt
        System.out.println(array);

    

        // array.set(6,700000);// when use 
        // array.set(0,67);
        // System.out.println(array);
       // array.clear();// this makes array blank
        //System.out.println(array);

        // array.remove(5);// it remove from index
        // System.err.println(array);

    //    var check= array.contains(1200);
    //    System.err.println(check);// for check element inside or not

    // Loop to enter element inside the arrayList
    System.out.println("Enter number to enter in array");

    for (int i = 0; i < 5; i++) {
        var newEle=sc.nextInt();
        array.add(newEle);
    }
// System.out.println("output after adding more");
// System.out.println(array);

//to print through loop
for (int i = 0; i < array.size(); i++) {
    System.out.println(array.get(i));
}


    //System.out.println(array[0]);// we cannot acces through this synatx array[0]
    // in array list array.get();





    }

}