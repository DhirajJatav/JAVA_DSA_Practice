package Two_Pointer;
public class kadensAlgo {
    public static void main(String[] args) {
        
    }
    // here if sum<0 make sum=0 because there is no need to take negative sum
    // if sum>0 take

    static int SubArraySum(int [] nums){

        int maxSum = Integer.MIN_VALUE ;// to cover the value from -2147...
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum =sum+nums[i];
          

            maxSum =Math.max(maxSum, sum);
              if(maxSum<sum){
                maxSum=sum;
            }
        }
      
        return maxSum;
    }
}
