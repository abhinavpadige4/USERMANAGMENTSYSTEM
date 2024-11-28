import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.*;
public class Login {
    Create create = new Create();
    public void read(String USERID) {
        String filename = USERID + ".txt";
        File file = new File(filename);
        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("Reading from AccountTransactions: " + filename);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Account not found: " + filename);
            e.printStackTrace();
        }
    }

    public void update(String USERID) {
        Scanner scanner = new Scanner(System.in); // Keep this open if used in other methods
        System.out.print("Enter the Transactions Info you want to write to your Account: ");
        String userInput = scanner.nextLine()+"\n";
        String filename = USERID + ".txt";
        File file = new File(filename);

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(userInput + "\n"); // Appending user input to the file with a new line
            System.out.println("Successfully appended to the Account: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the Account.");
            e.printStackTrace();
        }
    }
    void login(){
        System.out.println("login");
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER USERID");
        String USERID = sc.nextLine();
        String filename = USERID + ".txt";
        File file = new File(filename);
        if (file.exists()) {
            int choice = 0;
            while (choice != 3) {
                System.out.println("ENTER YOUR CHOICE");
                System.out.println("1. Read\n2. Update\n3. Exit");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        read(USERID);
                        break;
                    case 2:
                        update(USERID);
                        break;
                    case 3:
                        System.out.println("Exiting the application.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        else{
            System.out.println("invalid user create user ");
            create.create();
        }
    }
}
