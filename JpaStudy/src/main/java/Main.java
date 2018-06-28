import jpa.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                new Persistence.createEntityManagerFactory("employeeManager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee employee = new Employee();
        employee.setName("John");
        employee.setSurname("Smith");
        employee.setBirthDate(new Date());

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(employee);
        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
