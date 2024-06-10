/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TienTHM_1
 */
public class NhanVien {
    protected String hoTen;
    protected double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    public void xuatNV(){
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Luong: " + this.luong);
    }
    
    
}
