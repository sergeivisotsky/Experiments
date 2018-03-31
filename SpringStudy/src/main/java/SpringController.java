import db.User;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
public class SpringController {
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
}
