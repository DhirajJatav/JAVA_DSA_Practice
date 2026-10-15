package Array2d;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
    public static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       
    //    int[] nums = new int[10];
    //     System.out.println("Enter number to array");
    //     addNum(nums);
    //    // printArray(nums);
    //      var maxElement=0;
    //      var resultMax=maxElem(nums, maxElement);
    //      System.out.println("Maximux Elemenet ="+resultMax);

    //      // let 
    //      var minElement=nums[0];

    //      System.out.println("Smallest element in array");
    //      System.out.println(minEle(nums, minElement));


    // for reverse an array
    int [] array={1,2,3,4,5,11,6,7,8,9,10};
    reverseArray(array);
    //printArray(array);
    System.out.println(Arrays.toString(array));
   

    }
 // method to take input in an array
    public static void addNum(int[] nums){
   for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
    }

    // method to print an array
    public static void printArray(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // Method to find maximum element from array
    public static int maxElem(int []num,int maxElement){
        for (int i = 0; i < num.length; i++) {
            if(num[i]>maxElement){
                maxElement=num[i];
            }
        }
        return maxElement ;
    }
    // Method to find mininum number inside array
    public static int minEle(int num[],int minElement){
        for (int i = 0; i < num.length; i++) {
            if(num[i]<minElement){
                minElement=num[i];
            }
        }
        return minElement;
    }


    // method to reverse an array
    public static void reverseArray(int num[]){
        var firstIndex=0;
        var lastIndex=num.length-1;
        // in case of even lenght loop will run length/2 because at single time
        // it will swap two element
        for (int i = 0; i < num.length/2; i++) {
            // we have need to swap and decrease or increase indexex according to our purpose
            int tem=num[firstIndex];
            num[firstIndex]=num[lastIndex];
            num[lastIndex]=tem;
            firstIndex++; // to go for next element
            lastIndex--; // to reach previous index
        }
    }

}