package org.zerock.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.fail;

@Log4j
public class JDBCTests {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

//    static {
//        try {
//            Class.forName("org.mariadb.jdbc.Driver");
//            con = DriverManager.getConnection(
//                    "jdbc:mariadb://sts-project.ckrxh8kwbp9e.ap-northeast-2.rds.amazonaws.com:3306/sts_project",
//                    "sts",
//                    "sts");
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCon() {
        try (
                Connection con = DriverManager.getConnection(
                        "jdbc:mariadb://sts-project.ckrxh8kwbp9e.ap-northeast-2.rds.amazonaws.com:3306/sts_project",
                        "sts",
                        "sts"
                )) {
            log.info(con);
        } catch (Exception e) {
//            fail(e.getMessage());
        }
    }
}
