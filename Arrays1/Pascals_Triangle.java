// QUESTION LINK

/*  https://leetcode.com/problems/pascals-triangle/  */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        return genrows(list, numRows, 1);
    }

    public static List<List<Integer>> genrows(List<List<Integer>> list, int n, int k){
        if(k > n){
            return list;
        }

        list.add(new ArrayList<Integer>());
        if(k == 1){
            list.get(k-1).add(1);
        }
        else{
            for(int i=0; i<k; i++){
                if(i==0 || i==k-1){
                    list.get(k-1).add(1);
                }
                else{
                    list.get(k-1).add(list.get(k-2).get(i-1)+list.get(k-2).get(i));
                }
            }
        }
        genrows(list, n, k+1);
        return list;
    }
}
