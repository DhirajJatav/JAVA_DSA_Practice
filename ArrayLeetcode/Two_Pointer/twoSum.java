package Two_Pointer;
// revise from pdf if i got stuck
// prob num

import java.util.Arrays;

public class twoSum {
    
    public static void main(String[] args) {
        System.out.println("hello world");
        int [] nums;
        nums = new int[] {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    static int [] twoSum(int [] nums, int target){
        int left=0;
        int right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]>target){
                right--;// because we got the greater element
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
            else{
                return new int[] {left, right};
            }

        }
        return new int[] {-1,-1};

    }


}
