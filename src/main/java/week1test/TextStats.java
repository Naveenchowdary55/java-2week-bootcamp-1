package week1test;

/**
 * Week 1 Test — Problem 3 of 5 (EASY, 10 marks).
 *
 * Topics: Strings, length(), charAt(i), walking text one character at a time.
 *
 * Walk the characters yourself. No split(), no replaceAll(), no regex, and no
 * StringBuilder.reverse().
 *
 * Every method here rejects a null input with IllegalArgumentException. An
 * EMPTY String is not null — it is valid input with a sensible answer.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class TextStats {

    /**
     * Count the vowels (a, e, i, o, u) in the text, upper or lower case.
     *
     * 'y' is not a vowel here. Anything that is not a letter is simply not a
     * vowel — digits, spaces and punctuation are skipped, not rejected.
     *
     * Example: countVowels("Education")   -> 5    (E, u, a, i, o)
     * Example: countVowels("rhythm")      -> 0
     * Example: countVowels("A E i o U")   -> 5
     * Example: countVowels("")            -> 0
     *
     * @param s the text, never null
     * @return how many vowels it contains
     * @throws IllegalArgumentException if s is null
     */
    public static int countVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    /**
     * The text, backwards.
     *
     * Example: reverse("hello") -> "olleh"
     * Example: reverse("a")     -> "a"
     * Example: reverse("")      -> ""
     *
     * @param s the text, never null
     * @return the characters of s in reverse order
     * @throws IllegalArgumentException if s is null
     */
    public static String reverse(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
        
    }

    /**
     * Does the text read the same forwards and backwards?
     *
     * Compare only letters and digits — ignore case, spaces, and punctuation
     * entirely. `Character.isLetterOrDigit(c)` and `Character.toLowerCase(c)`
     * are allowed and will save you a lot of typing.
     *
     * A String with no letters or digits at all (including the empty String)
     * counts as a palindrome — there is nothing in it to contradict.
     *
     * Example: isPalindrome("Race car")                     -> true
     * Example: isPalindrome("A man, a plan, a canal: Panama") -> true
     * Example: isPalindrome("")                             -> true
     * Example: isPalindrome("!!!")                          -> true
     * Example: isPalindrome("hello")                        -> false
     * Example: isPalindrome("ab")                           -> false
     *
     * @param s the text, never null
     * @return true if it is a palindrome once case and punctuation are ignored
     * @throws IllegalArgumentException if s is null
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
