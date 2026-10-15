package CyclicSort;

/**
 * Solution
 */
public class Solution {
    public static void main(String[] args) {
        int [] nums={0,1,3,5,4};
        System.out.println(missingNumber(nums));


    }
  static void cyclicSort(int [] nums){

        int i=0;
        while (i<nums.length) {
            int correctIndex=nums[i];
            if(nums[i]<nums.length &&nums[i]!=nums[correctIndex]){
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

    static int missingNumber(int [] nums){
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}