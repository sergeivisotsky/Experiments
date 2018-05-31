package app;

import app.db.IStudentDAO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class MainLoader {
    public static void main(String[] args) {
//        SpringApplication.run(MainLoader.class, args);
        ApplicationContext context = new GenericApplicationContext();
        ((GenericApplicationContext) context).refresh();
        IStudentDAO IStudentDAO = context.getBean("IStudentDAO", IStudentDAO.class);
    }
}
