package InterviewCodingTask;

public class MaximumPossibleVal$$$$$ {
    public static void main(String[] args) {
          /*
    Write a function solution that, given an integer N, returns the maximum possible value
    obtained by inserting one '5' digit inside the decimal representation of integer N.
    Examples:
        1. Given N = 268, the function should return 5268
        2. Given N = 670, the function should return 6750.
        3. Given N = 0, the function should return 50.
        4. Given N = -999, the function should return -5999.
    Assume that:
        • N is an integer within the range (-8,000..8,000).
    In your solution, focus on correctness. The performance of your solution will
    not be the focus of the assessment.
     */
        System.out.println(solution(782));
    }


    public static int solution(int num) {
        String s = "" + Math.abs(num);   //  782                                          =7852
        System.out.println(s);
        int max = Integer.valueOf(s + 5);    //   max = 7825
        System.out.println("max   " + max);
        if (num > 0) {
            for (int i = 0; i < s.length(); i++) {    //    i=2
                String c = "" + s.charAt(i);           //  c=2
                String t = s.replaceFirst(c, 5 + c); //7852
                System.out.println("c = " + c);
                System.out.println("t " + t);
                if (Integer.valueOf(t) > max) {       //
                    max = Integer.valueOf(t);
                }
            }
        } else if (num < 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) < max) {
                    max = Integer.valueOf(t);
                }
            }
            max = -max;
        } else {
            max = 50;
        }
        return max;
    }
}
