class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        int x = Integer.parseInt(s);

        int sum = 0;
        while (x != 0) {
            int digit = x % 10;
            sum += digit;
            x /= 10;
        }

        s = s.replace("0", "");
        int y = s.isEmpty() ? 0 : Integer.parseInt(s);

        return (long) sum * y;
    }
}