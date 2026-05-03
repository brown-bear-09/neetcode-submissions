class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqs = new int[26];
        int[] freqt = new int[26];

        for(char c : s.toCharArray()){
            freqs[c-'a']++;
        }

        for(char c : t.toCharArray()){
            freqt[c-'a']++;
        }

        return Arrays.equals(freqs, freqt);

    }
}

