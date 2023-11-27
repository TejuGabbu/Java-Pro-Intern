import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator Machine");
        System.out.print("Enter marks that you get in english subject : ");
        int eng = sc.nextInt();
        System.out.print("Enter marks that you get in Mathematics subject : ");
        int math = sc.nextInt();
        System.out.print("Enter marks that you get in Science subject : ");
        int sci = sc.nextInt();
        System.out.print("Enter marks that you get in History subject : ");
        int his = sc.nextInt();
        System.out.print("Enter marks that you get in Geography subject : ");
        int geo = sc.nextInt();
        int total = eng + math + sci + his + geo;
        int avgPer = total/5;
        String Grade = null;
        if(avgPer<35)
        {
            Grade = "D";
        } else if (avgPer>34 && avgPer<=50) {
            Grade = "C";
        } else if (avgPer>50 && avgPer<80) {
            Grade = "B";
        } else if (avgPer>=80) {
            Grade = "A";
        }
        System.out.println("Your total Marks is "+total);
        System.out.println("Your average percentage is "+avgPer);
        System.out.println("Your got "+Grade+" Grade");
    }
}