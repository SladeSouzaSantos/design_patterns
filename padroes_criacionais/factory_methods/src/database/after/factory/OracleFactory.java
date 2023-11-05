package database.after.factory;

import database.after.db.DB;
import database.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
