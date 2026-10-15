package CyclicSort;

public class DuplicateNumber{

    public static void main (String [] args){
        int [] array={1,2,2,3,4};

        System.out.println("hello");
        System.out.println(duplicateNumber(array));
    }
    static int duplicateNumber(int [] nums){
        cyclicSort(nums);

        for (int i = 0; i <nums.length; i++) {
            if(nums[i]!=i+1){
                return nums[i];
            }
        }

        return -1;
    }

    static void cyclicSort(int [] nums){

        int i=0;
        while (i<nums.length) {
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }

        }

    }
     static void swap(int [] nums,int i,int correctIndex){
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }

}