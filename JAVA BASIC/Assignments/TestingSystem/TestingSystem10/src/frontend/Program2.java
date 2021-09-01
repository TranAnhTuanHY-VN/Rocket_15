package frontend;

import backend.Exercise2;
import entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) throws Exception {
        Ques1();
        Ques2_3();
//        Ques4();
//        Ques5();
//        Ques6();
//        Ques7();
    }



    public static void Ques1() throws IOException, SQLException, ClassNotFoundException {
        List<Department> departments = new Exercise2().getDepartments();
        for (Department department: departments
        ) {
            System.out.println(department);
        }
    }

    public static void Ques2_3() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập DepartmentID cần tìm kiếm:");
        int id = scanner.nextInt();
        Department department = new Exercise2().getDepartmentByID(id);
        System.out.println(department);
    }

    public static void Ques4() throws IOException, SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập DepartmentName cần kiểm tra: ");
        String departmentName = scanner.nextLine();
        boolean result = new Exercise2().isDepartmentNameExists(departmentName);
        if (result) {
            System.out.println("DepartmentName " + departmentName + " có tồn tại!");
        }else System.out.println("DepartmentName " + departmentName + " không tồn tại!");
    }

    public static void Ques5() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập DepartmentName cần thêm: ");
        String departmentName = scanner.nextLine();
        new Exercise2().createDepartment(departmentName);
    }

    public static void Ques6() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Department cần update:");
        System.out.println("DepartmentID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("DepartmentName:");
        String name = scanner.nextLine();
        new Exercise2().updateDepartmentName(id,name);
    }

    public static void Ques7() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập DepartmentID cần xóa: ");
        int id = scanner.nextInt();
        new Exercise2().deleteDepartment(id);
    }
}
