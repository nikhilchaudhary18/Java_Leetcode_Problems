class Solution {
    public int compress(char[] arr) {
        int i=0;
        int j=0;
        String ans = "";
        while(j<arr.length){
            if(arr[j]==arr[i]) j++;
            else{
                ans+=arr[i];
                int length = j-i;
                if (length>1) ans+=length;
                i=j;
            }
        }
        ans+=arr[i];
            int length = j-i;
            if (length>1) ans+=length;
            for(i=0;i<ans.length();i++){
                arr[i] =ans.charAt(i);
            }
        return ans.length();
    }
}