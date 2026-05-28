class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i),0)+1);
        }
        int need = t.length();
        int minSize = Integer.MAX_VALUE;
        int st = 0;
        int l=0;
        for(int r=0; r<s.length(); r++){
            char right = s.charAt(r);
            if(freq.containsKey(right)){
                if(freq.get(right)>0){
                    need--;
                }
                freq.put(right, freq.get(right)-1);
            }

            while(need == 0){
                
                if(r-l+1<minSize){
                    minSize = r-l+1;
                    st=l;
                }
                char left = s.charAt(l);
                if(freq.containsKey(left)){
                    freq.put(left, freq.get(left)+1);
                    if(freq.get(left)>0){
                        need++;
                    }
                    
                   
                }
                l++;
            }

        }
        return minSize == Integer.MAX_VALUE ?"":s.substring(st, st+minSize);
        
        
    }
}
