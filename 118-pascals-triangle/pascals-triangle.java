class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>(); 
        
        if (numRows==0) return sol;

        List<Integer> last = new ArrayList<>();
        last.add(1);
        sol.add(last);

        for(int i=1; i<numRows; i++){
            List<Integer> prev_row = sol.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j=1; j<i; j++){
                currentRow.add(prev_row.get(j-1) + prev_row.get(j) );
            }

            currentRow.add(1);
            sol.add(currentRow);
        }

        return sol;
    }
}