// QUESTION LINK 

/*  https://leetcode.com/problems/maximum-subarray/  */

class Solution {

    public int maxSubArray(int[] nums) {

        int sum = nums[0];

        int x=sum, y=0;

        if(nums.length < 2)

            return sum;

        for(int i=1; i<nums.length; i++){

            x = x + nums[i];

            y = nums[i];

            if(y > x)

                x = y;

            if(x > sum)

                sum = x;

        }

        return sum;

    }

}
