import java.util.ArrayList;

public class CongTy {
  private String tenCTY;
  private int soNhanVien;
  public static final int SO_NHAN_VIEN_MAX = 100;
  public static double loiNhuan;
  public static ArrayList<NhanVien> DanhSach = new ArrayList<>();

  public CongTy(String tenCTY, int SoNhanVien, double loiNhuan) {
    this.tenCTY = tenCTY;
    this.soNhanVien = SoNhanVien;
    CongTy.loiNhuan = loiNhuan;
  }

  public String getTenCTY() {
    return tenCTY;
  }

  public void setTenCTY(String ten) {
    tenCTY = ten;
  }

  public int getSoNhanVien() {
    return soNhanVien;
  }

  public void setSoNhanVien(int soNV) {
    soNhanVien = soNV;
  }

  public static double getLoiNhuan() {
    return loiNhuan;
  }

  public static void setLoiNhuan(double loiNhuan) {
    CongTy.loiNhuan = loiNhuan;
  }

  public void inNV() {
    for (NhanVien nv : DanhSach) {
      System.out.println("Nhân Viên " + DanhSach.indexOf(nv) + ": ");
      nv.inTTin();
    }
  }

  public double tingTongLuong() {
    double tong = 0;
    for (NhanVien nv : DanhSach) {
      tong += nv.tinhLuong();
    }
    return tong;
  }

  public boolean themNV(NhanVien nv) {
    if (soNhanVien == SO_NHAN_VIEN_MAX)
      return false;
    DanhSach.add(nv);
    soNhanVien++;
    return true;
  }

  public void inTTin() {
    System.out.println("Tên công ty: " + getTenCTY());
    System.out.println("Danh sách nhân viên:");
    inNV();
  }
}
