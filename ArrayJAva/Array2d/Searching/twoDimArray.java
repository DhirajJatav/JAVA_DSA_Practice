package Array2d.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class twoDimArray {
    
public static void main(String[] args) {
    int [][] array={
        {1000000000,5,6,9},
        {0,12,4,6,6},
        {90,70,80,65,89,888999}
    };

   // System.out.println(array[0][2]);
   //System.out.println(Arrays.toString(array));// out =[[I@7ad041f3, [I@251a69d7, [I@7344699f]
   Scanner sc = new Scanner(System.in);
  // System.out.println("Enter what you want to see in 2d array");
   //int target=sc.nextInt();
  // int [] result=(LinearSearch(array, target));
   //System.out.println("row= "+result[0]+" column= "+result[1]);// i am priting by index

   // print directly
   //System.out.println(Arrays.toString(result));

   //Practice max element in 2d
   int eleMax=MaxEle(array);
   System.out.println("maximum element = "+eleMax);



}
// For search
    public static  int [] LinearSearch(int [][] array,int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==target){

                   return new int [] {i,j};
                }
            }
        }
        return  new int []{-1,-1};
    }

    public static int MaxEle(int [][] array){
        int maxELement=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(maxELement<array[i][j]){
            maxELement=array[i][j];
                }
            }
        }
        return maxELement;
    }

}
