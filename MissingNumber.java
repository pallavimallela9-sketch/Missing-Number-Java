public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = n * (n + 1) / 2;

        for (int num : nums) {
            sum -= num;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int result = missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }
}
