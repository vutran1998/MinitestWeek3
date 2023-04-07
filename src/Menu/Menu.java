package Menu;

import manager.EmployeeMN;
import nhanvien.Home;
import nhanvien.NhanVien;
import nhanvienfulltime.NhanVienFullTime;
import nhanvienparttime.NhanVienPartTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<NhanVien> list = new ArrayList<>();
    public static void EmployeeMN(ArrayList<NhanVien>list) {
        list.add(new NhanVienFullTime(1, "vũ", 25, 11223, "vu@gmail.com", new Home("hanoi", "longbien", "ngoclam", "24"), 1000000, 300000, 10000000));
        list.add(new NhanVienFullTime(2, "anh", 21, 22334, "anh@gmail.com", new Home("haiphong", "lechan", "hoangmai", "25"), 2000000, 300000, 9000000));
        list.add(new NhanVienFullTime(3, "công", 26, 33445, "cong@gmail.com", new Home("quangninh", "hoaphuong", "kimma", "26"), 3000000, 300000, 8000000));
        list.add(new NhanVienFullTime(4, "dũng", 29, 44556, "dung@gmail.com", new Home("namdinh", "baida", "hami", "27"), 4000000, 300000, 7000000));
        list.add(new NhanVienPartTime(5, "tung", 22, 66668, "tung@gmail.com", new Home("hanam", "tinphuong", "tanminh", "15"), 200));
        list.add(new NhanVienPartTime(6, "minh", 23, 67778, "minh@gmail.com", new Home("quatlam", "linhcao", "tancao", "16"), 250));
        list.add(new NhanVienPartTime(7, "nam", 24, 64458, "nam@gmail.com", new Home("camau", "linhlun", "caominh", "17"), 300));
        list.add(new NhanVienPartTime(8, "son", 28, 69998, "son@gmail.com", new Home("ninhbinh", "linhbeo", "khaison", "18"), 400));
    }
    public static void main(String[] args) {
        EmployeeMN(list);
        Scanner scanner = new Scanner(System.in);
        EmployeeMN employeeMN = new EmployeeMN();
        int choice;
        do {
            System.out.println("Mời bạn nhập lựa chọn");
            System.out.println("1.Hiển thị sản phẩm ");
            System.out.println("2.Tính lương trung bình của nhân viên");
            System.out.println("3.Kiểm tra nhân viên Fulltime có mức lương thấp hơn trung bình");
            System.out.println("4.Số luơng phải trả cho toàn bộ nhân viên Parttime");
            System.out.println("5.Sắp xếp danh sách nhân viên Full time có mức lương tăng dần");
            System.out.println("6.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeMN.display(list);
                    break;
                case 2:
                    employeeMN.averageSalary(list);
                    break;
                case 3:
                    employeeMN.countEmploy(list);
                    break;
                case 4:
                    employeeMN.countPartTimeMoney(list);
                    break;
                case 5:
                    employeeMN.reDo(list);
                    break;

            }
        } while (choice!=6);
    }
}
