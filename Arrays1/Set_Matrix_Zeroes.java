// QUESTION LINK

/*  https://leetcode.com/problems/set-matrix-zeroes/  */

class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int r0 = 1 , c0 = 1;
        for(int i =0; i<m; i++){
            if(arr[0][i] == 0){
                r0 = 0;
                break;
            }
        }

        for(int i =0; i<n; i++){
            if(arr[i][0] == 0){
                c0 = 0;
                break;
            }
        }

        for(int i=n-1; i>0; i--){
            for(int j = m-1; j> 0; j--){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        for(int i=1; i < n; i++){
            if(arr[i][0] == 0){
                for(int j=0; j<m; j++){
                    arr[i][j] = 0;
                }
            }

        }

        for(int i=0; i < m; i++){
            if(arr[0][i] == 0){
                for(int j=0; j<n; j++){
                    arr[j][i] = 0;
                }
            }

        }

        if(r0 == 0){
            for(int i=0; i<m; i++){
                arr[0][i] =0;
            }
        }

        if(c0 == 0){
            for(int i=0; i<n; i++){
                arr[i][0] =0;
            }
        }
    }
}
