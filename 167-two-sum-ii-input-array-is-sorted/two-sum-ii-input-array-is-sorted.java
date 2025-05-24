class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> listColl = new HashMap<>();
        int[] sol = new int[2];

        for(int i=0; i<numbers.length ; i++){
            Integer diff = target - numbers[i];
            if(listColl.keySet().contains(diff)) { 
                sol[0] = listColl.get(diff)+1;
                sol[1] = i+1; 
                break;
            };

            listColl.put(numbers[i],i);
        }
        return sol;
    }
}