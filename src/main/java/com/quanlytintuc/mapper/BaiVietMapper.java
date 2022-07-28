package com.quanlytintuc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.quanlytintuc.model.BaiViet;

public class BaiVietMapper implements RowMapper<BaiViet>{

	@Override
	public BaiViet mapRow(ResultSet rs) {
		BaiViet bv = new BaiViet();
		try {
			bv.setMaBaiViet(rs.getLong("mabaiviet"));
			bv.setTieuDe(rs.getString("tieude"));
			bv.setMaTaiKhoan(rs.getLong("mataikhoan"));
			bv.setMoTa(rs.getString("mota"));
			bv.setNoiDung(rs.getString("noidung"));
			bv.setAnhNen(rs.getString("anhnen"));
			bv.setHinhAnh(rs.getString("hinhanh"));
			bv.setLinkBaiViet(rs.getString("linkbaiviet"));
			Date ngay = rs.getDate("ngaydang");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
			String strNgay = dateFormat.format(ngay); 
			bv.setNgayDang(strNgay);
			bv.setLuotXem(rs.getInt("luotxem"));
			bv.setTrangThai(rs.getInt("trangthai"));
			return bv;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Loi ne");
			return null;
		}
	}

}