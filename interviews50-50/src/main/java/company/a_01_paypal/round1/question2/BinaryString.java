package company.a_01_paypal.round1.question2;

public class BinaryString {
    public static void main(String[] args) {
        System.out.println(getSwapTime("01010101"));
    }
    public static int getSwapTime(String color) {
        int ones = 0;
        int n = color.length() - 1;
        int zeroCount = 0;
        int ans = 0;

        while (n >= 0 && color.charAt(n) == '0') {
            n--;
        }

        for (int i = n; i >= 0; i--) {
            int curr = color.charAt(i);
            if (curr == '1') {
                ones++;
                zeroCount = 0;
                continue;
            }

            if (i != n - 1 && curr == color.charAt(i + 1)) {
                ++zeroCount;
            }
            ans = Math.max(ans, ones + zeroCount);
        }

        if (ones == 0 || n == ones) { //monocolor
            return 0;
        }

        return ans;

    }
}
