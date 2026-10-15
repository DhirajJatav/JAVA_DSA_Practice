import java.util.Arrays;

public class twoSum {
// here i am writng code for 
// two find the element whose some become == target (two element )// 
// repetition not alowed like 1+1+1 .... because it make everything
    public static void main(String[] args) {
        int [] array ={1,2,5,5,6,7};
     //   int [] num;
     //   num = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum(array, 10)));
       
       
    }

    static int[] twoSum(int[] nums,int target){

        int []ans ={-1,-1};

        // now for first element i will use outside loop
        
        for (int i = 0; i < nums.length-1; i++) {
            // i only go till i<lenght -1 becuase(when i =second last j will be last )
            // for second number i have to check the next element
            for (int j = 1; j < nums.length; j++) {// j start from because repetion not allow
                if(nums[i]+nums[j]==target && i!=j){// i!=j because when we have 2 5 5 targ=10 and
                    // i=1 and j=1 both will point same element they will give one index
                    ans[0] =i;
                    ans[1] =j;
                    return ans;
                }
                
            }
        }
        return ans;

    }



}