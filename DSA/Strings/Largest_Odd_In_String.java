package DSA.Strings;

public class Largest_Odd_In_String {
    public String largestOddNumber(String num) {
        int right = num.length() - 1;

        while(right >= 0 && (num.charAt(right) - '0')%2 != 1 ) right--;

        return num.substring(0, right+1);
    }
}
