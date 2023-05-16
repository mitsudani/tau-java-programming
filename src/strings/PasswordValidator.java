package strings;

import java.util.Scanner;

public class PasswordValidator {

    private static Scanner scanner = new Scanner(System.in);
    private static String username = "Mit";
    private static String oldPassword = "Ilovestationery$";

    public static void main(String args[]) {

        String password = enterPassword();

        checkPasswordLength(password);
        passwordUppercaseMessage(checkPasswordUppercaseLetter(password));
        passwordSpecialCharacterMessage(checkPasswordSpecialCharacter(password));
        checkOldUsername(password);
        checkOldPassword(password);
    }

    private static String enterPassword() {
        System.out.println("Please enter a valid password:");
        String password = scanner.nextLine();
        return password;
    }

    private static void checkPasswordLength(String password) {
        int passwordLength = 8;
        String message;

        if (password.length() >= passwordLength) {
            message = "PASS: Password length OK.";
        } else {
            message = "FAIL: Your password must be at least 8 characters long.";
        }
        System.out.println(message);
    }

    private static boolean checkPasswordUppercaseLetter(String password) {
        boolean hasUppercase = false;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
                break;
            }
        }
        return hasUppercase;
    }

    private static void passwordUppercaseMessage(boolean hasUppercase) {
        String message;

        if (hasUppercase) {
            message = "PASS: Password uppercase OK.";
        } else {
            message = "FAIL: Your password must contain at least one uppercase letter.";
        }
        System.out.println(message);
    }

    private static boolean checkPasswordSpecialCharacter(String password) {
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {

            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
                hasSpecialCharacter = true;
                break;
            }
        }
        return hasSpecialCharacter;
    }

    private static void passwordSpecialCharacterMessage(boolean hasSpecialCharacter) {
        String message;

        if (hasSpecialCharacter) {
            message = "PASS: Password special character OK.";
        } else {
            message = "FAIL: Your password must contain a special character.";
        }
        System.out.println(message);
    }

    private static void checkOldUsername(String password) {
        String message;

        if (password.contains(username)) {
            message = "FAIL: Your password must not contain your username.";
        } else {
            message = "PASS: Password not containing username OK.";
        }
        System.out.println(message);
    }

    private static void checkOldPassword(String password) {
        String message;

        if (password.equals(oldPassword)) {
            message = "FAIL: Your password must not be the same as your old password.";
        } else {
            message = "PASS: Password is different OK.";
        }
        System.out.println(message);
    }
}