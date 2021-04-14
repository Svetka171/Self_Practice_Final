package CodingBat;

public class changePI {
    public static void main(String[] args) {
    //if String has PI change it to 3.14 without using loop
        /*
        changePi("xpix") → "x3.14x"
        changePi("pipi") → "3.143.14"
        changePi("pip") → "3.14p"
         */
        System.out.println(changePI("opicnjpink"));

        String str = "fhtpidhopi";
        String result = "";

        if(str.contains("pi")){
           result+= str.replace("pi", "3.14");
        }

        System.out.println(result);



    }

    public static String changePI(String str){
      if(str.equals("") || str.length()<2 ) return str; //pi

      if(str.substring(0,2).equals("pi")) return "3.14" + changePI(str.substring(2));

      else
          return str.charAt(0) + changePI(str.substring(1));

    }
}
