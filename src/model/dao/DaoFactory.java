package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static ISellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
