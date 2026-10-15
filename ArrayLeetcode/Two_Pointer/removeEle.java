package Two_Pointer;
// if i have val =3 arr ={3,1,2,3,4} 
// remove val and make {1,2,4 ,,,} remaing no matter
public class removeEle {
    
    public static void main(String[] args) {
        int [] nums={3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    static int removeElement(int nums[] ,int val){
      
        int j =0; // this pointer is for the index excluding val
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        
        

        return j;
    }
}
