// problem link : https://leetcode.com/problems/contains-duplicate/description/
// solution link : https://leetcode.com/problems/contains-duplicate/submissions/930037347/
// time complexity : O(n)
// Space complexity : O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set<Integer> s = new HashSet<Integer>();
     for(int i = 0 ; i < nums.length ; ++i) {
         if(s.contains(nums[i]) == true)
            return true;
        else {
            s.add(nums[i]);
        }
     }
     return false;   
    }
}
