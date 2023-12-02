package database.after;

import database.after.db.DB;
import database.after.factory.DBFactory;
import database.after.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {
		DBFactory dbFactory = new OracleFactory();

		DB db = dbFactory.getDatabase();
		
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
