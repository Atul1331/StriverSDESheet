// QUESTION LINK 

/*  leetcode.com/problems/sort-colors  */

class Solution {

    public void sortColors(int[] nums) {

        int[] counter = new int[3];

        for(int n : nums)

            counter[n]++ ;

        

        int k = 0;

        for(int i=0; i< nums.length; i++){

            if(i==counter[0]) k++ ;

            if(i==(counter[0]+counter[1])) k++ ;

            nums[i]=k;

        }

    

    }

}
