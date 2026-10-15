 package Array2d;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Array1st {
public static void main(String[] args) {
    //System.out.println("hello");
    // for intput
    Scanner in=new Scanner(System.in);
    int row=3;
    int col=3;
   

     
    // 2d array or matrix 
  int [][] arr= new int[row][col];// we dont have need to specify columns
    //  but we have need to specify rows
//    int[][] arr={{1,2,3},
//          {4,5,6},
//         {7,8}};

//         System.out.println(arr[1][2]);
 System.out.print("Enter num");
for(int i=0;i<row;i++){
// outer loop for rowns
for(int j=0;j<col;j++){
   
    arr[i][j]=in.nextInt();
};

};

// for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j <col; j++) {
//         System.out.print(arr[i][j]);
//     }
//     System.out.println();
// }
// second way to print
// for(int index=0;index<arr.length;index++){
//     System.out.println(Arrays.toString(arr[index]));
// }

// enhanced for each loop for 
// i will declare as array because every object inside is array 
// in case of 2d array
// in case one d array we declare as datatype
for (int[] R : arr) {
    System.out.println(Arrays.toString(R));
    
}
}
}
