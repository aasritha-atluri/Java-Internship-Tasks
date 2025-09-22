import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "1234");
        users.put("user", "pass");

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (users.containsKey(u) && users.get(u).equals(p)) {
            System.out.println(" Login successful! Welcome " + u);
        } else {
            System.out.println("Login failed! Invalid credentials.");
        }

        sc.close();
    }
}

