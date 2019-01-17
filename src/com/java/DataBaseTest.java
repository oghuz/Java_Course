package com.java;

import org.sqlite.JDBC;
import org.sqlite.jdbc4.JDBC4Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseTest {

    public static final String DB_NAME = "TestDB.db";
    public static final String TABLE_CONTACTS = "contacts";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/osmanjan/work/Java/Java_course/Java_Course/" + DB_NAME;
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    private static Connection conn;
    private static Statement statement;

    public DataBaseTest() {
        try {
            this.conn = DriverManager.getConnection(CONNECTION_STRING);
            this.statement = conn.createStatement();
            conn.setAutoCommit(false);
        }catch (SQLException e){
            System.out.printf("SQL data base table could not be created, info : %s%n", e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        try {
//            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS
                    + " ("
                    + COLUMN_NAME + "text, "
                    + COLUMN_PHONE + "integer, "
                    + COLUMN_EMAIL + "text"
                    + ")");

            //insetIntoContacts("osmanjan", 5105987400l, "osmanjan@gmail.com");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.printf("SQL data base table could not be created, info : %s%n", e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void insetIntoContacts(String name, long phone, String email) throws SQLException {

            statement.execute("insert into " + TABLE_CONTACTS + "("
                    + COLUMN_PHONE + ", "
                    + COLUMN_NAME + ", "
                    + COLUMN_EMAIL
                    + ")"
                    + "values(" + name + "," + phone + "," + email + ")");
    }

}

