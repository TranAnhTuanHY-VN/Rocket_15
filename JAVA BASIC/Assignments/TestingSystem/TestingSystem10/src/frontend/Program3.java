package frontend;

import backend.Exercise2;
import backend.Exercise3;
import entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) throws Exception {
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

    public static void Ques1() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập DepartmentID cần xóa:");
        int id = scanner.nextInt();
        new Exercise3().deleteDepartmentUsingProcedure(id);
    }
}
