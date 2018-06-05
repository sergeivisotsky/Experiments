package app.Service;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentServicе {
    void addRecord();

    void displayData();

    void deleteRecord();

    void getRecordById();
}
