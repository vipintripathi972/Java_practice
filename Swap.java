class Swap{

    public int[] solution(int[] nums){
        int x = 0;
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1])
            {
                nums[i] = x;
                nums[i] = nums[i + 1];
                nums[i + 1] = x;
            }
        }
        return nums;
    }

    public static void main(String args[]){
        Swap a = new Swap();
        int[] nums = {54,54,23,2,12};
        System.out.pritnln(a.solution(nums[]));

    }
}