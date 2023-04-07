//problem link : https://leetcode.com/problems/two-sum/description/
//solution link : https://leetcode.com/problems/two-sum/submissions/928343409/
// time complexity = O(n^2)
// space complexity = O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
       // HashMap<> capitalCities = new HashMap<String, String>();

        for(int i = 0 ; i < nums.length ; ++i) {
            for(int j = i+1 ; j < nums.length ; ++j) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
