class Solution {
    public void moveZeroes(int[] arr) {
        int noz =0;
        for(int num : arr) {
            noz++;
        }
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // int n = nums.length;
        // int j = 0;
        // for(int i=0;i<n;i++){
        //    if(nums[i]!=0){
        //     int temp = nums[i];
        //     nums[i]=nums[j];
        //     nums[j]=temp;
        //     j++;
        //    }
        // }

    }
}