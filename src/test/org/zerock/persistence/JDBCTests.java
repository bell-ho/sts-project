package org.zerock.persistence;

import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class JDBCTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testConne() {
        try (Connection con = DriverManager.getConnection(
                "jdbc:log4jdbc:mariadb://sts-project.ckrxh8kwbp9e.ap-northeast-2.rds.amazonaws.com:3306/sts_project",
                "sts",
                "managermanager"
        ))
        {
            log.info(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testC(){
        try (Connection con = dataSource.getConnection()){
            log.info(con);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testBa(){
        try (SqlSession session = sqlSessionFactory.openSession();
             Connection con = session.getConnection();
             ){
            log.info(session);
            log.info(con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
