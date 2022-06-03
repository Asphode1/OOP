public class GiamDoc extends CanBoCoHuu implements QuanLy {
  private double phuCap;

  public GiamDoc(String ten, double luongCB, double HSLuong, double phuCap) {
    super(ten, luongCB, HSLuong);
    this.phuCap = phuCap;
  }

  public double getPhuCap() {
    return phuCap;
  }

  public void setPhuCap(double phuCap) {
    this.phuCap = phuCap;
  }

  @Override
  public double tinhHoaHong() {
    return CongTy.loiNhuan * 5.0 / 100;
  }

  @Override
  public double tinhLuong() {
    return CanBoCoHuu.getLuongCoBan() * getHSLuong() + phuCap + tinhHoaHong();
  }

  @Override
  public void inTTin() {
    System.out.println("Tên: " + this.getTenNhanVien());
    System.out.println("Vị trí: Giám đốc");
    System.out.println("Lương: " + String.format("%.2f", tinhLuong()) + "VND");
    System.out.println("Phụ cấp: " + String.format("%.2f", phuCap));
    System.out.println("Hoa hồng: " + String.format("%.2f", tinhHoaHong()));
  }
}