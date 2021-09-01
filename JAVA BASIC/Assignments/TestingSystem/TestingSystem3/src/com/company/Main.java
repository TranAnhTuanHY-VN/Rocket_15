package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {

    public String hoTen;
    public int diem;
}

class JavaAndroidVn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        int n = input.nextInt();

        ArrayList<SinhVien> danhSach = new ArrayList();

        for (int i = 0; i < n; i++) {
            input.nextLine();
            SinhVien x = new SinhVien();
            System.out.println("Thông tin sinh viên thứ " + i);
            System.out.print("Họ và Tên: ");
            x.hoTen = input.nextLine();
            System.out.print("Điểm: ");
            x.diem = input.nextInt();
            danhSach.add(x);
        }

        //Sắp xếp danh sách theo theo thứ tự a b c!
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return (sv1.hoTen.compareTo(sv2.hoTen));
                // Muốn đảo danh sách các bạn đối thành
                //return (sv2.hoTen.compareTo(sv1.hoTen));
            }
        });

        System.out.println("Danh sách sắp xếp theo tên trong bảng chữ cái a - b - c: ");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Tên: " + danhSach.get(i).hoTen + " Điểm: " + danhSach.get(i).diem);
        }
    }
}
