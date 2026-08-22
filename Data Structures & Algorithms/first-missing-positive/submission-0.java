class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums) {
            if(num > 0) {
                set.add(num);
            }
        }
        int answer = 1;
        for(int num : set) {
            if(num == answer) {
                answer++;
            }else if(num > answer) {
                break;
            }
        }
        return answer;
    }
}