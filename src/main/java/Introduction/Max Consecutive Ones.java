class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int sum = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                count++;
                System.out.println("count+++");
            }
            else if (nums[i] == 0){
                if ( sum < count){
                    sum = count;
                }
                count = 0;
                System.out.println("reset");
            }
        }
        if(sum<count){
            sum=count;
        }

return sum;
    }
}

