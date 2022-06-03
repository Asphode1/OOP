public class TruongPhong extends CanBoCoHuu implements QuanLy {
  private double phuCap;

  public TruongPhong(String ten, double luongCB, double HSLuong, double phuCap) {
    super(ten, HSLuong, luongCB);
    this.phuCap = phuCap;
  }

  public double getPhuCap() {
    return this.phuCap;
  }

  public void setPhuCap(double phuCap) {
    this.phuCap = phuCap;
  }

  @Override
  public double tinhHoaHong() {
    return 0;
  }

  @Override
  public double tinhLuong() {
    return getLuongCoBan() * getHSLuong() + phuCap;
  }

  @Override
  public void inTTin() {
    System.out.println("Tên: " + getTenNhanVien());
    System.out.println("Vị trí: Trưởng Phòng");
    System.out.println("Lương: " + String.format("%.2f", tinhLuong()) + "VND");
    System.out.println("Phụ cấp: " + String.format("%.2f", phuCap) + "VND");
    System.out.println("Hoa hồng: 0");
  }
}
