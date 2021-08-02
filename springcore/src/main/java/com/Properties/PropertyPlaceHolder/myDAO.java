package com.Properties.PropertyPlaceHolder;

public class myDAO {
	private String dbServer;

	public myDAO(String dbServer) {
		this.dbServer = dbServer;
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "myDAO [dbServer=" + dbServer + "]";
	}

}
