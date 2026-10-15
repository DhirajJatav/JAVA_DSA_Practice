package CyclicSort;

import java.util.Arrays;

public class cyclicSort {
    
    public static void main(String [] args){
        System.out.println("hello");
        int [] numbers={3,5,2,1,4};
          cyclicSort(numbers);
          System.out.println(Arrays.toString(numbers));

        
    }

    static void cyclicSort(int [] nums){

        int i=0;
        while (i<nums.length) {
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }

        }



    }
    static void swap(int [] nums,int i,int correctIndex){
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }

}
