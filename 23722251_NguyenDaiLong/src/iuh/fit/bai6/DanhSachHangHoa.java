package iuh.fit.bai6;

public class DanhSachHangHoa {
	private HangHoa[] dsHangHoa;
	private int count = 0;
	
	public DanhSachHangHoa() {
		dsHangHoa = new HangHoa[10];
	}
	
	public DanhSachHangHoa(int n)
	{
		dsHangHoa = new HangHoa[n];
	}
	
	public HangHoa[] getDsHangHoa() {
		return dsHangHoa;
	}
	
	public void themHangHoa(HangHoa hh)
	{
		for (HangHoa h : dsHangHoa) {
			if (h.getMaHang().equalsIgnoreCase(hh.getMaHang()))
				throw new RuntimeException("Trùng mã");
		}
		dsHangHoa[count++] = hh;
	}
	
}
