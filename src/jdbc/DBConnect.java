package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try( Connection c= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf-8","root","admin");
             Statement s=c.createStatement();) {

            //System.out.println("数据库驱动加载成功！,获取链接"+c);
            String sql;
            for (int i = 0; i < 100; i++) {
                sql="insert into hero(id,name,hp,damage) values(null,"+"'hero-"+i+"',"+Math.random()*100+","+(int)(Math.random()*100)+")";
                s.execute(sql);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

        }
    }
}
