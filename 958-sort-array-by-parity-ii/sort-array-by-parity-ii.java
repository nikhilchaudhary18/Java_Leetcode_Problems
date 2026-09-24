class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int even = 0;
        int odd = 1;
        while(even < arr.length && odd < arr.length){
            if(arr[even] %2 == 0){
                even+=2;
            }
            else if(arr[odd] %2 != 0){
                odd+=2;
            }
            else{
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;

                even += 2;
                odd += 2;
            }
        }
        return arr;
    }
}