package frontend;

import backend.Exercise2;
import backend.Exercise4;
import entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Program4 {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        printDepartments();
        Ques1();
    }

    public static void printDepartments() throws IOException, SQLException, ClassNotFoundException {
        List<Department> departments = new Exercise2().getDepartments();
        for (Department department: departments
        ) {
            System.out.println(department);
        }
    }
    public static void Ques1() throws IOException, SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập DepartmentID:");
        int id = scanner.nextInt();

        new Exercise4().deleteDepartmentUsingTransaction(id);
        System.out.println("Delete Success!");

    }
}
