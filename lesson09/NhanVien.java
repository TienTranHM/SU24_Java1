/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09;

import java.util.Scanner;

/**
 *
 * @author TienTHM_1
 */
public class NhanVien {
    String maNV;
    String hoTen;
    double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien() {
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ma NV: ");
        this.maNV = sc.nextLine();
        System.out.print("Moi nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Moi nhap luong: ");
        this.luong = sc.nextDouble();
    }
    
    public void xuatThongTin(){
        System.out.println("Ma NV: " + this.maNV);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ma luong: " + this.luong);
    }
    
    
    
    
    
    
    
}
