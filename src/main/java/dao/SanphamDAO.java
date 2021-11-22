package dao;

import java.util.List;
import model.Sanpham;

public interface SanphamDAO {

    // hiển thị danh sách sản phẩm theo giá >= 20.000
    public List<Sanpham> getListSPgia();

    // hiển thị danh sách sản phẩm
    public List<Sanpham> getList();
    
    // lấy sản phâm theo id của sản phẩm
    public Sanpham getSanpham(int idsp);
    
    //lấy sản phẩm theo mã nhóm sản phẩm
    public List<Sanpham> getSanphamByIDmaNhomSP (int mnsp);
    
    //search list sản phẩm theo tên
    public List<Sanpham> searchByName(String name);
    

}
