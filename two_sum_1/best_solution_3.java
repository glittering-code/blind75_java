//problem link : https://leetcode.com/problems/two-sum/
//solution link : https://leetcode.com/problems/two-sum/submissions/930512304/
// the difference between this solution and last solution is that in the last solution, we were adding all array elements to hash
// to handle duplicity, we kept a hash of value vs list of indices but we don't need to populate entire hash. just keep checking if target-current value exist in hash.
// it will automatically take care of duplicity
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; ++i) {
            int f = target - nums[i];
            if(h.containsKey(f) == true) {
                ans[0] = i;
                ans[1] = h.get(f);
                return ans ;
            } else {
                h.put(nums[i],i);
            }
        }
        return ans;
    }
}
