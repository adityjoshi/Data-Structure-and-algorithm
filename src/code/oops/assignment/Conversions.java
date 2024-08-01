package code.oops.assignment;

import java.util.Arrays;
import java.util.Locale;

public class Conversions {
    public static void main(String[] args) {
        String x = "apple" ;
        String y = "banana" ;
        String z = "grapes" ;
        String UpperCase = "X in upper case : \n"+ x.toUpperCase()  + "\n y in upper case : \n" + y.toUpperCase() + "\n z in upper case : \n" + z.toUpperCase();
        System.out.println(UpperCase);
        int index = x.indexOf('l');
        System.out.println("index of the word l is  "+ index);
        String data = "apple,banana,mango";
        String [] fruitArray = data.split(",");
        System.out.println(Arrays.toString(fruitArray));

        String rep = "Hello, dev";
        String ans =  rep.replace("dev","golang");
        System.out.println(ans);

        String as = x.concat("")+ " and " + y.concat("") + " are fruits";
        System.out.println(as);

        String greet = "hello,dev";
        System.out.println(greet.substring(3,7));
        System.out.println(Arrays.toString(greet.split("")));
    }
}
