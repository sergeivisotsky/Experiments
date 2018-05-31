package app;

import org.springframework.stereotype.Repository;

@Repository
public interface IFunctionalRepository {
    void addRecord();

    void displayData();

    void deleteRecord(String name, String surname);
}
