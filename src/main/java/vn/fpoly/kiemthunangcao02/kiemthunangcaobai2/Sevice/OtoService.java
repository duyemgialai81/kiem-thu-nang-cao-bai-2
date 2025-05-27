package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Sevice;

import vn.fpoly.kiemthunangcao02.kiemthunangcaobai2.Model.Oto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OtoService {
    private ArrayList<Oto> danhSachOto = new ArrayList<>();


    public void addOto(Oto oto) {
        danhSachOto.add(oto);
    }


    public boolean removeOto(int id) {
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getId() == id) {
                danhSachOto.remove(i);
                return true; // Xoá thành công
            }
        }
        return false;
    }


    public boolean updateOto(int id, Oto otoMoi) {
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getId() == id) {
                danhSachOto.set(i, otoMoi);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Oto> getDanhSachOto() {
        return danhSachOto;
    }


}
