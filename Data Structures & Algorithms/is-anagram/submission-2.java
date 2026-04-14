class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> ana1 = new HashMap<Character, Integer>();
        Map<Character, Integer> ana2 = new HashMap<Character, Integer>();
        for(int i =0; i < s.length() ; i++) {
            Character ch = s.charAt(i);
            Integer val = 1;
            if(ana1.containsKey(ch)) {
               val = ana1.get(ch);
                ana1.put(ch,++val);
            }
            else {
                ana1.put(ch,val);
            }
        }
        for(int i =0; i < t.length() ; i++) {
            Character ch = t.charAt(i);
            Integer val = 1;
            if(ana2.containsKey(ch)) {
                val = ana2.get(ch);
                ana2.put(ch,++val);
            }
            else {
                ana2.put(ch,val);
            }
        }
        for (Map.Entry<Character, Integer> entry : ana1.entrySet()) {
            if(!ana2.containsKey(entry.getKey()) || !ana2.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry : ana2.entrySet()) {
            if(!ana1.containsKey(entry.getKey()) || !ana1.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
            
    }
}
