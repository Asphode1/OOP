public class CanBoCoHuu extends NhanVien {
  private static double luongCoBan;
  private double HSLuong;

  public CanBoCoHuu(String ten, double HSLuong, double lcb) {
    super(ten);
    this.HSLuong = HSLuong;
    luongCoBan = lcb;
  }

  public double getHSLuong() {
    return this.HSLuong;
  }

  public void setHSLuong(double HSLuong) {
    this.HSLuong = HSLuong;
  }

  public static double getLuongCoBan() {
    return luongCoBan;
  }

  public static void setLuongCoBan(double lcb) {
    luongCoBan = lcb;
  }

  public boolean tangHeSoLuong(double muc_tang) {
    if ((HSLuong + muc_tang) * getLuongCoBan() <= LUONG_MAX) {
      HSLuong += muc_tang;
      return true;
    }
    return false;
  }

  @Override
  public double tinhLuong() {
    return CanBoCoHuu.luongCoBan * HSLuong;
  }

  @Override
  public void inTTin() {
    System.out.println("Tên: " + getTenNhanVien());
    System.out.println("Vị trí: Cán Bộ Cơ Hữu");
    System.out.println("Lương: " + String.format("%.2f", tinhLuong()) + "VND");
    System.out.println("Phụ cấp: 0");
    System.out.println("Hoa hồng: 0");
  }
}
