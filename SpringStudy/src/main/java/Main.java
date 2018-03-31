import db.DbHandler;
import db.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

    public void insertUserData() throws IOException {
        System.out.print("db. User name: ");
        String userName = input.readLine();
        System.out.print("db. User surname: ");
        String userSurname = input.readLine();
        System.out.print("db. User age: ");
        int userAge = Integer.parseInt(input.readLine());
        User user = new User(userName, userSurname, userAge);
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.insertUserData();
    }
}
