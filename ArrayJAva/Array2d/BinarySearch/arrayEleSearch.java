package Array2d.BinarySearch;

import java.util.Scanner;

public class arrayEleSearch {
    // suppose we have sorted array may be ascending or desen
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};

        System.out.println("Enter target element");
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        // i wrote half linear search
        // int middleEleIndex=array.length/2;
        // System.out.println(binarySearch(array, target, middleEleIndex));

        // by learning correc
        System.out.println(binarysearch(array, target));
    

    }
    // method for binary search but i wrote half linear search by me 
    public static int binarySearch(int [] array,int target,int midIndex){
        // if elem<array.lenght/2 or ele>middle or ele==target  
        if(target==array[midIndex]){
             return midIndex;
        }
        else if(target>array[midIndex]){
            for (int i = midIndex+1; i < array.length; i++) {
                if(target==array[i]){
                    System.out.println("Found at index =");
                    return i;
                }
            }
            }

          else if(target<array[midIndex]){
            for (int i = midIndex-1; i>=0 ; i--) {
                if(target==array[i])
               { System.out.println("found before half size od array");
                return i;}
     
            }
          }  
        
        return-1;
    }

    // method by learning 
    public static int binarysearch(int [] array,int target){
        // here i am using the while loop because for loop run for finite size 
        // while run upto searching and if not till last not found will give
        int start=0; //first index
        int end=array.length-1;
        //int mid=(start+end)/2; //but we dont use because if size 10000000000 it is huge number
        // integer cannot store of it 
        // therefore we use 
        // array={1,2,4,5,6,7,8,9}=7/2
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>array[mid]){
                start=mid+1;//right half of array
            }
            else if(target<array[mid]){// left half of array
                end=mid-1;
            }
            else{
                return mid;// means if not bigger or not less means mid=target 
            }
        }

        return -1;
    }
}
