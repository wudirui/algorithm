package test2;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *  
 * 提示：
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoNumSum {

    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15};
        int[] nums = {3, 3};
        int[] target = findTarget(nums, 6);
        for (int i : target) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static int[] findTarget(int[] nums, int target) {
        int length = nums.length;
        int[] tag = new int[2];
        if (length >= 2 && length <= 103) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < length; i++) {
                int tmp = target - nums[i];
                if (map.containsKey(tmp) && map.get(tmp) != i) {
                    tag[0] = i;
                    tag[1] = map.get(tmp);
                    return tag;
                }
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
