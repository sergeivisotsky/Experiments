package app.Service;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentServicе {
    void addRecord();

    void retrieveData();

    void deleteRecord();

    void getRecordById();

    void orderById();
}
