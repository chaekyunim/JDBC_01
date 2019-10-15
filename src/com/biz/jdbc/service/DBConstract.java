package com.biz.jdbc.service;

public class DBConstract {

	public static class DB_INFO {
		
     public static String jdbcDriver = "jdbc:oracle:thin:@localhost:1521:xe";
     public static String url = "jdbc:oracle:thin:@localhost:1521:xe";
     public static String userName = "grade";
     public static String password = "grade";
     
     
     
	public static class SCORE {

		public static int S_ID = 1;
		public static int S_STD = 2;
		public static int S_SCORE = 3;
		public static int S_REM = 4;
		
		
	}
}
}