package JaneTasks;

public class oddOrEven {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(5));

    }

    public static String evenOrOdd(int num) {

        return ( num<1) ? "0":  num % 2 == 0 ? "even" : "add";
    }
}
