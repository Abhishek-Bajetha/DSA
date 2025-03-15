class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, y;
        y = x;
        while (x > 0) {
            int r;
            r = x % 10;
            rev = rev * 10 + r;
            x /= 10;
        }
        if (rev == y)
            return true;
        else
            return false;
    }
}