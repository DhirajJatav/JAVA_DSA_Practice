package Array2d.BinarySearch;
import java.util.Arrays;

import java.util.Scanner;

public class firstAndLastOcu {
    
    public static void main(String[] args) {
        int[] array={1,2,3,4,4,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which you want to find");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(occurenece(array, target)));
    }
    public static int[] occurenece(int [] array,int target){
        int []index={-1,-1};
         index[0]=firstAndLastOcu(array, target, true);
      index[1]=firstAndLastOcu(array, target, false);// means it will check
        return index;
    }
        public static int firstAndLastOcu(int [] array,int target,Boolean firstocurence){
        int start=0;
        int end=array.length-1; // last index of an array
        int ans=-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{
                ans =mid;
                // to check for first in left 
                if(firstocurence){
                    end=mid-1;// to make the condition false means i am making start >end
                }
                else{
                    start=mid+1;// for last occurenece in right side
                }
            }

        }
        return ans;
    }
}
