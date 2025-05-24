class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ; i< nums.length; i++){
            int diff = target - nums[i];
            if( hm.keySet().contains(diff) ){
                sol[0] = hm.get(diff);
                sol[1] = i;
                break;
            }
            hm.put(nums[i],i);
        }
        return sol;    
    }
}