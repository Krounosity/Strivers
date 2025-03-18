class Kth_Bits {
    static boolean checkKthBit(int n, int k) {
        while (k-- > 0) {
            n >>= 1;
        }
        return n % 2 != 0;
    }
}