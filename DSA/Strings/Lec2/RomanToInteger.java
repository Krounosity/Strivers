import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            int num = map.get(s.charAt(i));

            if (i < s.length() - 1) {
                if (map.get(s.charAt(i + 1)) > num) {
                    res -= num;
                } else {
                    res += num;
                }

            } else {
                res += num;
            }
        }

        return res;
    }
}