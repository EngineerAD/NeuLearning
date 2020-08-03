package com.sql.query;

import java.sql.*;

public class Test {

	// MySQL 8.0 ���°汾 - JDBC �����������ݿ� URL
	// static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

	// MySQL 8.0 ���ϰ汾 - JDBC �����������ݿ� URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/neutechdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

	// ���ݿ���û��������룬��Ҫ�����Լ�������
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// ע�� JDBC ����
			Class.forName(JDBC_DRIVER);

			// ������
			System.out.println("�������ݿ�...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// ִ�в�ѯ
			System.out.println("ʵ����Statement����...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT ename from emp where ename like '__a%'";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("\n���������");
			// չ����������ݿ�
			while (rs.next()) {
				// ͨ���ֶμ���
				String name = rs.getString("ename");

				// �������
				System.out.println("������������ĸ��a��Ա����" + name);
			}
			// ��ɺ�ر�
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// ���� JDBC ����
			se.printStackTrace();
		} catch (Exception e) {
			// ���� Class.forName ����
			e.printStackTrace();
		} finally {
			// �ر���Դ
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // ʲô������
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("\n���ݿ������ѹرղ��ͷ������Դռ�ã�Goodbye!");
	}

}
