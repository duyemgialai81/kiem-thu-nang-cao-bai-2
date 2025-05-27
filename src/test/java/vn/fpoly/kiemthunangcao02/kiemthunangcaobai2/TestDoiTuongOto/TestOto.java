package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.TestDoiTuongOto;

import org.junit.jupiter.api.Test;
import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Model.Oto;
import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Sevice.OtoService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestOto {
    @Test
    void testAddOto() {
        OtoService otoService = new OtoService();
        Oto oto = new Oto(1, "Vios",50000, "Toyota");
        otoService.addOto(oto);

        ArrayList<Oto> danhSach = otoService.getDanhSachOto();
        assertEquals(1, danhSach.size());
        assertEquals("Vios", danhSach.get(0).getTen());
    }

    @Test
    void testRemoveOto() {
        OtoService otoService = new OtoService();
        Oto oto = new Oto(2, "Civic",50000, "Honda");
        otoService.addOto(oto);

        boolean removed = otoService.removeOto(2);
        assertTrue(removed);
        assertEquals(0, otoService.getDanhSachOto().size());
    }

    @Test
    void testRemoveOtoThatBai() {
        OtoService otoService = new OtoService();
        Oto oto = new Oto(3, "Accent",50000, "Hyundai");
        otoService.addOto(oto);
        boolean removed = otoService.removeOto(99);
        assertFalse(removed);
        assertEquals(1, otoService.getDanhSachOto().size());
    }

    @Test
    void testUpdateOto() {
        OtoService otoService = new OtoService();
        Oto otoCu = new Oto(4, "Morning", 400000, "Kia");
        otoService.addOto(otoCu);

        Oto otoMoi = new Oto(4, "Morning New", 199000, "Kia Updated");
        boolean updated = otoService.updateOto(4, otoMoi);

        assertTrue(updated);
        Oto otoSauUpdate = otoService.getDanhSachOto().get(0);
        assertEquals("Morning New", otoSauUpdate.getTen());
        assertEquals("Kia Updated", otoSauUpdate.getGiChu());
    }

    @Test
    void testUpdateOtoThatBai() {
        OtoService otoService = new OtoService();
        Oto otoMoi = new Oto(5, "Mazda3",500000, "Mazda");
        boolean updated = otoService.updateOto(999, otoMoi);

        assertFalse(updated);
    }
}
