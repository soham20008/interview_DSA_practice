package arrayProblem;
// import java.util.*;


class firstindex{
    public int firstindex(int[] arr){
        return arr[0];
    }
}

public class prefixSum {
    public int[] preSum(int[] nums) {
        int[] preSum = new int[nums.length];
        preSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }

        return preSum;
    }
    public int firstindex(int[] arr){
        return arr[0];
    }
}
