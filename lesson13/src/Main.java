/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TienTHM_1
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Nguyen Quang Tuan", 1000000);
        nhanVien1.xuatNV();
        
        System.out.println("-------------");
        
        TruongPhong truongPhong1 = new TruongPhong("Tran Kieu Anh", 1000000, 500000);
        truongPhong1.xuatNV();
    }
}
