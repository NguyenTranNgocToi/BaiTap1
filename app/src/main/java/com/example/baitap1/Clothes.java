package com.example.baitap1;

public class Clothes {
    private String ten;
    private Double gia;
    private int ima;

    public String getTen() {
        return ten;
    }

    public Double getGia() {
        return gia;
    }

    public int getIma() {
        return ima;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public void setIma(int ima) {
        this.ima = ima;
    }

    public Clothes(String ten, Double gia, int ima) {
        this.ten = ten;
        this.gia = gia;
        this.ima = ima;
    }
}
