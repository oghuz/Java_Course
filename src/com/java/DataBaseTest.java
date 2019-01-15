package com.java;

import java.sql.*;

public class DataBaseTest {
public static final String DB_NAME = "TestDB.db";
public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/osmanjan/work/Java/Java_course/Java_Course/" + DB_NAME;

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/osmanjan/work/Java/Java_course/Java_Course/TestDB.db");
            conn.setAutoCommit(true);
            Statement statement = conn.createStatement();
            statement.execute("create table if not exists contacts " +
                              "(name TEXT, email TEXT, phone INTEGER)");
            statement.execute("insert into contacts (name, email, phone)" + "values('Dilmurat', 'dilmurat@gmail.com', 5102828288)");
            statement.execute("insert into contacts (name, email, phone)" + "values('osmanjan', 'osmanjan@gmail.com', 5105987400)");
            statement.execute("insert into contacts (name, email, phone)" + "values('john', 'john@gmail.com', 5102826764)");
            statement.execute("insert into contacts (name, email, phone)" + "values('trump', 'donald@gmail.com', 5102323212)");
            statement.execute("update contacts set phone=4081113232 where name='Dilmurat'");
            statement.execute("update contacts set phone=5113398980 where name='john'");
            statement.execute("delete from contacts where name='Dilmurat'");

//            statement.execute("select * from contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("select * from contacts");
            while (results.next()){
                System.out.println(results.getString("name") + " "+
                                    results.getInt("phone") + " " +
                                    results.getString("email") + " ");
            }

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.printf("SQL data base table could not be created, info : %s%n", e.getLocalizedMessage());
        }
    }

}
