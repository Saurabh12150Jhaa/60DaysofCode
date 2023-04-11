class isPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true; // An empty string is considered a palindrome
        }
        
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Convert to lowercase and remove non-alphanumeric characters
        
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If characters at left and right positions don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // If we have reached here, it's a palindrome
    }
public static void main(String[] args) {
    String s1 = "A man, a plan, a canal: Panama";
    boolean result1 = isPalindrome(s1);
    System.out.println(s1 + " is a palindrome: " + result1);
    
    String s2 = "race a car";
    boolean result2 = isPalindrome(s2);
    System.out.println(s2 + " is a palindrome: " + result2);
    
    String s3 = "";
    boolean result3 = isPalindrome(s3);
    System.out.println("An empty string is a palindrome: " + result3);
}
}