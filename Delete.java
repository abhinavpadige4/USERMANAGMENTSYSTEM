import java.io.File;
import java.io.IOException;
import java.util.*;
public class Delete {
    Scanner sc = new Scanner(System.in);
    void deletes() {
        System.out.println("Deleting");
        System.out.println("ENTER USERID");
        String USREID=sc.nextLine();
        int choice = 0;
        while (choice != 3) {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1. Delete Account\n2. Delete Transactions \n3. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    deleteFile(USREID);
                    break;
                case 2:
                    deleteinfo(USREID);
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void deleteFile(String USERID) {
        String filename = USERID + ".txt";
        File file = new File(filename);

        if (file.delete()) {
            System.out.println("Account deleted successfully: " + filename);
        } else {
            System.out.println("Failed to delete the Account, or Account does not exist.");
        }
    }
    public void deleteinfo(String USERID) {
        String filename = USERID + ".txt";
        File file = new File(filename);

        if (file.delete()) {
            System.out.println("5Transactions deleted successfully.");
            try {
                if (file.createNewFile()) {
                    System.out.println("New empty Account created: " + filename);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating a new Account.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to delete the Transactions.");
        }
    }

}
