public class containsDuplicate {
    public static void main(String[] args) {
        
        int nums[];
        nums = new int[] {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                
                if(nums[i]==nums[j] && i!=j){
                    return true;
                }
            }
        }
        return  false;

    }
}
