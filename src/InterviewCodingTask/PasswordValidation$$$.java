package InterviewCodingTask;

public class PasswordValidation$$$ {
    public static void main(String[] args) {
/*    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns false
     */
        String password = "caejkew8@";
        System.out.println("password(password) = " +password.matches("[c,a].*"));
    }

    public boolean passwordIsValid(String password) {

        /*
        The following statement will check whether the string str matches with “(.*)Java (.*)” or not.
        It means the string must contain Java, and it will accept anything before or after the java word
         */

        boolean hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                hasDigits = password.matches("(.*[0-9].*)"),
                hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

        if(password.length() >= 6 && !password.contains(" ")) {
            if (hasLowerCaseChar && hasUpperCaseChar && hasDigits && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }


}
