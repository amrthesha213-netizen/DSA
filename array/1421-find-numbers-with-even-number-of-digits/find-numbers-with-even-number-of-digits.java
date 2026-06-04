class Solution {
    public int findNumbers(int[] nums) {
        int digit = 0;
        for(int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int sum = 0;

            while(k > 0) {
                sum++;
                k=k/10;
            }

            if(sum % 2 == 0) {
                digit++;
            }
        }

        return digit;
    }
}
    