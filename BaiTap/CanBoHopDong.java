public class CanBoHopDong extends NhanVien {
  private double luongHD;

  public CanBoHopDong(String ten, double luongHD) {
    super(ten);
    this.luongHD = luongHD;
  }

  public double getLuongHD() {
    return luongHD;
  }

  public void setLuongHD(double luong) {
    luongHD = luong;
  }

  @Override
  public double tinhLuong() {
    return luongHD;
  }

  @Override
  public void inTTin() {
    System.out.println("Tên: " + getTenNhanVien());
    System.out.println("Vị trí: Cán Bộ Hợp Đồng");
    System.out.println("Lương: " + String.format("%.2f", tinhLuong()) + "VND");
    System.out.println("Phụ cấp: 0");
    System.out.println("Hoa hồng: 0");
  }
}
