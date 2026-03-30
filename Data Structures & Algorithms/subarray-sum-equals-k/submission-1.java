class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int currsum = 0;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        for(int num : nums){
            currsum += num;
            int diff = currsum - k;
            res += prefixSum.getOrDefault(diff,0);
            prefixSum.put(currsum,prefixSum.getOrDefault(currsum,0)+1);
        }
        return res;
    }
}