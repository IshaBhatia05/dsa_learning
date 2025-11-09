import java.util.ArrayList;
import java.util.List;

public class duplicate_number {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};//{4, 3, 4, 3, 8, 2, 3, 1};
        int ans = findDuplicate(nums);
        System.out.println(ans);

    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    missing_number.swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }

        return -1;
    }
}
