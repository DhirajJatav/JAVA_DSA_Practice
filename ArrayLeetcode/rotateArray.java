import java.util.Arrays;

public class rotateArray {
// steps for it reverse entire array [7,6,,,,,,,,1]
// step2 reverse till k-1 [5674321]
// step 3 k to last [5671234]
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

//     // rotate array from a key
//     Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
    static  void rotate(int[] nums, int k) {
        // here i am writing k = k%nums.length because
        // if k =12 and legth 5 then 10 will do nothing because remainder 0 only two will do
        // small eg k=7 length=5 k%l = 2 now two will change remaining 5 not they will make array as before
        // 1st [51234] 2nd [451223]... till 5 [12345] now only two will change[51234] 2nd[45123]
        k =k%nums.length;
        swap(nums, 0, nums.length-1);
        swap(nums, 0, k-1);
        swap(nums, k, nums.length-1);
        
        
    }
    static void swap(int[] nums,int start ,int end){
        
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
