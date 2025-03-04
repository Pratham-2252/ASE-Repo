import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        
        if (str1 == null || str2 == null) {
            return false;
        }
        
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));
        System.out.println(isAnagram("Race", "Care"));
        System.out.println(isAnagram("a gentleman", "elegant man"));
        System.out.println(isAnagram("123hello!", "o!l1le3h2"));
        System.out.println(isAnagram("", ""));
        System.out.println(isAnagram(null, "test"));
    }
}
