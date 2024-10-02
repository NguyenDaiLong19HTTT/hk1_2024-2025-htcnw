package iuh.fit.bai6;

public class HangDienMay extends HangHoa {
	
	private static final double thue = 0.1;
	private int thoiGianBaoHanh;
	private double congSuat;
	
	public HangDienMay() {
		super();
		this.thoiGianBaoHanh = 0;
		this.congSuat = 0;
	}

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if (thoiGianBaoHanh < 0)
			throw new RuntimeException("Thời gian bảo hành phải ít nhất là 1 tháng");
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		if (congSuat < 0)
			throw new RuntimeException("Công suất phải lớn hơn hoặc bằng 0");
		this.congSuat = congSuat;
	}
	
	@Override
	public double getTienThue() {
		return soLuongTon * donGia * thue;
	}
	
	@Override
	public String getDanhGiaMucDoBanBuon() {
		if (soLuongTon < 3)
			return "Bán được";
		return "Không có đánh giá";
	}

	
}
