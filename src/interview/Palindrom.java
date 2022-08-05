package interview;

public class Palindrom {

    // palindrom to taki wyraz co od tyłu i od przodu jest taki sam

    public static void main(String[] args) {
        System.out.println(isPalilindrom("kajak"));
    }
    public static boolean isPalilindrom(String word) {
        int n = word.length();
        for (int i = 0; i<(n/2); i++){
            if (word.charAt(i) != word.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
