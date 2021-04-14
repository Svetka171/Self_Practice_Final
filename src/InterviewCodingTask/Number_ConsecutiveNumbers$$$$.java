package InterviewCodingTask;

public class Number_ConsecutiveNumbers$$$$ {
    public static void main(String[] args) {
        int num = 7;
        solution(num);

    }

    public static void solution(int N) {   //7

        String result = "";

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result += "CodilityTestCoders\n";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result += "CodilityTest\n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += "CodilityCoders\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "TestCoders\n";
            } else if (i % 2 == 0) {
                result += "Codility\n";
            } else if (i % 5 == 0) {
                result += "Coders\n";
            } else if (i % 3 == 0) {
                result += "Test\n";
            } else {
                result += i + "\n";
            }
        }

        System.out.println(result);
    }
}
