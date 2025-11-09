import java.util.Arrays;

public class missing_number {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};//{9,6,4,2,3,5,7,0,1};

        System.out.println(missing_no(arr));
    }
    public static int missing_no(int[] nums){
        int i = 0;int len=nums.length;

        while (i < len) {
            int correct = nums[i];//index of element in cyclic sort = value as we are starting from 0
            if (nums[i]< len && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else{
            i++;}

        }
        //search for first missing no,
        for(int index =0;index<len;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        //case 2
        return len;
        }
        public static void swap(int[] arr, int first, int second) {
          //  if (arr[first] < arr[second]) {
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;

         //   }
        }
    }