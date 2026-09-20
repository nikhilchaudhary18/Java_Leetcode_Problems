class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rowMin = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            int rmin = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                rmin = Math.min(rmin,matrix[i][j]);
            }
            rowMin.add(rmin);
        }

        List<Integer> colMax = new ArrayList<>();
        for(int j=0;j<n;j++){
            int cmax = Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                cmax = Math.max(cmax,matrix[i][j]);
            }
            colMax.add(cmax);
        }

        List<Integer> luckyNumber = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==rowMin.get(i) && matrix[i][j]==colMax.get(j)){
                    luckyNumber.add(matrix[i][j]);
                }
            }
        }
        return luckyNumber;

    }
}