package com.company;

public class Exercise5 {
    public static void main(String[] args) {
        //Create and insert department
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "SALE";
        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "DEV";
        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "TESTER";
        Department department4 = new Department();
        department4.departmentID = 4;
        department4.departmentName = "HUMAN RESOURCE";
        Department department5 = new Department();
        department5.departmentID = 5;
        department5.departmentName = "CEO";

        Department[] departments = {department1, department2, department3, department4, department5};

        //Question 1:
        //System.out.println(department1);


        //Question 2:

//        for (Department department : departments) {
//            System.out.println(department);
//        }


        //Question 3:
//        System.out.println(department1.hashCode());


        //Question 4:
//        System.out.println(department1.departmentName);
//        if (department1.departmentName.equals("Phòng A")) {
//            System.out.println("Phòng ban thứ 1 có tên là Phòng A");
//        }else
//            System.out.println("Phòng ban thứ 1 không phải Phòng A");


        //Question 5:
//        if (department1.equals(department2)) {
//            System.out.println("Hai phòng ban này giống nhau!");
//        }else System.out.println("Hai phòng ban này khác nhau!");


        //Question 6:
//        Department temp;
//        for (int i = 0; i< departments.length-1; i++){
//            for (int j = i + 1 ; j< departments.length;j++){
//                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName)>0) {
//                    temp = departments[i];
//                    departments[i] = departments[j];
//                    departments[j]= temp;
//                }
//            }
//        }
//        System.out.println("Danh sách department sau khi sắp xếp tên theo bảng chữ cái: ");
//        for (Department department : departments) {
//            System.out.println(department);
//        }


        //Question 7:
        String studentFullName[] = {"Trần Anh Tuấn","Nguyễn Thị Anh","Dào Thanh Hưng","Lê Đức Bảo","Hoàng Thị Gấm"};
        for (String fullName: studentFullName
             ) {
            System.out.println(fullName);
        }
        String studentLastName[] = new String[5];
        for (int i = 0; i<studentLastName.length; i++){
            studentLastName[i] = "";
        }
        String temp;
//        int indexStudent[] = new int[5];
        for (int i = 0; i < studentFullName.length; i++) {
            temp = studentFullName[i];
            for (int j = temp.length()-1;j > 0;j--){
                if (temp.charAt(j)!=' '){
                    studentLastName[i]= temp.charAt(j)+ studentLastName[i];
                }else break;
            }
        }
        System.out.println(studentLastName.length);
        int i,j;
        for (i = 0; i < studentLastName.length - 1; i++){
            for (j = i + 1 ; j< studentLastName.length;j++){
                if (studentLastName[i].compareToIgnoreCase(studentLastName[j])>0) {
                    temp = studentLastName[i];
                    studentLastName[i] = studentLastName[j];
                    studentLastName[j]= temp;
                }
            }
        }
        for (String lastName:studentLastName
             ) {
            System.out.println(lastName);
        }


    }
}
