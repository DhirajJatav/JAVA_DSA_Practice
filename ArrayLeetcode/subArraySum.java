import java.util.ArrayList;
// imp it is not optimise solution therefore kadanes algorithmis the solution for it

public class subArraySum {
    // here i am trying to print the subarray which gives maximum sum

    public static void main(String[] args) {
    int [] nums;
    nums= new int[] {1,2,5,6,9,-90};
       
       // System.out.println(printSumArray(nums));
       System.out.println(subArrayOfArray(nums));
        
    } 
    // i have to write the code to find sub array   
    static int subArrayOfArray(int [] nums){
        if(nums.length==1){
            return nums[0];
        }
        // outer loop for starting index
        // here i am suposing max sum=0;
        int maxSumOfSubArray=Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            // inner loop for the last index
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                // this is to make an array
                // here i am intializing sum of sub array=0
                sum=sum+nums[j];
               
             maxSumOfSubArray=Math.max(maxSumOfSubArray, sum);

            }
            
                
        }
        return maxSumOfSubArray;
    }

    // here i am writing the function to print the sum of an array
    // static int printSumArray(int [] nums){
        
    //     int totalSum=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         totalSum =nums[i]+totalSum;
    //     }

    //     return totalSum;

    // }

}
