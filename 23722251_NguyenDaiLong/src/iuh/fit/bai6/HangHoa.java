package iuh.fit.bai6;

public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;

	public HangHoa() {
		this("", "xxx", 0.0, 0);
	}

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if (maHang == null)
			throw new RuntimeException("Mã hàng không được để trống.");
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang == null)
			this.tenHang = "xxx";
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia < 0)
			throw new RuntimeException("Đơn giá không được nhỏ hơn 0");
		this.donGia = donGia;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon < 0)
			throw new RuntimeException("Số lượng tồn không được nhỏ hơn 0");
		this.soLuongTon = soLuongTon;
	}
	
	public abstract double getTienThue();
	public abstract String getDanhGiaMucDoBanBuon();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%8s %10s %15s %5s %15s %20s", maHang, tenHang, donGia, soLuongTon, getTienThue(), getDanhGiaMucDoBanBuon());
	}

}
