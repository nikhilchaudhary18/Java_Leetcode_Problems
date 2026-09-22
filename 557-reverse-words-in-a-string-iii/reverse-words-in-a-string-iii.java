class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            StringBuilder str = new StringBuilder(word);
            str.reverse();
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString().trim();
     }
}