package vn.fpoly.testdem.methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {
    MyUtil myUtil = new MyUtil();
    @Test
    void tinhtongn() {
        assertEquals(6,myUtil.tinhtongtu1denn(3));
    }
}