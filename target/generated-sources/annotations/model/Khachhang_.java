package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Donhang;
import model.Sanpham;
import model.Uathich;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T23:53:20")
@StaticMetamodel(Khachhang.class)
public class Khachhang_ { 

    public static volatile SingularAttribute<Khachhang, String> diaChi;
    public static volatile SingularAttribute<Khachhang, Integer> maKH;
    public static volatile SingularAttribute<Khachhang, String> matKhau;
    public static volatile SingularAttribute<Khachhang, String> sdt;
    public static volatile CollectionAttribute<Khachhang, Donhang> donhangCollection;
    public static volatile CollectionAttribute<Khachhang, Uathich> uathichCollection;
    public static volatile SingularAttribute<Khachhang, Boolean> trangThai;
    public static volatile SingularAttribute<Khachhang, String> tenTK;
    public static volatile CollectionAttribute<Khachhang, Sanpham> sanphamCollection;
    public static volatile SingularAttribute<Khachhang, String> tenKH;
    public static volatile SingularAttribute<Khachhang, String> email;

}