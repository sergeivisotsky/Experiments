package app.Service;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentServiceDao {
    void addRecord();

    void displayData();

    void deleteRecord();

    void getRecordById();
}
