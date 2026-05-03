class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupMap = new HashMap<>();

        for(String s: strs){
            int[] freq = new int[26];
            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq);
            if(groupMap.containsKey(key)){
                groupMap.get(key).add(s);
            }else{
                groupMap.put(key, new ArrayList<>(List.of(s)));
            }
        }

        return groupMap.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
        
    }
}
