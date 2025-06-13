/* While the number does not go down to 0,
 * If the least significant bit is 1, increase resultant count
 * Left shift the number by 1 bit.
 */

class Count_Set_Bits{
    public int setbits(int num){
        int res = 0;
        while(num > 0){
            if(num%2 == 1) res++;
            num >>= 1;
        }

        return res;
    }
}