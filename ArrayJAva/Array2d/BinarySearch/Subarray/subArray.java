package Array2d.BinarySearch.Subarray;
// sub array means the contiguos element of the array
// here i am writing code to print sub arrays

public class subArray {
    
    public static void main(String[] args) {
        int [] nums;
        nums = new int[] {1,2,3,4};
        printSubarray(nums);
    }

    static void printSubarray(int []nums){
        // first loop for start index
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = i; j < nums.length; j++) {// this loop is for end index 
                
                for (int k = i; k<=j; k++) {// this is to enter the ele in the array
                    System.out.print(nums[k]+"");
                }
                System.out.println();
                count++;
            }
            System.out.println();
          
        }
          System.out.println(count);

    }

}
