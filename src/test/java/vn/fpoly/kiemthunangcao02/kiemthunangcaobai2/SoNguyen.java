package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import org.junit.jupiter.api.Test;
import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Sevice.TestService;

import static org.junit.jupiter.api.Assertions.*;

class SoNguyen {

    @Test void testMultiply1() { assertEquals(15, TestService.testSoNguyen(3, 5)); }

    @Test void testMultiply2() { assertEquals(0, TestService.testSoNguyen(0, 8)); }

    @Test void testMultiply3() { assertEquals(-18, TestService.testSoNguyen(-6, 3)); }

    @Test void testMultiply4() { assertEquals(36, TestService.testSoNguyen(-6, -6)); }

    @Test void testMultiply5() { assertEquals(0, TestService.testSoNguyen(0, 0)); }

    @Test void testMultiply6() { assertEquals(64, TestService.testSoNguyen(8, 8)); }

    @Test void testMultiply7() { assertEquals(-90, TestService.testSoNguyen(9, -10)); }

    @Test void testMultiply8() { assertEquals(4, TestService.testSoNguyen(2, 2)); }

    @Test void testMultiply9() { assertEquals(-2, TestService.testSoNguyen(1, -2)); }

    @Test void testMultiply10() { assertEquals(81, TestService.testSoNguyen(9, 9)); }


}