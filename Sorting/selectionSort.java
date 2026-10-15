public class selectionSort {
    public static void main(String[] args) {
        int [] nums={1,3,5,6,99,70,45};
        selectionSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }

    }
    public static void selectionSort(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            // l-1 because last element will automatically sorted
            int smallIndex=i;
            for (int j = i+1; j < nums.length; j++) {//i+1 previd on roght index
                // now for finding the smallest element
                if(nums[smallIndex]>nums[j]){
                    smallIndex=j;
                }
                
            }

            // now swapping
            int temp=nums[i];
            nums[i]=nums[smallIndex];
            nums[smallIndex]=temp;
        }
    }
}
