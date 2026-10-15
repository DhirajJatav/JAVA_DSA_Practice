public class bubbleSort{

public static void main(String[] args) {
    int [] nums={10,400,30,20,50};
    //System.out.println(nums[3]);
    bubbleSort(nums);
    for (int i : nums) {
        System.out.println(i);
    }



}

    public static void bubbleSort(int [] nums){
       for(int i=0;i<nums.length-1;i++){
        for(int j=0;j<nums.length-1-i;j++){//len-1-i because at each pass it arramge the,from decre order from last
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
       }
    }

}