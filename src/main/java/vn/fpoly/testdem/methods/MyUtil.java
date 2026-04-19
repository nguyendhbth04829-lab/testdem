package vn.fpoly.testdem.methods;

public class MyUtil {
    public int tinhtongtu1denn(int n){
        if (n<1){
            throw new IllegalArgumentException("n phai lon hon 1");
        }
        int tong= 0;
        for (int i = 1; i<=n;i++){
            tong += i;
        }
        return tong;
    }

}

