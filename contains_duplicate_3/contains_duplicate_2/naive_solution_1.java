//problem link : https://leetcode.com/problems/contains-duplicate-ii/
//solution link : https://leetcode.com/problems/contains-duplicate-ii/submissions/930053719/
// time complexity = O(n^2)
// space complexity = O(1)
// solution not accepted on leetcode because of time complexity
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ; ++i) {
            for(int j = i+1; j < nums.length; ++j) {
                if(nums[i] == nums[j] && j-i <= k)
                    return true;
            }
        }
        return false;
    }
    
}
