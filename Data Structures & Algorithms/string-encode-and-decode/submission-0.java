class Solution {

   public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()+"#"+str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // Step 1: read length (until '#')
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            // Step 2: move past '#'
            j++;

            // Step 3: extract the word of given length
            String word = str.substring(j, j + length);
            result.add(word);

            // Step 4: move pointer to next segment
            i = j + length;
        }

        return result;
    }
}
