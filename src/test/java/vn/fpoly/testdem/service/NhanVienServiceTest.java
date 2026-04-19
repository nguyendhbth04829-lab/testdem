package vn.fpoly.testdem.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vn.fpoly.testdem.entity.NhanVien;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    NhanVienService nhanVienService;
    @BeforeEach
    void setUp() {
        nhanVienService= new NhanVienService();
    }
    @Test
    @DisplayName("luong chinh add")
    void addNhanVienThanhCong(){
        NhanVien nhanVien = new NhanVien("nv1","bao",18,100000,"IT");
        nhanVienService.addNhanVien(nhanVien);
//        assertEquals(1,nhanVienService.getAll().size());
        assertEquals("nv1",nhanVienService.getById("nv1").getMaNv());
    }

    @Test
    void addNhanVienVoiLuongNhoHon0(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("nv2","bo",19,0,"KO")));
        assertEquals("Luong khong duoc < 0 va >= 100tr",exception.getMessage());
    }
    @Test
    void addNhanVienVoiLuongLonHon100tr(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("nv3","beo",22,110000000,"IT")));
        assertEquals("Luong khong duoc < 0 va >= 100tr",exception.getMessage());
    }
    @Test
    void addNhanVienVoiLuong1(){
        NhanVien nhanVien = new NhanVien("nv4","lo",23,1,"OK");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(1,nhanVienService.getById("nv4").getLuong());
    }

    @Test
    void addNhanVienVoiLuong100tr(){
        NhanVien nhanVien = new NhanVien("nv5","ll",19,100000000,"pp");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(100000000,nhanVienService.getById("nv5").getLuong());
    }
}