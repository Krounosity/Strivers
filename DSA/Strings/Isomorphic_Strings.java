package DSA.Strings;

public class Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {
        
		int hash[] = new int[256];
		boolean ismapped[] = new boolean[256];
		
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
			char s1 = s.charAt(i);
			char s2 = t.charAt(i);
			if (hash[s1] == 0) {
				if (ismapped[s2 ]) {
					return false;
				}
				hash[s1] = s2;
				ismapped[s2] = true;
			} else {
				if (hash[s1] != s2) {
					return false;
				}
			}
		}
        
		return true;
    }

}
