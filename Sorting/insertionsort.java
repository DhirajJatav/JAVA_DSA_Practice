import java.lang.reflect.Array;

public class insertionsort {
    public static void main(String[] args){
        int [] array={12,6,7,19};
      int [] result=insertionSort(array);
        
        
    }

    static void insertionSort(int nums[]){
        // this algorithm sort till i+1 for sort till last n-2 because i=n-1 
        for (int i = 0; i < nums.length-2; i++) {
            for(int j=i+1;j>0;j--){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }// else no need to check
                else{
                    break;
                }
            }
        }
    }
}
