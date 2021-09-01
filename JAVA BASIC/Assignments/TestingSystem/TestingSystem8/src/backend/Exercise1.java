package backend;

import entity.Exercise1.Student;
import entity.Exercise1.StudentQ45;

import java.util.*;

public class Exercise1 {
    Scanner scan = new Scanner(System.in);

    public void Q1() {
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Tran Van A");
        Student student2 = new Student("Dao Van B");
        Student student3 = new Student("Nguyen Van C");
        Student student4 = new Student("Tran Van A");
        Student student5 = new Student("Tran Van A");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        //a:
        System.out.println("---------------------------------");
        System.out.println("Tổng số phần tử của danh sách: " + studentList.size());
        //b:
        System.out.println("---------------------------------");
        System.out.println("Phần tử thứ 4 là:");
        System.out.println(studentList.get(4));
        //c:
        System.out.println("---------------------------------");
        System.out.println("Phần tử đầu tiên: ");
        System.out.println(studentList.get(0));
        System.out.println("Phần tử cuối cùng:");
        System.out.println(studentList.get(studentList.size() - 1));
        //d:
        System.out.println("---------------------------------");
        Student student6 = new Student("Le Thi E");
        studentList.add(0, student6);
        System.out.println("Đã thêm " + student6.getName() + " vào đầu danh sách:");
        //e:
        System.out.println("---------------------------------");
        Student student7 = new Student("Dang Van H");
        studentList.add(student7);
        System.out.println("Đã thêm " + student7.getName() + " vào cuối danh sách.");
        do {
            int choose;
            do {
                System.out.println("================================");
                System.out.println("========LIST FUNCTION===========");
                System.out.println("1. Đảo ngược danh sách.");
                System.out.println("2. Tìm kiếm theo ID.");
                System.out.println("3. Tìm kiếm theo tên.");
                System.out.println("4. Hiển thị các sinh viên trùng tên.");
                System.out.println("5. Xóa tên của sinh viên có ID = 2.");
                System.out.println("6. Xóa sinh viên có ID = 5.");
                System.out.println("7. Thêm tất cả sinh viên vào studentCopies");
                System.out.println("0. Thoát chương trình!");
                System.out.println();
                System.out.println("Mời nhập lựa chọn:");
                choose = scan.nextInt();
            } while (choose < 0 || choose > 7);
            switch (choose) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Danh sách sinh viên là:");
                    printStudentList(studentList);
//                  Collections.reverse(studentList);
                    //Hoặc
                    int a = studentList.size() - 1;
                    int b = 0;
                    while (b < a) {
                        Student temp = studentList.get(b);
                        studentList.set(b, studentList.get(a));
                        studentList.set(a, temp);
                        b++;
                        a--;
                    }
                    System.out.println("Danh sách sinh viên sau khi đảo!");
                    printStudentList(studentList);
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    int check = 0;
                    do {
                        System.out.println("Nhập Student ID cần tìm kiếm: ");
                        int inputID = scan.nextInt();
                        for (Student student : studentList) {
                            if (student.getID() == inputID) {
                                System.out.println(student);
                                check++;
                            }
                        }
                        if (check <= 0) {
                            System.out.println("Không có sinh viên nào có ID như đã nhập!");
                            System.out.println("Mời thực hiện lại thao tác!");
                            System.out.println();
                        }
                    } while (check <= 0);
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    check = 0;
                    do {
                        System.out.println("Nhập Student Name cần tìm kiếm: ");
                        String inputName = scan.nextLine();
                        for (Student student : studentList) {
                            if (student.getName().equals(inputName)) {
                                System.out.println(student);
                                check++;
                            }
                        }
                        if (check <= 0) {
                            System.out.println("Không có sinh viên nào có tên như đã nhập!");
                            System.out.println("Mời thực hiện lại thao tác!");
                            System.out.println();
                        }
                    } while (check <= 0);
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    printStudentList(studentList);
                    System.out.println("Các sinh viên trùng tên: ");
                    for (int i = 0; i < studentList.size(); i++) {
                        for (int j = i + 1; j < studentList.size(); j++) {
                            if (studentList.get(i).getName().equals(studentList.get(j).getName())) {
                                System.out.println(studentList.get(i));
                                System.out.println(studentList.get(j));
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("---------------------------------");
                    System.out.println();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getID() == 2) {
                            studentList.set(i, new Student(""));
                        }
                    }
                    System.out.println("Danh sách học sinh sau khi xóa tên học sinh có ID=2:");
                    printStudentList(studentList);
                    break;
                case 6:
                    //k
                    System.out.println("---------------------------------");
                    System.out.println();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getID() == 5) {
                            studentList.remove(i);
                        }
                    }
                    System.out.println("Danh sách học sinh sau khi xóa học sinh có ID=5:");
                    printStudentList(studentList);
                    break;
                case 7:
                    ArrayList<Student> studentCopies = new ArrayList<>();
                    studentCopies.addAll(studentList);
                    break;
                case 0:
                    return;
            }
        } while (true);
    }


    public void Q2() {
        //a:
        System.out.println("Thứ tự tới của các học sinh từ muộn nhất đến sớm nhất:");
        Stack();
        //b:
        System.out.println("Thứ tự tới của các học sinh từ sớm nhất đến muộn nhất:");
        Queue();
    }


    public void Q3() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Tran Van A"));
        students.add(new Student("Dao Van B"));
        students.add(new Student("Nguyen Van C"));
        students.add(new Student("Tran Van An"));
        students.add(new Student("Dang Van Cong"));
        System.out.println("=========DANH SÁCH CÁCH SINH VIÊN=============");
        printstudents(students);
        //a:
        System.out.println("---------------------------------");
        System.out.println("Tổng số phần tử của danh sách: " + students.size());
        //b:
        Iterator<Student> studentIteratorb = students.iterator();
        System.out.println("---------------------------------");
        System.out.println("Phần tử thứ 4 là:");
        for (int i = 0; i < 3; i++) {
            studentIteratorb.next();
        }
        System.out.println(studentIteratorb.next());
        //c:
        Iterator<Student> studentIteratorC = students.iterator();
        System.out.println("---------------------------------");
        System.out.println("Phần tử đầu tiên: ");
        System.out.println(studentIteratorC.next());
        System.out.println("Phần tử cuối cùng:");
        for (int i = 0; i < students.size()-2; i++) {
            studentIteratorC.next();
        }
        System.out.println(studentIteratorC.next());
        //d:
        System.out.println("---------------------------------");
        Student student6 = new Student("Le Thi E");
        Set<Student> studentsList = new HashSet<>();
        studentsList.add(student6);
        studentsList.addAll(students);
        System.out.println("Đã thêm " + student6.getName() + " vào danh sách:");
        System.out.println("Danh sách sinh viên sau khi thêm:");
        printstudents(studentsList);
        //e:
        System.out.println("---------------------------------");
        do {
            int choose;
            do {
                System.out.println("================================");
                System.out.println("========LIST FUNCTION===========");
                System.out.println("1. Tìm kiếm theo ID.");
                System.out.println("2. Tìm kiếm theo tên.");
                System.out.println("3. Xóa tên của sinh viên có ID = 2.");
                System.out.println("4. Xóa sinh viên có ID = 5.");
                System.out.println("5. Thêm tất cả sinh viên vào studentCopies");
                System.out.println("0. Thoát chương trình!");
                System.out.println();
                System.out.println("Mời nhập lựa chọn:");
                choose = scan.nextInt();
            } while (choose < 0 || choose > 5);
            switch (choose) {
                case 1:
                    System.out.println("---------------------------------");
                    int check = 0;
                    do {
                        System.out.println("Nhập Student ID cần tìm kiếm: ");
                        int inputID = scan.nextInt();
                        for (Student student : studentsList) {
                            if (student.getID() == inputID) {
                                System.out.println(student);
                                check++;
                            }
                        }
                        if (check <= 0) {
                            System.out.println("Không có sinh viên nào có ID như đã nhập!");
                            System.out.println("Mời thực hiện lại thao tác!");
                            System.out.println();
                        }
                    } while (check <= 0);
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    check = 0;
                    do {
                        scan.nextLine();
                        System.out.println("Nhập Student Name cần tìm kiếm: ");
                        String inputName = scan.nextLine();
                        for (Student student : studentsList) {
                            if (student.getName().equals(inputName)) {
                                System.out.println(student);
                                check++;
                            }
                        }
                        if (check <= 0) {
                            System.out.println("Không có sinh viên nào có tên như đã nhập!");
                            System.out.println("Mời thực hiện lại thao tác!");
                            System.out.println();
                        }
                    } while (check <= 0);
                    break;
                case 3:
                    Iterator<Student> studentIteratorCase3 = studentsList.iterator();
                    System.out.println("---------------------------------");
                    System.out.println();
                    for (int i = 0; i < studentsList.size(); i++) {
                        Student studentCase3 = studentIteratorCase3.next();
                        if (studentCase3.getID() == 2) {
                            studentCase3.setName(null);
                        }
                    }
                    System.out.println("Danh sách học sinh sau khi xóa tên học sinh có ID=2:");
                    printstudents(studentsList);
                    break;
                case 4:
                    studentsList.removeIf(student -> student.getID() == 5);
                    System.out.println("Danh sách học sinh sau khi xóa học sinh có ID=5:");
                    printstudents(studentsList);
                    break;
                case 5:
                    System.out.println("Tạo Set mới để copy sang:");
                    Set<Student> studentSetCopy = new HashSet<Student>();
                    System.out.println("Tạo thành công!");
                    studentSetCopy.addAll(studentsList);
                    System.out.println("Copy thành công");
                    System.out.println("In danh sách phần tử trong studentSetCopy: ");
                    Iterator<Student> studentIteratorCase5 = studentSetCopy.iterator();
                    for (int i = 0; i < studentSetCopy.size(); i++) {
                        System.out.println(studentIteratorCase5.next());
                    }
                    break;
                case 0:
                    return;
            }
        } while (true);
    }


    public void Q45() {
        List<StudentQ45> studentQ45s = new ArrayList<>();
        studentQ45s.add(new StudentQ45("Tuan"));
        studentQ45s.add(new StudentQ45("Anh"));
        studentQ45s.add(new StudentQ45("Binh"));
        studentQ45s.add(new StudentQ45("Tung"));
        studentQ45s.add(new StudentQ45("Hanh"));
        studentQ45s.add(new StudentQ45("Hoang"));
        System.out.println("Danh sách chưa sắp xếp:");
        for (StudentQ45 studentQ45 : studentQ45s) {
            System.out.println(studentQ45);
        }
        Collections.sort(studentQ45s);
        System.out.println("Danh sách sau khi sắp xếp:");
        for (StudentQ45 studentQ45 : studentQ45s) {
            System.out.println(studentQ45);
        }
    }


    public void Q67() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Tran Anh Tuan");
        students.put(2, "Dao Thanh Tung");
        students.put(3, "Nguyen Van A");
        students.put(4, "Tran Van B");
        students.put(5, "Le Thi C");
        students.put(6, "Dao Van D");

        //a
        System.out.println("=========================");
        System.out.println("Các key trong Map:");
        for (Map.Entry<Integer, String> student : students.entrySet()
        ) {
            System.out.println(student.getKey());
        }
        //b:
        System.out.println("=========================");
        System.out.println("Các value trong Map:");
        for (Map.Entry<Integer, String> student : students.entrySet()
        ) {
            System.out.println(student.getValue());
        }
    }

    public void Stack() {
        Stack<Student> students = new Stack<>();
        students.add(new Student("Nguyễn Văn Nam"));
        students.add(new Student("Nguyễn Văn Huyên"));
        students.add(new Student("Trần Văn Nam"));
        students.add(new Student("Nguyễn Văn A"));

        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
    }

    public void Queue() {
        Queue<Student> students = new LinkedList<>();
        students.add(new Student("Nguyễn Văn Nam"));
        students.add(new Student("Nguyễn Văn Huyên"));
        students.add(new Student("Trần Văn Nam"));
        students.add(new Student("Nguyễn Văn A"));

        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
    }


    public void printstudents(Set<Student> list) {
        for (Student student : list
        ) {
            System.out.println(student);
        }
    }


    public void printStudentList(ArrayList<Student> list) {
        for (Student student : list
        ) {
            System.out.println(student);
        }
    }
}
