package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("======================== test 3, seller find all ========================");
		List<Department>list = departmentDao.findAll();
		for (Department obj : list) {
		System.out.println(obj);
	}

	}

}
