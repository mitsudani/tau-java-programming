package strings;

public class TextProcessor {

    public static void main(String args[]) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeMit");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and print them.
     * @param text Full string to be split.
     */

    public static void countWords(String text) {

        // Split the text everywhere it finds a space (delimiter)
        var words = text.split(" ");
        int numberOfWords = words.length;

        // %d is a placeholder for the number that is passed as the second argument
        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order.
     * @param text String to reverse.
     */
    public static void reverseString(String text) {
        for (int i = text.length()-1; i>=0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter.
     * @param text Jumbled text.
     */
    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            // no spaces at index 0
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                // pass the space position
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
