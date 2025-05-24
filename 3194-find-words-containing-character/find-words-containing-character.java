class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> sol = new ArrayList<>();
        if(words.length==0) return sol;
        for(int i = 0; i < words.length ;i++){
            String word = words[i];
            if( wordContain(word,x) ) sol.add(i);
        }
        return sol;
    }

    public boolean wordContain(String word, char x){
        for(int i=0; i<word.length() ;i++){
            if(x==word.charAt(i)) return true;
        }
        return false;
    }
}