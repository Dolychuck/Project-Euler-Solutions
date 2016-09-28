/**
 * A class for Project Euler solution 4
 * @author Dustin Olychuck
 * @version 7/31/2015
 */
public class SolutionFour {
    /**
     * @param str A string being checked to confirm it is a palindrome
     * @return true if string is a palindrome
     */
    static boolean isPalindrome(String str) {
        boolean result = true;
        int length = str.length()-1;
        for(int i = 0; i < length ;i++) {
            if(str.charAt(i) != str.charAt(length-i))
                result = false;
        }
        return result;
    }

    /**
     * @param num a number being changed to integer
     * @return num represented as a string
     */
    static String makeStr(int num) {
        return Integer.toString(num);
    }

    /**
     * @param num number of digits being multiplied starting with largest x digit number eg 999
     * @return longest palindrome possible by multiplying (num) digit numbers
     */
    static int longestPalindrome(int num) {
        int result = 0;
        for(int i = num; i > 0; i--) {
            for(int j = num; j > 0; j--) {
                if(isPalindrome(makeStr(j * i)) && j * i > result) {
                    result = j * i;
                }
            }
        }
        return result;
    }
}