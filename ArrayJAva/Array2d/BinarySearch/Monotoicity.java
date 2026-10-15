package Array2d.BinarySearch;

public class Monotoicity {
   public static void main(String[] args) {
     // whether array is sorted or not
    int [] array={1,2,3,4,56 ,67,5,6,7};
    System.out.println(isMonotonic(array));

   }
// mtthod to check
   public static Boolean isMonotonic(int nums[]){
    int last =nums.length-1;
    // wrong approach
   
    // for (int i = 0; i < last-1; i++) {// i= first 
    //      Boolean result= null;
    //     if(nums[i]<nums[last]){
    //        result=true; 
    //        return result;
    //     }
    // }
     
    

    return false;// not sure
   }
    
}
