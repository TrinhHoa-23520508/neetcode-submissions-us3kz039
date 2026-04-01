

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> char_o_s = new HashMap<>();
        HashMap<Character, Integer> char_o_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (char_o_s.containsKey(s.charAt(i))) continue;

            int amount = 1;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) amount++;
            }

            char_o_s.put(s.charAt(i), amount);
        }

        for (int i = 0; i < t.length(); i++) {

            if (char_o_t.containsKey(t.charAt(i))) continue;

            int amount = 1;

            for (int j = i + 1; j < t.length(); j++) {
                if (t.charAt(j) == t.charAt(i)) amount++;
            }

            char_o_t.put(t.charAt(i), amount);
        }

        for (char key : char_o_s.keySet()) {
            if (!char_o_t.containsKey(key)) return false;
            if (!char_o_s.get(key).equals(char_o_t.get(key))) return false;
        }

        return true;
    }
}