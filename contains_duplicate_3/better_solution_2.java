// problem link : https://leetcode.com/problems/contains-duplicate/description/
// solution link : https://leetcode.com/problems/contains-duplicate/submissions/930037347/
// time complexity : O(n)
// Space complexity : O(n)
// make an hash and keep adding array elements to it. if any element already exists in it, it means it is duplicate and you can simply return true from there
// complexity of searching in hashmap is O(1) in average case
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
