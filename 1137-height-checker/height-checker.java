class Solution {
    public int heightChecker(int[] arr) {
        int sorted [] = arr.clone();
        Arrays.sort(sorted);
        int wrongIdx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=sorted[i]){
                wrongIdx++;
            }
        }
        return wrongIdx;
    }
}