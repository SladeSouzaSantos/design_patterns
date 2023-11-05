package database.after.factory;

import database.after.db.DB;
import database.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
