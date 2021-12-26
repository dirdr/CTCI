 /**
     * Given two strings, write down a method to decide if one is a permutation of the other
     */
    public static boolean check_permutation(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (char c: b.toCharArray()) {
            if (map.get(c) == null || map.get(c) == 0) {
                return false;
            } else {
                map.put(c, map.get(c)-1);
            }
        }
        for (char key: map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
