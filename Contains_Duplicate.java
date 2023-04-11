import java.util.HashSet;
import java.util.Scanner;
class prog1 {
    public static boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;   
    }
}
public class Contains_Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + (i+1) + ": ");
            nums[i] = scanner.nextInt();
        }
        
        // Check for duplicates
        boolean result = prog1.containsDuplicate(nums);
        System.out.println("Does the array contain duplicates? " + result);
        
        scanner.close();
    }
}