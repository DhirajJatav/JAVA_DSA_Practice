package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class SolutionSecond {
    public static void main(String[] args) {
        int [] nums={1,4,5,6,4,4};
        System.out.println(findDis(nums));
    }

    static List<Integer> findDis(int [] nums){
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
     static void cyclicSort(int [] nums){

        int i=0;
        while (i<nums.length) {
            int correctIndex=nums[i+1];
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
