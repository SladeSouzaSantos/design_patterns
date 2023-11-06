package connectionPool.before;

import connectionPool.before.conn.Connection;
import connectionPool.before.conn.ConnectionPool;

public class ClientSingletonBefore {
	public static void doQuery1() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void exemplo() {
		doQuery1();
		doQuery2();
		doQuery3();
		
		//3 connections was made, even with 2 connections limit
	}
}
