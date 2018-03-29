package db;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DbHandlerTest {

    Connection conn;
    PreparedStatement pstmt;

    @BeforeClass
    public void beforeClass() {
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

    @Before
    public void openConnBeforerStmtTestASE() throws SQLException {
        File dbFile = new File(DbConstants.DB_FILE_PATH);
        final String DB_URL = "jdbc:sqlite:" +
                dbFile.getAbsolutePath() +
                "\\" + DbConstants.DB_FILE_NAME + ".db";
        conn = DriverManager.getConnection(DB_URL);
        conn.createStatement();
    }

    @After
    public void closeConnAfterStmtTestASE() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    @Test
    public void testCloseStatementASE() {
        Assert.assertNull("Error occured", pstmt);
    }

}