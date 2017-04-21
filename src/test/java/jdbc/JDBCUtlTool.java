/**
 * 
 */
package jdbc;
import java.sql.Connection;  
import java.sql.DriverManager;  
import org.junit.Test;

import com.mysql.jdbc.Driver;
/**
 * 
 * 功能说明：jdbc连接测试
 *
 * @date 2017-4-21
 * @author chenwq
 * @email chenwqEmail@163.com
 *
 */
public class JDBCUtlTool {
    String url="jdbc:MySQL://localhost:3306/blog"; //连接数据库
    String name="blog";//连接mysql的用户名  
    String pwd="blog";//连接mysql的密码  
    @SuppressWarnings("unchecked")
	@Test 
    public  void testJDBC() throws Exception{ 
    	Class<Driver> forName = (Class<Driver>) Class.forName("com.mysql.jdbc.Driver");
		Class<Driver> theDriver = forName;
    	System.out.println("获取MySQL驱动包    "+theDriver.toString());
		Connection conn = DriverManager.getConnection(url,name,pwd);
		System.out.println("获取连接："+conn);
    }  
}
