/**
* Given a string,
* write down a function to check if it is a permutation of a palindrome
*/
public static boolean palindrome_permutation(String a) {
  HashMap<Character, Integer> map = new HashMap<>();
  for (char c: a.toCharArray()) {
      if (c != ' ') {
          map.put(c, map.getOrDefault(c, 0) + 1);
      }
  }
  // if the string is a palindrome, only one lonely letter is admitted.
  // other letter must be present exactly two times in the string
 boolean lon = false;
  for (char key: map.keySet()) {
      if (map.get(key) == 1) {
          if (lon) {
              return false;
          } else {
              lon = true;
          }
      } else if (map.get(key) != 2) return false;
  }
  return true;
}
