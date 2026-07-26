class Solution {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int k = 0;
        for(int num : nums) {
            if(num != val) {
                temp[k++] = num;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        return k;
    }
}