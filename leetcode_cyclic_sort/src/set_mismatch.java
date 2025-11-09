import java.util.Arrays;

public class set_mismatch {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};//{9,6,4,2,3,5,7,0,1};
        int[] ans=findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if( nums[i]!=nums[correct]){
                missing_number.swap(nums,i,correct);
            }else{i++;}
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};


    }


}
