package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import org.junit.jupiter.api.Test;
import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Sevice.TestService;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TinhTrungBinh {
    @Test
    void testAvg1() {
        assertEquals(4.0, TestService.tinhTB(Arrays.asList(3, 4, 5)), 0.001);
    }

    @Test
    void testAvg2() {
        assertEquals(7.0, TestService.tinhTB(Arrays.asList(7, 7, 7)), 0.001);
    }

    @Test
    void testAvg3() {
        assertEquals(1.0, TestService.tinhTB(Arrays.asList(-1, 1, 3)), 0.001);
    }

    @Test
    void testAvg4() {
        assertEquals(15.0, TestService.tinhTB(Arrays.asList(15, 15)), 0.001);
    }

    @Test
    void testAvg5() {
        assertThrows(ArithmeticException.class, () -> TestService.tinhTB(Collections.emptyList()));
    }

    @Test
    void testAvg6() {
        assertEquals(-4.0, TestService.tinhTB(Arrays.asList(-2, -4, -6)), 0.001);
    }

    @Test
    void testAvg7() {
        assertEquals(6.0, TestService.tinhTB(Arrays.asList(4, 8)), 0.001);
    }

    @Test
    void testAvg8() {
        assertEquals(5.0, TestService.tinhTB(Arrays.asList(3, 5, 7)), 0.001);
    }

    @Test
    void testAvg9() {
        assertEquals(0.0, TestService.tinhTB(Arrays.asList(0, 0, 0, 0)), 0.001);
    }

    @Test
    void testAvg10() {
        assertEquals(9.0, TestService.tinhTB(Arrays.asList(9)), 0.001);
    }
}