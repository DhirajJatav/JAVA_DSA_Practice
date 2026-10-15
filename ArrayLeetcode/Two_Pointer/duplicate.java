package Two_Pointer;
public class duplicate{
    public static void main(String [] args){
        System.out.print("hello");
        int [] nums={1,1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int k=1; // k is he unique number inside the array
        // k is the index for the next unique elem

        

        for (int i = 0; i < nums.length-1; i++) {// i is the searcher
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                k++;
            }
        
        }



        return k;
    }
}