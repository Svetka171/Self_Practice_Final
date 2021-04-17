package ExtraOfficeHours.day6;

public class PalindromeNumber {
    public static void main(String[] args) {
        //dnt use String
        long num = 1234321;


    }

    public static boolean palindrome(long num){
        long reverse = 0;
        long temp = num;

        while(temp != 0) {
            reverse = reverse * 10 + ( temp % 10 );
            temp /=10;
        }

        return reverse==num;
    }
}
