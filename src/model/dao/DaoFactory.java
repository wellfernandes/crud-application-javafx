package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//create instance sellerDao + connection
	public static SellerDao createSellerDao() {
		
		return new SellerDaoJDBC(DB.getConnection()); 
	}

	//create instance departmentDao + connection
	public static DepartmentDao createDepartmentDao() {
		
		return new DepartmentDaoJDBC(DB.getConnection()); 
	}
}
