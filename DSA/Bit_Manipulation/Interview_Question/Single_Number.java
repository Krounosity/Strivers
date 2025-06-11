package Interview_Question;

public class Single_Number {

    public int singleNumber(int[] nums) {
        // To find the number which occurs ONLY ONCE.
        // Hence, if we perform the XOR operation on all numbers on a starting number 0, their duplicated will cancel them out, except the singular number.

        int res = 0;

        for(int n : nums) res ^= n;

        return res;
    }

}
