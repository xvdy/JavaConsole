import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WangYi0910 {
    public static void run() {
        int[] nums = {1, 2, 3, 4};
        int result = getCount(nums);
        System.out.println(result);
    }

    public static int getCount(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> choiceCount = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            choiceCount.add(nums[i] - i);
        }
        Integer resultCount = 1;
        for (Integer i : choiceCount) {
            resultCount *= i;
        }
        return resultCount;
    }
}
