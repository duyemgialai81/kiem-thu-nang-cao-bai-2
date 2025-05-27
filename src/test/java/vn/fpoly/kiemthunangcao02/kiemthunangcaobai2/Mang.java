package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import org.junit.jupiter.api.Test;
import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Sevice.TestService;

import static org.junit.jupiter.api.Assertions.*;

class Mang {

    @Test void testIndex1() { assertEquals(10, TestService.getElementAtIndex(new int[]{10, 20, 30}, 0)); }

    @Test void testIndex2() { assertEquals(30, TestService.getElementAtIndex(new int[]{10, 20, 30}, 2)); }

    @Test void testIndex3() { assertEquals(20, TestService.getElementAtIndex(new int[]{10, 20, 30}, 1)); }

    @Test void testIndex4() { assertEquals(30, TestService.getElementAtIndex(new int[]{10, 20, 30}, 2)); }

    @Test void testIndex5() { assertEquals(55, TestService.getElementAtIndex(new int[]{55}, 0)); }

    @Test void testIndex6() { assertEquals(70, TestService.getElementAtIndex(new int[]{70, 80, 90}, 0)); }

    @Test void testIndex7() { assertEquals(80, TestService.getElementAtIndex(new int[]{70, 80, 90}, 1)); }

    @Test void testIndex8() { assertEquals(90, TestService.getElementAtIndex(new int[]{70, 80, 90}, 2)); }

    @Test void testIndex9() { assertEquals(999, TestService.getElementAtIndex(new int[]{999, 888, 777}, 0)); }

    @Test void testIndex10() { assertEquals(888, TestService.getElementAtIndex(new int[]{999, 888, 777}, 1)); }

}