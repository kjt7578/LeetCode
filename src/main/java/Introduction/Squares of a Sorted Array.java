class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.pow(nums[i],2));
            System.out.println(nums[i]);
        }
        //Bubble sort
        int temp;
        int big;

        for(int i = 0; i < nums.length; i++){
            for(int j=0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }

            }
        }


        return nums;
    }
}