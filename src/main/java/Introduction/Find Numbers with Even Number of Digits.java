class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digit = 0;

        for(int i = 0; i < nums.length;i++){
            while(nums[i] != 0){
                if(nums[i] != 0){
                    System.out.println(nums[i]+"digit+");
                    digit++;
                }
                nums[i] = nums[i] / 10;
            }
            if(digit % 2 == 0){
                count++;
                System.out.println("count+");
            }
            digit = 0;
        }


        return count;
    }
}