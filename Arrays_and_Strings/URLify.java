/**
* Write a method to replace all spaces in a string with '%20'
*/
public static String URLify(String s) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') {
            answer.append("%20");
        } else {
            answer.append(s.charAt(i));
        }
    }
    return answer.toString();
}
