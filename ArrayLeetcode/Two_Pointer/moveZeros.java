package Two_Pointer;
// i did best but i wan not capable to maintain order there next solution see
import java.util.Arrays;

public class moveZeros {
    
    public static void main(String[] args) {
      // Input: nums = [0,1,0,3,12]
      //Output: [1,3,12,0,0] 
      int [] nums ={0,1,0,3,12};
      moveZeroes(nums);
      System.out.println(Arrays.toString(nums));

    }

    static  void moveZeroes(int[] nums) {
        int l =0;
        int r=nums.length-1;

        while(l<r){
            if(nums[l]==0 && nums[r]!=0){
                int temp = nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
            if(nums[l]!=0){
                l++;
            }
            if(nums[r]==0){
                r--;
            }

        }
    }

    
}
