package JavaProgram;

public class SeparateCharsFromString {
    public static void main(String[] args) {
        String str = "abc#$#23asc";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                System.out.print(ch);
            }
        }
    }
}