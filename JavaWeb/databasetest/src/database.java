//导入包
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 数据库连接
 */
public class database {
    public static void main(String[] args) {
        Connection con;
        //jdbc驱动
        String driver="com.mysql.jdbc.Driver";
        //这里我的数据库是cxxt
        String url="jdbc:mysql://localhost:3306/databasetest?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="fuzhihang..";
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            if (con!=null)
            {
                System.out.println("数据库连接成功");
            }
            con.close();
        } catch (ClassNotFoundException e)
        {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
