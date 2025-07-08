// Leetcode 46
class Solution {
    
    public void backtracking(List<List<Integer>> ans,ArrayList<Integer> permutations, int[] nums ){
        if(permutations.size()==nums.length){
            ans.add(new ArrayList<Integer>(permutations));
            return;
        }
        for(int i=0 ; i<nums.length ; i++){
            if(permutations.contains(nums[i])) continue;
            // becoz permuations me repeat nhi hota element and constrainsty me bhi distinct de rakha

            permutations.add(nums[i]);
            backtracking(ans, permutations, nums);
            permutations.remove(permutations.size()-1);
            // last element remove to back track (array list is passed by ref)
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(ans, new ArrayList<>(),nums);
        return ans;
    }
}