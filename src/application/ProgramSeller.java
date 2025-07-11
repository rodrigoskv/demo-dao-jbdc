package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramSeller {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("======================== test 1, seller find by id ========================");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("======================== test 2, seller find by department ========================");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
		System.out.println(obj);
	}
		System.out.println();
		
		System.out.println("======================== test 3, seller find all ========================");
		list = sellerDao.findAll();
		for (Seller obj : list) {
		System.out.println(obj);
	}
		System.out.println();
		
		System.out.println("======================== test 4, seller insert ========================");
		Seller newSeller = new Seller(null, "Romario", "romario@emailromario.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("inserted! new id =" +newSeller.getId());
	
		System.out.println();
		
		System.out.println("======================== test 5, seller update ========================");
		seller = sellerDao.findById(1);
		seller.setName("Cássio Corinthians");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println();
		
		System.out.println("======================== test 6, seller delete ========================");
		sellerDao.deleteByID(11);		
		System.out.println("Delete completed");
	
	}
		
	
	

}
