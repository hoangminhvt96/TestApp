package com.example.anhmi.testapp.Model;

/**
 * Created by anhmi on 2/5/2018.
 */

public class Person {
    private String hoTen;
    private String diaChi;
    private String trangThai;

    public Person() {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "" +
                "Họ tên: " + hoTen + "\n" +
                "Địa chỉ: " + diaChi + "\n" +
                "Tình trạng: " + trangThai ;
    }

}
