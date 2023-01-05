public class Palindrome {
    public static boolean isPalindrome(String string) {
        if (string == null || string.isBlank() ) return false;

        String str = string.replace(" ", "").toLowerCase();
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome checkWord = new Palindrome();
        boolean checkResult=checkWord.isPalindrome("АРТЕМ МЕТРА");
        System.out.println(checkResult);
    }
}
