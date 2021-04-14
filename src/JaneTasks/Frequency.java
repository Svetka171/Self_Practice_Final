package JaneTasks;

public class Frequency {
    public static void main(String[] args) {
        String str = "aaabbcddddd";
        System.out.println(freq(str));

    }

    public static String freq(String str) {
        String result = "";


        for (String each : str.split("")) { //a
            int count = 1;
            for (String each1 : str.split("")) {
                if (each.equals(each1)) {
                    count++;
                }
            }
            if (!result.contains(each)) {
                result += each + count;
            }
        }

       return result;
    }



}
