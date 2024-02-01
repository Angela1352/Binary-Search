
/**
 * Angela Chen
 * Jan. 30, 2024
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(myArray, 1, 8, 5));
    }

    public static int binarySearch(int[] nums, int start, int end, int key) {
        while (start <= end) {
            int avg = (start + end) / 2;

            if (nums[avg] == key) return nums[avg]; 
            else if (nums[avg] > key) return binarySearch(nums, start, avg-1, key);
            else return binarySearch(nums, avg+1, end, key);
        }
        
        return -1;
    }
}