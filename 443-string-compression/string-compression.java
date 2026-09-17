class Solution {
    public int compress(char[] arr) {
        int i=0;
        int j=0;
        String str ="";
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                str+=arr[i];
                int len = j-i;
                if(len>1) str+=len;
                i=j;
            }
        }
        str+=arr[i];
        int len = j-i;
        if(len>1) str+=len;
        for(i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        return str.length();
    }
}