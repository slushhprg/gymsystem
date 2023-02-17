import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // prints= what's your name?; what's your id?; choose your plan.

        Client client;
        double payment = 0;
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your ID:");
        int ID = sc.nextInt();
        System.out.println("Choose your plan: ");
        System.out.println("PLAN 1= U$60.00");
        System.out.println("PLAN 2= U$70.00");
        char plan = sc.next().charAt(0); 
        if (plan == '1'){
        payment += payment + 60.00;
        } 
        else if (plan == '2'){
            payment += payment + 70.00;
        }
        client = new Client(name, ID, payment);
        System.out.println(client);









     
        sc.close();
    }
}