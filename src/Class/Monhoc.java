/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Admin
 */
public class Monhoc {
    private String MaMonHoc;
    private String TenMonHoc;
    private String Khoa;
    private String SoTinChi;
    private String HocKi;
    private String HinhThucThi;

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

//    

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(String SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

    public String getHocKi() {
        return HocKi;
    }

    public void setHocKi(String HocKi) {
        this.HocKi = HocKi;
    }

    public String getHinhThucThi() {
        return HinhThucThi;
    }

    public void setHinhThucThi(String HinhThucThi) {
        this.HinhThucThi = HinhThucThi;
    }

    public Monhoc(String MaMonHoc, String TenMonHoc, String Khoa, String SoTinChi, String HocKi, String HinhThucThi) {
        this.MaMonHoc = MaMonHoc;
        this.TenMonHoc = TenMonHoc;
        this.Khoa = Khoa;
        this.SoTinChi = SoTinChi;
        this.HocKi = HocKi;
        this.HinhThucThi = HinhThucThi;
    }

    public Monhoc() {
    }

    
    
}
