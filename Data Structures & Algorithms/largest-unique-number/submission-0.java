class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int largestUnique = -1;
        for(int num :map.keySet()){
            if(map.get(num) == 1 && num > largestUnique){
                largestUnique = num;
            }
        }
        return largestUnique;
    }
}
