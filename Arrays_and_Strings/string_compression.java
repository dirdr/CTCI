/**
 * implement a method o perform basic string compression
 */
public static String string_compression(String s) {
    if (s.length() == 0) {
        return s;
    }
    char current_char = s.charAt(0);
    int count = 1;
    StringBuilder answer = new StringBuilder();
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == current_char) {
            count++;
        } else {
            answer.append(current_char).append(String.valueOf(count));
            current_char = s.charAt(i);
            count = 1;
        }
    }
    //append the las compressed letter
    answer.append(current_char).append(String.valueOf(count));
    return answer.toString();
}
