
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> aux = new HashSet <>();
        for (int i=0;i<nums.length;i++){
            if(aux.contains(nums[i])) return true;
            aux.add(nums[i]);
        }

        return false;
    }
}
