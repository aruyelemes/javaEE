import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scan.nextInt();
        System.out.println(leapYearCount(year));
    }
    public static int leapYearCount(int year){
        return year/4 - year/100 + year/400;
    }
}
