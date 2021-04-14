package org.zerock.sample.zerock.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;


@Log4j
public class JDBCTests {

    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://sts-project.ckrxh8kwbp9e.ap-northeast-2.rds.amazonaws.com:3306/sts_project";
    private static final String USER = "sts";
    private static final String PW = "managermanager";

    @Test
    public void testConnectcion() throws Exception {
        Class.forName(DRIVER);

        try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
            log.info(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
