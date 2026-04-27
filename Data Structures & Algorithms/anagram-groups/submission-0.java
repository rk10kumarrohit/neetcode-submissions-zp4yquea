class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> listMap = new HashMap<>();

        for (String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            listMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(listMap.values());
    }   
}
