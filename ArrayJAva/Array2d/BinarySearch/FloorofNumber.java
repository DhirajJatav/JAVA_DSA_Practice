package Array2d.BinarySearch;

public class FloorofNumber {

    public static void main(String[] args) {
        int [] nums={1,2,4,5,7,8,25,28};
        // i am findinf ele ==target or greater but smaller then target
        // eg if target=2 return index of 2 means 1
        // but if target =9 then 8 or target6 return 5
        // just it opposie of ceiling
        //int target=6;
        int target=3;
       int result= FloorOfNum(nums, target);
       System.out.println(result);
    }

    public static int FloorOfNum(int [] array,int target){
        int start=0;
        int end=array.length-1; // last index of an array
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }

            if(target>array[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return end;
    }
}