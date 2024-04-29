package Homework4.PalindromeChecker;

class Palindrome {
    public boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int length = cleanStr.length();
        int forward = 0;
        int backward = length - 1;

        while (backward > forward) {
            if (cleanStr.charAt(forward) != cleanStr.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
}