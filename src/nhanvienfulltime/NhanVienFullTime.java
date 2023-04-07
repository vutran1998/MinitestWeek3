package nhanvienfulltime;

import nhanvien.Home;
import nhanvien.NhanVien;

public class NhanVienFullTime extends NhanVien implements Comparable<NhanVienFullTime>  {
    public int bonus;
    public int fine;
    public int salary;

    public NhanVienFullTime(int id, String name, int age, int phone, String email, Home info, int bonus, int fine, int salary) {
        super(id, name, age, phone, email, info);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public NhanVienFullTime(int bonus, int fine, int salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRealSalary() {
        return (salary+bonus-fine);
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", info=" + info +
                '}';
    }
    @Override
    public int compareTo(NhanVienFullTime o) {
        return o.getSalary()- this.getSalary() ;
    }
}
