package code.oops.assignment.ass_3;

public class p1 {
    public static void main(String[] args) {
        // String concatenation
        String firstName = "aditya";
        String lastName = "joshi" ;
        System.out.println("concatenation => "+ firstName + " " + lastName);

        // substring
        String sentence = "i can kill u with my pen i a gun fight";
        System.out.println(sentence.substring(1,12));

        // comparison
        String str1 = "adi";
        String str2 = "pahadi";
        boolean compare = str1.equals(str2);
        System.out.println(compare);
    }
}
