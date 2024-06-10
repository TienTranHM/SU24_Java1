/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TienTHM_1
 */
public class HinhTron extends Hinh{
    private double banKinh;
    
    @Override
    public double tinhChuVi(){
        return 2 * 3.14 * banKinh;
    }
    
    @Override
    public double tinhDienTich(){
        return 3.14 * banKinh * banKinh;
    }
}
