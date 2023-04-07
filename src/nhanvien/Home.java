package nhanvien;

public class Home {
    public String city;
    public String district;
    public String commune;
    public String number;

    public Home(String city, String district, String commune, String number) {
        this.city = city;
        this.district = district;
        this.commune = commune;
        this.number = number;
    }

    public Home() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", commune='" + commune + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
