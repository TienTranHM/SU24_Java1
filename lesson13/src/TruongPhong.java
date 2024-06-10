/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TienTHM_1
 */
public class TruongPhong extends NhanVien{
    private double tienTrachNhiem;

//    public TruongPhong(String hoTen, double luong) {
//        super(hoTen, luong); // super = goi den ham khoi tao cua cha.
//                             // super = new NhanVien(hoTen, luong);
//    }

    public TruongPhong(String hoTen, double luong, double tienTrachNhiem) {
        super(hoTen, luong);
        this.tienTrachNhiem = tienTrachNhiem;
    }
    
    @Override
    public void xuatNV(){
        super.xuatNV();
        System.out.println("Tien trach nhiem: " + this.tienTrachNhiem);
    }
    
   
    
    
    
}
