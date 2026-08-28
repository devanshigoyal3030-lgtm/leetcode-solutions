class Solution {
    public long sumAndMultiply(int n) {

        String s = n + "";

        long x = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            if (digit != 0) {
                x = x * 10 + digit;
                sum = sum + digit;
            }
        }

        return x * sum;
    }
}
