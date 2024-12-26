class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while(first <= last){
            int mid = last - first/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= nums[first] && nums[mid] > nums[last]){
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }
        return -1;
    }
}