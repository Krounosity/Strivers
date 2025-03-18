class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean found = false;
        while (n > 0) {
            if (n % 2 != 0) {
                if (found == true)
                    return false;
                else
                    found = true;
            }
            n >>= 1;
        }
        return found;
    }
}