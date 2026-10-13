package Day_35;

public class Search {

    boolean search(int[] nums, int key) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == key) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int key = 30;

        Search obj = new Search();

        boolean result = obj.search(nums, key);

        

        System.out.println("Check the array to find: " + key);
        System.out.println("Result: " + result);
       
    }
}