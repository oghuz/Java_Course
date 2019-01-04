package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseTest {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/osmanjan/work/Java/Java_course/Java_Course/TestDB.db");
        }catch(SQLException e){
            System.out.printf("SQL data base table could not be created, info : %s%n", e.getLocalizedMessage());
        }
    }

}
