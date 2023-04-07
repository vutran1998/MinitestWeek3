package nhanvienparttime;

import nhanvien.Home;
import nhanvien.NhanVien;

public class NhanVienPartTime extends NhanVien {
    public int time;

    public NhanVienPartTime(int id, String name, int age, int phone, String email, Home info, int time) {
        super(id, name, age, phone, email, info);
        this.time = time;
    }

    public NhanVienPartTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getRealSalary() {
        return time * 100000;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "time=" + time +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", info=" + info +
                '}';
    }
}
