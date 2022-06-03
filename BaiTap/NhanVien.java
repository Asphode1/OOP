public abstract class NhanVien {
  String tenNhanVien;
  public static final double LUONG_MAX = 100000000;

  public NhanVien() {
  }

  public NhanVien(String tenNhanVien) {
    super();
    this.tenNhanVien = tenNhanVien;
  }

  public String getTenNhanVien() {
    return this.tenNhanVien;
  }

  public void setTenNhanVien(String tenNhanVien) {
    this.tenNhanVien = tenNhanVien;
  }

  public abstract double tinhLuong();

  public abstract void inTTin();
}
