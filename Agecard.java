import java.util.Scanner;

public class Agecard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Current year:");
        int Currentyear=sc.nextInt();
        System.out.println("Enter Birth year: ");
        int Birthyear=sc.nextInt();
        if(Birthyear==0||Currentyear==0||Birthyear==Currentyear){
        System.out.println("year is invalid");
        }
        else{
            System.out.println(Currentyear-Birthyear);
        }
        sc.close();
        }
}
