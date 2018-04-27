import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Controller
public class SpringController {
    public BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));


}
