package app;

import org.springframework.stereotype.Repository;

@Repository
public interface FunctionalRepository {
    void addRecord();

    void displayData();

    void deleteRecord(String name, String surname);
}
