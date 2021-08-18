package frontend;

import backend.Exercise1;

import java.io.IOException;
import java.sql.SQLException;

public class Program1 {
    public static void main(String[] args) throws SQLException, IOException {
        Exercise1 exercise1 = new Exercise1();
        exercise1.Q1();
        exercise1.Q2();
        exercise1.Q3();
        exercise1.Q4();
        exercise1.Q5();
    }
}

