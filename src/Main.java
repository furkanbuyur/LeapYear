import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int inpYear,leapYear4,leapYear100,leapYear400;

        System.out.print("Enter Year : ");
        inpYear = inp.nextInt();


        leapYear4 = inpYear % 4 ;
        leapYear100 = inpYear % 100;
        leapYear400 = inpYear % 400;


        if (leapYear100 == 0 && leapYear400 == 0) {
            System.out.println(inpYear + " is a leap year.");
        }else if (leapYear4 == 0 && leapYear100 != 0){
            System.out.println(inpYear + " is a leap year.");
        }else {
            System.out.println(inpYear+" is not a leap year.");
        }
    }
}