package vn.fpoly.testdem.entity;

public class NhanVien {
    String maNv;
    String tenNV;
    int tuoi;
    double luong;
    String phongBan;

    public NhanVien(String maNv, String tenNV, int tuoi, double luong, String phongBan) {
        setMaNv(maNv);
        setTenNV(tenNV);
        setTuoi(tuoi);
        setLuong(luong);
        setPhongBan(phongBan);
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        if (maNv.trim().isEmpty()){
            throw new IllegalArgumentException("ma nv khong duoc de trong");
        }
        else if (maNv == null){
            throw new IllegalArgumentException("ma nhan vine khong duoc null");
        }
        this.maNv = maNv;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        if (tenNV.trim().isEmpty()){
            throw new IllegalArgumentException("ten trong");
        } else if (tenNV==null) {
            throw new IllegalArgumentException("ten null");
        }
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi<=0){
            throw new IllegalArgumentException("tuoi khong duoc be hon 1");
        }
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {

        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if (phongBan.trim().isEmpty()){
            throw new IllegalArgumentException("phong ban khong duoc trong");
        } else if (phongBan==null) {
            throw new IllegalArgumentException("phong ban null");
        }
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNv='" + maNv + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", tuoi=" + tuoi +
                ", soLuong=" + luong +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
