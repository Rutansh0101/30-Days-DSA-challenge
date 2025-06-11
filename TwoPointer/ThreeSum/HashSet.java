class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1])   continue;
            int target = 0 - nums[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1; j < nums.length; j++){
                if(set.contains(target - nums[j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(target - nums[j]);
                    ans.add(list);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ansList = new ArrayList<>();
        for(List<Integer> list:ans){
            ansList.add(list);
        }
        return ansList;
    }
}