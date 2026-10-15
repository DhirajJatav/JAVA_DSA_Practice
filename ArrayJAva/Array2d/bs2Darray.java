package Array2d;

import java.util.Arrays;

public class bs2Darray {
 public static void main(String[] args) {
    
    int [][] array={
    {10,20,30,40},
    {50,60,70,80},
    {90,100,110,120}
    };
    int target =10;
    System.out.println("target = "+target);
    System.out.println(Arrays.toString(binarySearch(array, target)));


 }   
 public static int[] binarySearch(int [][] matrix,int target){
    int r = 0;
    int c = matrix.length-1;
    while(r<matrix.length && c>=0){
        if(matrix[r][c]==target){
            return new int[] {r,c};
        }
        if(target>matrix[r][c]){
            r++;
        }
        else{
            c--;
        }
    }

    
    return  new int[] {-1,-1};// i made mistake forget new keyword
 }
}

