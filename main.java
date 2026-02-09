import arrayProblem.*;
// import java.util.*;

public class main {

    public static void main(String[] args) {
        prefixSum Presum = new prefixSum();

    

        int[] nums = {1,2,3,4,5};

        int[] newSum = Presum.preSum(nums);
        int index = Presum.firstindex(newSum);
        

        for(int i = 0; i<nums.length; i++){
            System.out.print(newSum[i] + " ");
        }
        System.out.println(index);
    }
}
