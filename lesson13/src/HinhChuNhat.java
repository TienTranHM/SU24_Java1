/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TienTHM_1
 */
public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;
    
    @Override
    public double tinhChuVi(){
        return 2 * (chieuDai + chieuRong);
    }
    
    @Override
    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }
}
