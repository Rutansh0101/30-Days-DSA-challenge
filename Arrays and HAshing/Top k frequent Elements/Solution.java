class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for(var i:map.keySet()){
            queue.add(i);
            if(queue.size() > k){
                queue.remove();
            }
        }

        int[] ans = new int[k];
        int index = 0;
        while(!queue.isEmpty()){
            ans[index++] = queue.remove();
        }
        return ans;
    }
}