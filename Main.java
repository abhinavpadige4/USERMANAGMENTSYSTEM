import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        Create create = new Create();
        Delete delete=new Delete();
        System.out.println("WELCOME TO MY APPLICATION");
        int choice = 0;
        while (choice != 3) {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1. Login\n2. Create\n3. Delete\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    login.login();
                    break;
                case 2:
                    create.create();
                    break;
                case 3:
                    delete.deletes();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
