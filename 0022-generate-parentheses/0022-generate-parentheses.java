class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        generateParanthesis(ans,0,0,n,"");
        return ans;
    }

    public void generateParanthesis(List<String> ans , Integer start, Integer end, Integer length, String sol){

        if(start + end == 2*length){
            if(start == end){
                ans.add(sol);
                System.out.println(sol);
            }
            return;
        }

        generateParanthesis(ans, start+1, end, length, sol+"(");

        if(start > end){
            generateParanthesis(ans, start, end+1, length, sol+")");
        }
    }
}