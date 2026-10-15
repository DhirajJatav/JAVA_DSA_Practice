package Two_Pointer;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
//         Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

       int []nums ={0,1,0,3,12};
       moveZero(nums);
       System.out.println(Arrays.toString(nums));
    }

    static void moveZero(int [] nums){
       
        // most important way to solve this problem for interview

         int j=0;// this is to store the non zero elements to prevent the order
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i]!=0){
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

    }
}
