/**
 * Given two strings,
 * write a function to check if they are exactly one, or zero edit.
 */
public static boolean one_away(String a, String b) {
    int diff = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c: a.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0)+1);
    }
    for (char c: b.toCharArray()) {
        // if the letter from the second string is not in the first one there is a diff.
        if (map.get(c) == null) {
            diff++;
        } else {
            map.put(c, map.get(c)-1);
        }
    }
    for (char key: map.keySet()) {
        if (map.get(key) != 0) {
            /*
            We need to make sure in this case
            that we don't count two times a diff
            example: pale | bale, we already counted the first diff because b was not in the first string
            but when we check the hashmap key, we're going to count a second time
            because the letter p key is still going to be 1
            this check is necessary for 'replacing a character' counting as a diff
             */
            if (b.contains(String.valueOf(key))) {
                diff++;
            }
        }
    }
    return diff == 1 || diff == 0;
}
