/*
    Given two string,
    write code to check if s2 is a rotation of s1
    waterbootle is a rotation of erbottlewat
 */
public static boolean string_rotation(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    StringBuilder temp = new StringBuilder(s1);
    for (int i = 0; i < s2.length(); i++) {
        int index = temp.indexOf(s2.substring(i, i+1));
        System.out.println("on enlèvre la lettre: " + temp.substring(index, index+1));
        if (index != -1) {
            temp.delete(index, index+1);
        } else {
            return false;
        }
    }
    return temp.length() == 0;
}
