//problem link : https://leetcode.com/problems/two-sum/description/
// solution link : https://leetcode.com/problems/two-sum/submissions/928359099/
// time complexity = O(n)
// Space complexity = O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
       HashMap<Integer, List<Integer>> h = new HashMap<Integer, List<Integer>>();

        for(int i = 0 ; i < nums.length ; ++i) {
            if(h.containsKey(nums[i]) == true) {
                List<Integer> l = h.get(nums[i]);
                l.add(i);
                h.put(nums[i],l);
            } else {
                List<Integer> l = new ArrayList<Integer>();
                l.add(i);
                h.put(nums[i],l);
            }
        }
        
        for(int i = 0 ; i < nums.length ; ++i) {

            if(h.containsKey(target-nums[i]) == true) {
                
                List<Integer> l = h.get(target-nums[i]);
                if(l.size() == 1) {
                    if(l.get(0) != i) {
                        ans[0] = i;
                        ans[1] = l.get(0);
                        break;    
                    }
                } else {
                    ans[0] = l.get(0);
                    ans[1] = l.get(1);
                    break;
                }
                
            }
        }
        return ans;
    }
}
