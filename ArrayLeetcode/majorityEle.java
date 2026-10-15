public class majorityEle {
    public static void main(String[] args) {
        
    int [] nums={1,1,1,1,4,4,4,4,4,4,4,2,7,4};
    System.out.println(majorityEle(nums));



    }
    // i have to print majority element means the element
    // which appears more than the length/2 of the array
    static int majorityEle(int []nums){
        int n=nums.length/2;// this the condition atleast appears that number

        for (int i = 0; i < nums.length-1; i++) {
            int count=0;
            for (int j = 1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

                if(count>n){
                    return nums[i];
                }
            }
        }
        return -1;

    }


}