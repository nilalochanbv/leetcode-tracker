// Last updated: 7/9/2026, 9:49:03 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}