/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

import java.util.Scanner;

/**
 *
 * @author TienTHM_1
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau(){
        return this.donGia*0.1;
    }
    
    public void xuat(){
        System.out.println("Ten SP: " + this.tenSP);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Giam gia: " + this.giamGia);
        System.out.println("Thue XNK: " + this.getThueNhapKhau());
    }    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ten SP: ");
        this.tenSP = sc.nextLine();
        
        System.out.print("Moi nhap don gia: ");
        this.donGia = sc.nextDouble();
        
        System.out.print("Moi nhap giam gia: ");
        this.giamGia = sc.nextDouble();
    }
    
}
