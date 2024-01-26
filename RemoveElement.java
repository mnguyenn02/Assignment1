//#5 Remove Element
import java.util.Scanner;

public class RemoveElement {

    static int remove(int[] nums, int val) {

        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        //int[] nums = {3,2,2,3};
        //int val = 3;
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = remove(nums,val);

        System.out.println("Output: " + k);
    }
}

