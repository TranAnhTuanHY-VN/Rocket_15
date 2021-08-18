package com.vti.backend;

import com.vti.entity.Employee;
import com.vti.entity.Engineer;
import com.vti.entity.Staff;
import com.vti.entity.Staff.Gender;
import com.vti.entity.Worker;
import com.vti.entity.E5Q3.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    private ArrayList<Staff> staffList;
    private Scanner scan;

    public Exercise5() {
        staffList = new ArrayList<Staff>();
        scan = new Scanner(System.in);
    }

    //Question2
    public void main() {
        do {
            int check;
            do {
                System.out.println();
                System.out.println("==================================");
                System.out.println("==Nhập thao tác muốn thực hiện===");
                System.out.println("1. Thêm mới cán bộ.");
                System.out.println("2. Tìm kiếm theo họ tên.");
                System.out.println("3. Hiển thị thông tin danh sách cán bộ.");
                System.out.println("4. Xóa cán bộ theo tên");
                System.out.println("0. Thoát chương trình");
                System.out.println("==================================");
                System.out.println("Mời nhập lựa chọn của bạn: ");
                check = scan.nextInt();
                System.out.println();
            } while (check < 0 || check > 4);
            switch (check) {
                case 0:
                    return;
                case 1:
                    addStaff();
                    break;
                case 2:
                    searchStaff();
                    break;
                case 3:
                    showListStaff();
                    break;
                case 4:
                    deleteStaff();
                    break;
            }
            System.out.println("====Đã thực hiện xong thao tác!====");
        }while(true);
    }

    public void addStaff() {
        int check;
        do {
            System.out.println();
            System.out.println("=======================");
            System.out.println("===Lựa chọn chức năng==");
            System.out.println("1.Thêm Engineer");
            System.out.println("2.Thêm Worker");
            System.out.println("3.Thêm Employee");
            System.out.println("=======================");
            System.out.println("Nhập lựa chọn: ");
            check = scan.nextInt();
            System.out.println();
        } while (check<1 || check >3);
        int flagGender;
        switch (check) {
            case 1:
                String engineerName, engineerAddress, engineerMajor;
                int engineerAge;
                Gender engineerGender = null;
                scan.nextLine();
                System.out.println("---Nhập thông tin của Engineer---");
                System.out.println("Tên: ");
                engineerName = scan.nextLine();
                System.out.println("Tuổi: ");
                engineerAge = scan.nextInt();
                do {
                    System.out.println("Giới tính(1.Male,2.Female,0.Unknown): ");
                    flagGender = scan.nextInt();
                } while (flagGender<0 || flagGender>2);
                switch (flagGender) {
                    case 0:
                        engineerGender = Gender.UNKNOWN;
                        break;
                    case 1:
                        engineerGender = Gender.MALE;
                        break;
                    case 2:
                        engineerGender = Gender.FEMALE;
                        break;
                }
                scan.nextLine();
                System.out.println("Địa chỉ: ");
                engineerAddress = scan.nextLine();
                System.out.println("Chuyên ngành: ");
                engineerMajor = scan.nextLine();
                Staff newEngineer = new Engineer(engineerName,engineerAge,engineerGender,engineerAddress,engineerMajor);
                staffList.add(newEngineer);
                break;
            case 2:
                String workerName, workerAddress;
                int workerAge, workerLevel;
                Gender workerGender = null;
                System.out.println("---Nhập thông tin của Worker---");
                scan.nextLine();
                System.out.println("Tên: ");
                workerName = scan.nextLine();
                System.out.println("Tuổi: ");
                workerAge = scan.nextInt();
                do {
                    System.out.println("Giới tính(1.Male,2.Female,0.Unknown): ");
                    flagGender = scan.nextInt();
                } while (flagGender<0 || flagGender>2);
                switch (flagGender) {
                    case 0:
                        workerGender = Gender.UNKNOWN;
                        break;
                    case 1:
                        workerGender = Gender.MALE;
                        break;
                    case 2:
                        workerGender = Gender.FEMALE;
                        break;
                }
                scan.nextLine();
                System.out.println("Địa chỉ: ");
                workerAddress = scan.nextLine();
                System.out.println("Bậc: ");
                workerLevel = scan.nextInt();
                Staff newWorker = new Worker(workerName, workerAge, workerGender,workerAddress,workerLevel);
                staffList.add(newWorker);
                break;
            case 3:
                String employeeName, employeeAddress;
                int employeeAge;
                String employeeTask;
                Gender employeeGender = null;
                System.out.println("---Nhập thông tin của Employee---");
                scan.nextLine();
                System.out.println("Tên: ");
                employeeName = scan.nextLine();
                System.out.println("Tuổi: ");
                employeeAge = scan.nextInt();
                do {
                    System.out.println("Giới tính(1.Male,2.Female,0.Unknown): ");
                    flagGender = scan.nextInt();
                } while (flagGender<0 || flagGender>2);
                switch (flagGender) {
                    case 0:
                        employeeGender = Gender.UNKNOWN;
                        break;
                    case 1:
                        employeeGender = Gender.MALE;
                        break;
                    case 2:
                        employeeGender = Gender.FEMALE;
                        break;
                }
                scan.nextLine();
                System.out.println("Địa chỉ: ");
                employeeAddress = scan.nextLine();
                System.out.println("Công việc: ");
                employeeTask = scan.nextLine();
                Staff newEmployee = new Employee(employeeName, employeeAge, employeeGender,employeeAddress,employeeTask);
                staffList.add(newEmployee);
                break;
        }
    }

    public void searchStaff() {
        System.out.println("Nhập tên cán bộ muốn tìm kiếm:");
        String findName = scan.next();
        for (Staff staffInfo : staffList
        ) {
            if (staffInfo.getFullName().equals(findName)) {
                System.out.println(staffInfo);
            }
        }
    }

    public void showListStaff() {
        printListStaff();
    }

    public void deleteStaff() {
        System.out.println("Nhập tên cán bộ cần xóa: ");
        String delName = scan.next();
        staffList.removeIf(staff -> staff.getFullName().equals(delName));
        printListStaff();
    }

    public void printListStaff() {
        for (Staff staffInfo : staffList
        ) {
            System.out.println(staffInfo);
        }
    }

    //Question3:
    public void Q3(){
        highSchoolStudent student = new highSchoolStudent(1,"Nam","Chuyên Văn","Đại học công nghệ");
        highSchoolStudent student1 = new highSchoolStudent(2,"Tuan", "Toán","Đại học Công Nghiệp Hà Nội");
        System.out.println(student);
        System.out.println(student1);

    }
}
