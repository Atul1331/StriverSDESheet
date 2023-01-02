// QUESTION LINK

/*  https://leetcode.com/problems/single-element-in-a-sorted-array/  */


class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }


        int i =0;
        int j = nums.length-1;
        while(i <= j){
            if(i == j){
                return nums[i];
            }

            if(j-i == 2){
                if(nums[i] == nums[i+1])
                    return nums[j];
                return nums[i];
            }

            int mid = (i+j)/2 ;
            if(nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]){
                return nums[mid];
            }
            else if(nums[mid] == nums[mid-1]){
                if((i+mid-2)%2 == 0){
                    j = mid-2;
                }
                else{
                    i = mid+1;
                }
            }
            else if(nums[mid] == nums[mid+1]){
                if((j-(mid+1))%2 == 0){
                    j = mid-1;
                }
                else{
                    i = mid+2;
                }
            }
        }
        return 0;
    }
}
