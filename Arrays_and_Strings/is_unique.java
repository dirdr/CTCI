/**
 * implement an algorithm to determine if a string has all unique characters
 */
public static boolean is_unique(String s) {
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
