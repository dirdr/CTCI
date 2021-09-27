import java.util.HashSet;

public class Solution {
	public boolean is_unique(String s) {
	HashSet<Character> set  = new HashSet<>();
	for (int i = 0; i < s.length(); i++) {
		if (!set.contains(s.charAt(i))) {
			set.add(s.charAt(i));
		} else {
			return false;
		}
	}
	return true;
	}
}
	 
