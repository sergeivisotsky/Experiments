package SpringStudy.db;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DbHandlerTest {
    Connection conn;
    PreparedStatement pstmt;

    @BeforeClass
    public void BeforeClass() {
        conn = null;
        pstmt = null;
    }

    @AfterClass
    public void releaseResource() throws SQLException {
        if (pstmt != null) {
            pstmt.close();
        }

        if (conn != null) {
            conn.close();
        }
    }
}