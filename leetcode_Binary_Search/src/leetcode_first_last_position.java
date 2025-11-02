import java.util.Arrays;

public class leetcode_first_last_position {
    public static void main(String[] args){
       int[] nums = {5,6,7,7,7,8,8,8,8,10};
       int target = 1;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums, int target,boolean firstIndex){
        int start =0;int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                //possible ans
                ans=mid;
                if(firstIndex){
                    end=mid-1;}
                else{
                    start=mid+1;
                }
            }

        }
        return ans;


    }

}
