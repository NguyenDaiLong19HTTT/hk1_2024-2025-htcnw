package iuh.fit.bai6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//import java.time.Period;

public class HangSanhSu extends HangHoa {
	
	private static final double thue = 0.1;
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	public HangSanhSu() {
		super();
		this.nhaSanXuat = "";
		this.ngayNhapKho = LocalDate.now();
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isAfter(LocalDate.now()))
			throw new RuntimeException("Ngày nhập kho phải trước ngày hiện tại");
		this.ngayNhapKho = ngayNhapKho;
	}
	
	@Override
	public double getTienThue() {
		return soLuongTon * donGia * thue;
	}
	
	@Override
	public String getDanhGiaMucDoBanBuon() {
		if (soLuongTon > 50 && ChronoUnit.DAYS.between(ngayNhapKho, LocalDate.now())>10)
			return "Bán chậm";
		return "Không có đánh giá";
	}

}
