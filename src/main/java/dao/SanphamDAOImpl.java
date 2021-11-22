package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import model.Sanpham;

public class SanphamDAOImpl implements SanphamDAO {

    @Override
    public List<Sanpham> getListSPgia(){
         EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT s FROM Sanpham s WHERE s.gia >= 20000";

        TypedQuery<Sanpham> q = em.createQuery(qString, Sanpham.class);

        List<Sanpham> sp = null;
        try {
            sp = q.getResultList();

            if (sp == null) {
                sp = null;
            }
        } catch (NoResultException e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return sp;
    }
      

    @Override
    public List<Sanpham> getList() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT s FROM Sanpham s";

        TypedQuery<Sanpham> q = em.createQuery(qString, Sanpham.class);

        List<Sanpham> sp = null;
        try {
            sp = q.getResultList();

            if (sp == null) {
                sp = null;
            }
        } catch (NoResultException e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return sp;
    }

    

    @Override
    public Sanpham getSanpham(int idsp) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Sanpham entity = em.find(Sanpham.class, idsp);
        return entity;
    }

    @Override
    public List<Sanpham> getSanphamByIDmaNhomSP(int mnsp) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String query  = "Select t from Sanpham t where t.maSP = :manhomsp";
        TypedQuery<Sanpham> list = em.createQuery(query, Sanpham.class);
        list.setParameter("manhomsp", mnsp);
        List<Sanpham> listsp = list.getResultList();
        return listsp;
    }
    
    
    @Override
    public List<Sanpham> searchByName(String name) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String query  = "SELECT s FROM Sanpham s WHERE s.tenSP LIKE  %:name% ";
        TypedQuery<Sanpham> list = em.createQuery("SELECT s FROM Sanpham s WHERE s.tenSP LIKE  %:name% ", Sanpham.class);
        list.setParameter("name", name);
        List<Sanpham> listsp = list.getResultList();
        return listsp;
    }
    
    
    public static void main(String[] args) {
        SanphamDAOImpl sp = new SanphamDAOImpl();
        List<Sanpham> ls = sp.searchByName(" IPhone 11 ");
        if(ls == null)
         System.out.println("khong co du lieu");
        else
            System.out.println(ls);
    }
}
