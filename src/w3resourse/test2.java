package w3resourse;

public class test2 {
    public static void main(String[] args) {
        int[][] twodm = {{10, 20, 30}, {40, 50, 60}};

        // int[][] newtwodm =  {{10 ,40 },{20,50 },{30, 60 }}                                                 //     20 50


        transpose(twodm);
    }

    private static void transpose(int[][] twodm) {
                                       //3   2
        int[][] newtwodm = new int[twodm[0].length][twodm.length];

        for (int i = 0; i < twodm.length; i++) {   //2                 //
                                                                    //
            for (int j = 0; j < twodm[0].length; j++) {            //
                newtwodm[j][i] = twodm[i][j];
            }
        }

        print_array(newtwodm);
    }
    private static void print_array(int[][] twodm) {
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                System.out.print(twodm[i][j] + " ");
            }
            System.out.println();
        }

    }
}
