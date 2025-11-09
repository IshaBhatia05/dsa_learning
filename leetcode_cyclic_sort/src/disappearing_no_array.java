import java.util.ArrayList;
import java.util.List;

public class disappearing_no_array {
public static void main(String[] args){
    int[] nums = {4,3,2,7,8,2,3,1};
    List<Integer> ans=findDisappearedNumbers(nums);
System.out.println(ans);

}
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    int i=0;
    while(i<nums.length){
        int correct=nums[i]-1;
        if( nums[i]!=nums[correct]){
            missing_number.swap(nums,i,correct);
        }else{i++;}
    }//find missing no.
    List<Integer> ans=new ArrayList<Integer>();
    for(int index=0;index<nums.length;index++){
        if(nums[index]!=index+1){
            ans.add(index+1);
        }
    }
        return ans;
    }
}
