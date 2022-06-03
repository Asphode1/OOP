public class CanBoQuanLy extends CanBoCoHuu implements QuanLy {

  public CanBoQuanLy(String tenNV, double luongCB, double HSLuong) {
    super(tenNV, luongCB, HSLuong);
  }

  @Override
  public double tinhHoaHong() {
    return CongTy.loiNhuan * 0.002;
  }

  @Override
  public double tinhLuong() {
    return getLuongCoBan() * getHSLuong() + tinhHoaHong();
  }

  @Override
  public void inTTin() {
    System.out.println("Tên: " + getTenNhanVien());
    System.out.println("Vị trí: Cán Bộ Quản Lý");
    System.out.println("Lương: " + String.format("%.2f", tinhLuong()) + "VND");
    System.out.println("Phụ cấp: 0");
    System.out.println("Hoa hồng: " + String.format("%.2f", tinhHoaHong()) + "VND");
  }
}
