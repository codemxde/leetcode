// Link to leetcode poblem
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

import java.util.HashMap;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        int N = nums.length;

        HashMap<Integer, Integer> hMap = new HashMap<>();

        int index = 0;
        for (int i = 0; i < N; i++) {
            int ele = nums[i];
            if (!hMap.containsValue(ele)) {
                hMap.put(index, ele);
                index++;
            }
        }

        int k = hMap.size();

        for (int i = 0; i < k; i++) {
            int ele = hMap.get(i);
            nums[i] = ele;
        }

        return k;
    }

    public static void main(String[] args) {
        System.out.println("Number of unique elements: " + removeDuplicates(new int[] { 1, 1, 2 }));
    }

}
