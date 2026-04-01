class Solution {

    public boolean isAnagrams(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> count_s = new HashMap<>();
        HashMap<Character, Integer> count_t = new HashMap<>();

        for(int i  = 0; i < s.length(); i++){
            char c_s = s.charAt(i);
            char c_t = t.charAt(i);

            count_s.put(c_s, count_s.getOrDefault(c_s, 0)+1);
            count_t.put(c_t, count_t.getOrDefault(c_t, 0)+1);
        }

        return count_s.equals(count_t);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        HashSet<Integer> index = new HashSet<>();

        for(int i = 0; i < strs.length; i++){

            if(index.contains(i)) continue;

            List<String> group_anagrams = new ArrayList<>();
            group_anagrams.add(strs[i]);

            for(int j = i + 1; j < strs.length; j++){
                if(isAnagrams(strs[i], strs[j])){
                    group_anagrams.add(strs[j]);
                    index.add(j);
                } 
            }

            result.add(group_anagrams);
        }

        return result;
    }
}
