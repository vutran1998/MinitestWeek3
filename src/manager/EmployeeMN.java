package manager;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import nhanvien.Home;
import nhanvien.NhanVien;
import nhanvienfulltime.NhanVienFullTime;
import nhanvienparttime.NhanVienPartTime;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMN {
    public static int averageSalary;

    public void display(ArrayList<NhanVien>list){
        for (NhanVien p:list) {
            System.out.println(p);
        }
    }

    public void averageSalary(ArrayList<NhanVien>list) {
        int salary1 = 0;
        int salary2 = 0;
        int count = 0;
        for (NhanVien p : list) {
            if (p instanceof NhanVienFullTime) {
                salary1 += ((NhanVienFullTime) p).getRealSalary();
            } else {
                salary2 += ((NhanVienPartTime) p).getRealSalary();
            }
            count++;
        }
        averageSalary = (salary1 + salary2) / count;
        System.out.println("Mức lương trung bình của cả công ty là" + averageSalary);
    }

    public void countEmploy(ArrayList<NhanVien>list) {
        for (NhanVien p : list) {
            if (p instanceof NhanVienFullTime) {
                if (((NhanVienFullTime) p).getSalary() < averageSalary) {
                    System.out.println("Nhân viên" + p.getName() + " có mức lương thấp hơn mức lương trung bình");
                }
            }
        }
    }

    public void countPartTimeMoney(ArrayList<NhanVien>list) {
        int count = 0;
        for (NhanVien p : list) {
            if (p instanceof NhanVienPartTime) {
                count += ((NhanVienPartTime) p).getRealSalary();
            }
        }
        System.out.println("Số lương phải trả cho toàn bộ nhân viên bán thời gian là " + count);
    }

    public void reDo(ArrayList<NhanVien>list) {
        for (NhanVien p : list) {
            if (p instanceof NhanVienFullTime) {
                ((NhanVienFullTime) p).compareTo(((NhanVienFullTime) p));
            }
        }
        for (NhanVien p : list) {
            System.out.println("danh sách nhân viên sau khi sắp xếp lại là");
            System.out.println(p);
        }
    }
}
