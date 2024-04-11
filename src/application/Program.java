package application;

import model.dao.DaoFactory;
import model.dao.ISellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		ISellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
