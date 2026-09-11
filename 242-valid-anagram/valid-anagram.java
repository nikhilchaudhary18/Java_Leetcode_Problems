class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] checks = s.toCharArray();
        char[] checkt = t.toCharArray();
        Arrays.sort(checks);
        Arrays.sort(checkt);
        
        // if(Arrays.equals(checks,checkt)){
        //     return true;
        // } else
        // return false;
        for(int i=0;i<checks.length;i++){
            if(checks[i]!=checkt[i])
                return false;
        } return true;
        
    }
}