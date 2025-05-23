class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> containElements = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(containElements.contains(nums[i])) return true;
            containElements.add(nums[i]);
        }
        return false;
    }
}