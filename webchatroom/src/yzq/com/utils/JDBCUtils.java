package yzq.com.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * JDBC工具类:
 * 	* 加载驱动
 *  * 获得连接
 *  * 释放资源
 *  	* 代码都重复.
 * @author 姜涛
 *
 */
public class JDBCUtils {
	
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	// 获得连接池:
	public static DataSource getDataSource(){
		return dataSource;
	}
	
	// 获得连接
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
