import java.util.*;

public class AudifyTech {

    private static final Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] str = new String [2];

        for (int i = 0; i < str.length; i++)
        {
            str[i] = scn.nextLine();
        }

        if (!str[0].isEmpty() && !str[1].isEmpty()) {
            concatenateTwoStringList(str);
            System.out.println(set.size());
        } else {
            System.out.println("Enter non empty String");
        }

    }

    public static void concatenateTwoStringList(String[] str) {
        List<String> palindromeStringA = allPalindromeSubstring(str[0]);
        List<String> palindromeStringB = allPalindromeSubstring(str[1]);

        for(String str1 : palindromeStringA) {
            for (String str2 : palindromeStringB) {
                String str3 = str1 + str2;
                set.add(str3);
            }
        }

    }
    public static List<String> allPalindromeSubstring(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    list.add(str.substring(i, j));
                }
            }
        }
        return list;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
