package DSA.Sliding_Window_Two_Pointers;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {

        // We are using a sliding window to find the longest substring.

        // We will keep the left end of the sliding window dynamic and keep incrementing the right end
        // Initially both the ends are on the starting index/character.

        // The hashset acts as an indicator of a character within the window.

        // Each character from the right is stored in the hashset.

        // If we encounter any character which already exists in the window, we increment the left end of the window until the repeating character is removed from the window through the left side.

        // In each increment of the right end, we dynamicall keep track of the longest encountered window yet.

        // The end value of the "res" variable is the longest substring without repeating characters in the given string.
        
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            
            while(set.contains(s.charAt(i)) && start < i){
                set.remove(s.charAt(start));
                start++;
            }
            
            set.add(s.charAt(i));
            res = Math.max(res, i - start+1);
        }

        return res;
    }
    
}
