package com.mybatises.demo;

import com.mybatises.demo.dao.es.RwTradeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.sql.*;

/**
 * 测试类 弃用...
 */
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String JDBC_DRIVER = "com.cloudera.impala.jdbc41.Driver";
        String CONNECTION_URL = "jdbc:impala://192.168.174.120:21050";
        try {
            Class.forName(JDBC_DRIVER);
            con = (Connection) DriverManager.getConnection(CONNECTION_URL);
            ps = con.prepareStatement("select * from ecommerce.employee;");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Autowired
    private RwTradeMapper rwTradeMapper;

    @Test
    @Rollback
    public void testRwTradeMapper() throws Exception {
        String s = rwTradeMapper.testSql();
        System.out.println(s);
    }

}
