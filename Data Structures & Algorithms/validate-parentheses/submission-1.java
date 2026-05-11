class Solution {
    public boolean isValid(String s) {
        Deque<Character> track = new ArrayDeque<>();

        for(Character c: s.toCharArray()){
            if(c.equals('(') || c.equals('{') || c.equals('[')){
                track.push(c);
            }else{
                if(c.equals(')')){
                    if(track.isEmpty()) return false;

                    if(!track.poll().equals('(')) return false;
                }else if(c.equals('}')){
                    if(track.isEmpty()) return false;

                    if(!track.poll().equals('{')) return false;
                }else if(c.equals(']')){
                    if(track.isEmpty()) return false;

                    if(!track.poll().equals('[')) return false;
                }
            }
        }
        return track.isEmpty();
        
    }
}
