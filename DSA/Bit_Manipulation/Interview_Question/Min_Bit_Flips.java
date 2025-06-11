package Interview_Question;

class Min_Bit_Flips {
    public int minBitFlips(int start, int goal) {
        // We need to flip the bits which are not the same
        // The XOR operations leaves 1 at bits where the bits are different and 0 where they are the same
        // If we XOR the two numbers, the resultant's count of set bits will be the required answer

        int xor = start ^ goal;

        int ans = 0;

        while(xor > 0){
            if(xor%2 == 1) ans++;
            xor >>= 1;
        }

        return ans;
    }
}