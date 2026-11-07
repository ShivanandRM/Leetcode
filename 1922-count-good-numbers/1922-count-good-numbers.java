
class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007;
        long even = (n + 1) / 2;
        long odd = n / 2;
        return (int) ((pow(5, even, mod) *
                       pow(4, odd, mod)) % mod);
    }
    long pow(long a, long b, long mod) {
        if (b == 0)
            return 1;
        long half = pow(a, b / 2, mod);
        long result = (half * half) % mod;
        if (b % 2 == 1)
            result = (result * a) % mod;
        return result;
    }
}
