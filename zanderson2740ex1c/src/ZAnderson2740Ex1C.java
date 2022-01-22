import java.util.Scanner;

public class ZAnderson2740Ex1C {
    public static void main(String[] args) {
        System.out.println("zandersonex1c: Renter Information\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Acct#: \t\t");
        int acctNum = sc.nextInt();

        System.out.println("First name: \t\t");
        String fName = sc.next();

        System.out.println("Last name: \t\t");
        String lName = sc.next();

        System.out.println("Monthly income: \t\t");
        int income = sc.nextInt();

        System.out.println("Rent: \t\t");
        int rent = sc.nextInt();

        System.out.println("Cable: \t\t");
        int cable = sc.nextInt();

        System.out.println("Electric: \t\t");
        int electric = sc.nextInt();

        System.out.println("Gas: \t\t");
        int gas = sc.nextInt();

        //Calculate net and total expenses
        int expenses = (cable + electric + gas + rent);
        int net = (income) - (expenses);

        //display result
        System.out.println("Account:\t\t" + acctNum + " " + fName + " " + lName);
        System.out.println("Income - expenses:\t" + "$" + income + " - " + "$" + expenses + " = " + "$" + net);



    }
}
