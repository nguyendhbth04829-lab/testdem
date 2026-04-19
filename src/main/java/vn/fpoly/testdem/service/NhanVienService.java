package vn.fpoly.testdem.service;

import vn.fpoly.testdem.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> nhanViens= new ArrayList<>();
    public  void addNhanVien(NhanVien nhanVien){
        if (nhanVien.getLuong()>0&&nhanVien.getLuong()<=100000000){
            nhanViens.add(nhanVien);
        }else {
            throw new IllegalArgumentException("Luong khong duoc < 0 va >= 100tr");
        }
    }
    public NhanVien getById(String maNV){
        for (NhanVien nhanVien : nhanViens){
            if (nhanVien.getMaNv().equals(maNV)){
                return nhanVien;
            }else {
                throw new IllegalArgumentException("ma nv khong ton tai");
            }
        }
        return null;
    }
    public List<NhanVien> getAll(){
        return nhanViens;   }
}

