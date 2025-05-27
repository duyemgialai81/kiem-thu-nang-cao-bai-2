package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestArrayUtils {
    @Test
    public void testFindMin1() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(10, TestService.findMin(array));
    }

    @Test
    public void testFindMin2() {
        int[] array = {-10, -20, -30, -40, -50};
        assertEquals(-50, TestService.findMin(array));
    }

    @Test
    public void testFindMin3() {
        int[] array = {500, 400, 300, 100};
        assertEquals(100, TestService.findMin(array));
    }

    @Test
    public void testFindMin4() {
        int[] array = {7, 7, 7, 7};
        assertEquals(7, TestService.findMin(array));
    }

    @Test
    public void testFindMin5() {
        int[] array = {Integer.MIN_VALUE + 1, Integer.MIN_VALUE};
        assertEquals(Integer.MIN_VALUE, TestService.findMin(array));
    }

    @Test
    public void testFindMin6() {
        int[] array = {42};
        assertEquals(42, TestService.findMin(array));
    }

    @Test
    public void testFindMin7() {
        int[] array = {8, 6, 3, 2, 1};
        assertEquals(1, TestService.findMin(array));
    }

    @Test
    public void testFindMin8() {
        int[] array = {99, -99, 0, -1};
        assertEquals(-99, TestService.findMin(array));
    }

    @Test
    public void testFindMin9() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> TestService.findMin(array));
    }

    @Test
    public void testFindMin10() {
        int[] array = null;
        assertThrows(IllegalArgumentException.class, () -> TestService.findMin(array));
    }



}