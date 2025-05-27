package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import org.junit.jupiter.api.Test;
import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Sevice.TestService;

import static org.junit.jupiter.api.Assertions.*;

class TestUserProfile {
    @Test
    public void testGetName1() {
        TestService user = new TestService("Minh");
        assertEquals("Minh", TestService.getName());
    }

    @Test
    public void testGetName2() {
        TestService user = new TestService("Lan");
        assertEquals("Lan", TestService.getName());
    }

    @Test
    public void testGetName3() {
        TestService user = new TestService("789");
        assertEquals("789", TestService.getName());
    }

    @Test
    public void testGetName4() {
        TestService user = new TestService("");
        assertEquals("", TestService.getName());
    }

    @Test
    public void testGetName5() {
        TestService user = new TestService("TênĐặcBiệt@2025!");
        assertEquals("TênĐặcBiệt@2025!", TestService.getName());
    }

    @Test
    public void testGetName6() {
        TestService user = new TestService("  khoảng trắng  ");
        assertEquals("  khoảng trắng  ", TestService.getName());
    }

    @Test
    public void testGetName7() {
        TestService user = new TestService("NULL");
        assertEquals("NULL", TestService.getName());
    }

    @Test
    public void testGetName8() {
        TestService user = new TestService("null");
        assertEquals("null", TestService.getName());
    }

    @Test
    public void testGetName9() {
        TestService user = new TestService(null);
        assertThrows(NullPointerException.class, TestService::getName);
    }

    @Test
    public void testGetName10() {
        TestService user = new TestService("ANH");
        assertEquals("ANH", TestService.getName());
    }


}