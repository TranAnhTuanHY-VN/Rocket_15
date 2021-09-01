package com.vti.backend;

import com.vti.entity.E5Q4.Article;
import com.vti.entity.E5Q4.Book;
import com.vti.entity.E5Q4.Document;
import com.vti.entity.E5Q4.Magazine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    private ArrayList<Document> docList;
    private Scanner scan;

    public QLTV() {
        docList = new ArrayList<Document>();
        scan = new Scanner(System.in);
    }

    public void main() {
        do {
            int check;
            do {
                System.out.println();
                System.out.println("=============================");
                System.out.println("=====DANH SÁCH CHỨC NĂNG=====");
                System.out.println("1.Thêm mới tài liệu.");
                System.out.println("2.Xóa tài liệu.");
                System.out.println("3.Hiển thị thông tin tài liệu.");
                System.out.println("4.Tìm kiếm tài liệu theo loại: Sách, Tạp chí, Báo.");
                System.out.println("0.Thoát khỏi chương trình.");
                System.out.println("=============================");
                System.out.println("Mời bạn chọn chức năng: ");
                check = scan.nextInt();
            } while (check < 0 || check > 4);
            switch (check) {
                case 0:
                    return;
                case 1:
                    addDocument();
                    break;
                case 2:
                    delDocument();
                    break;
                case 3:
                    showListDocument();
                    break;
                case 4:
                    searchDocument();
                    break;
            }
            System.out.println("Đã hoàn thành thao tác!Tiếp tục chương trình.....");
        } while (true);
    }

    public void addDocument() {
        int check;
        do {
            System.out.println();
            System.out.println("=============================");
            System.out.println("===DANH SÁCH LOẠI TÀI LIỆU===");
            System.out.println("1.Sách");
            System.out.println("2.Tạp chí");
            System.out.println("3.Báo");
            System.out.println("=============================");
            System.out.println("Nhập loại tìa liệu bạn muốn thêm: ");
            check = scan.nextInt();
            System.out.println();
        } while (check < 1 || check > 3);
        String ID, publisher;
        int numRelease, d, m, y;
        switch (check) {
            case 1:
                String authorName;
                int numPage;
                System.out.println("====NHẬP THÔNG TIN SÁCH====");
                System.out.println("Mã sách: ");
                scan.nextLine();
                ID = scan.nextLine();
                System.out.println("Nhà xuất bản: ");
                scan.nextLine();
                publisher = scan.nextLine();
                System.out.println("Số lượng xuất bản:");
                numRelease = scan.nextInt();
                System.out.println("Tên tác giả: ");
                scan.nextLine();
                authorName = scan.nextLine();
                System.out.println("Số trang:");
                numPage = scan.nextInt();
                Book book = new Book(ID, publisher, numRelease, authorName, numPage);
                docList.add(book);
                System.out.println();
                break;
            case 2:
                int idRelease;
                LocalDate monthRelease;
                System.out.println("====NHẬP THÔNG TIN TẠP CHÍ====");
                System.out.println("Mã tạp chí: ");
                scan.nextLine();
                ID = scan.nextLine();
                System.out.println("Nhà xuất bản: ");
                scan.nextLine();
                publisher = scan.nextLine();
                System.out.println("Số lượng xuất bản:");
                numRelease = scan.nextInt();
                System.out.println("Số phát hành: ");
                idRelease = scan.nextInt();
                System.out.println("Ngày phát hành:");
                d = scan.nextInt();
                System.out.println("Tháng phát hành: ");
                m = scan.nextInt();
                System.out.println("Năm phát hành: ");
                y = scan.nextInt();
                monthRelease = LocalDate.of(y, m, d);
                Magazine magazine = new Magazine(ID, publisher, numRelease, idRelease, monthRelease);
                docList.add(magazine);
                System.out.println();
                break;
            case 3:
                LocalDate dayRelease;
                System.out.println("====NHẬP THÔNG TIN BÁO====");
                System.out.println("Mã báo: ");
                scan.nextLine();
                ID = scan.nextLine();
                System.out.println("Nhà xuất bản");
                scan.nextLine();
                publisher = scan.nextLine();
                System.out.println("Số lượng xuất bản:");
                numRelease = scan.nextInt();
                System.out.println("Ngày phát hành:");
                d = scan.nextInt();
                System.out.println("Tháng phát hành: ");
                m = scan.nextInt();
                System.out.println("Năm phát hành: ");
                y = scan.nextInt();
                dayRelease = LocalDate.of(y, m, d);
                Article article = new Article(ID, publisher, numRelease, dayRelease);
                docList.add(article);
                System.out.println();
                break;
        }

    }

    public void delDocument() {
        String ID;
        System.out.println("Nhập mã tài liệu cần xóa: ");
        ID = scan.next();
        docList.removeIf(document -> document.getID().equals(ID));
        System.out.println();
        System.out.println("Danh sách tài liệu sau khi xóa: ");
        printList();
    }

    public void printList() {
        for (Document docInfor : docList
        ) {
            System.out.println(docInfor);
        }
    }

    public void showListDocument() {
        printList();
    }

    public void searchDocument() {
        System.out.println("Nhập vào loại tài liệu cần tìm kiếm 1.Sách, 2. Báo, 3. Tạp chí:");
        int chooseCategory = scan.nextInt();
        switch (chooseCategory) {
            case 1:
                for (Document document : docList) {
                    if (document instanceof Book) {
                        System.out.println(document);
                    }
                }
                break;
            case 2:
                for (Document document : docList) {
                    if (document instanceof Article) {
                        System.out.println(document);
                    }
                }
                break;
            case 3:
                for (Document document : docList) {
                    if (document instanceof Magazine) {
                        System.out.println(document);
                    }
                }
                break;
            default:
                System.out.println("Nhập không đúng.!!");
                break;
        }
    }
}
