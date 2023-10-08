package task8;

public class PalindromChecker {

    public PalindromChecker() {
    }

    public boolean isPalindrom(String what) {
        if (what.length() <= 1) return true;
        else if (what.length() == 2) return (what.charAt(0) == what.charAt(1));
        else {
            if (what.charAt(0) == what.charAt(what.length() - 1))
                return isPalindrom(what.substring(1, what.length() - 1));
            else return false;
        }
    }
}
