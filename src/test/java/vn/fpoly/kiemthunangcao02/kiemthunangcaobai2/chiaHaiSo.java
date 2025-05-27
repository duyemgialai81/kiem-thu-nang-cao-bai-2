package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chiaHaiSo {

    @Test void testDivide1() { assertEquals(4, TestService.chiaHaiSo(20, 5)); }

    @Test void testDivide2() { assertEquals(-5, TestService.chiaHaiSo(-25, 5)); }

    @Test void testDivide3() { assertEquals(6, TestService.chiaHaiSo(-30, -5)); }

    @Test void testDivide4() { assertEquals(0, TestService.chiaHaiSo(0, 10)); }

    @Test void testDivide5() { assertThrows(ArithmeticException.class, () -> TestService.chiaHaiSo(15, 0)); }

    @Test void testDivide6() { assertEquals(2, TestService.chiaHaiSo(10, 5)); }

    @Test void testDivide7() { assertEquals(-3, TestService.chiaHaiSo(9, -3)); }

    @Test void testDivide8() { assertEquals(4, TestService.chiaHaiSo(9, 2)); }

    @Test void testDivide9() { assertEquals(0, TestService.chiaHaiSo(2, 7)); }

    @Test void testDivide10() { assertEquals(-2, TestService.chiaHaiSo(-5, 2)); }

}