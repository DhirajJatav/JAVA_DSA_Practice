package Array2d.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
         // here i am tring to found the target element
    int [] arr={12,54,6,7,8,9};
    System.out.println("Enter which you want to find =");
    Scanner sc = new Scanner(System.in);
    int target=sc.nextInt();

    // calling method for search
   
   // System.out.println( findTarget(arr, target));
    // by enhanced for loops
    var ans=linearsearch2(arr, target);
    System.out.println(ans);
    }










   // method for linear search
   public static int findTarget(int [] arr,int target){
    for (int index = 0; index < arr.length; index++) {
        if(target==arr[index]){
            System.out.println("Element found at index = ");
            return index;
        }
    }
    System.out.println("not found");
    return-1;
   }
   // through enhanced for loop
  public static int linearsearch2(int[]num,int target) {
    for (int ele : num) {
        if(ele==target){
            System.out.println("element found ");
            return ele;
        }
    }
    return-1;
  }


  // 
}