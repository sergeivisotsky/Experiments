import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

    public void insertUserData() throws IOException {
        System.out.print("User name: ");
        String userName = input.readLine();
        System.out.println("User surname: ");
        String userSurname = input.readLine();
        System.out.println("User age: ");
        int userAge = Integer.parseInt(input.readLine());
        User user = new User(userName, userSurname, userAge);

    }
    public static void main(String[] args) {

    }
}
