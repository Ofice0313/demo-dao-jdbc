package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====== Test 1: DepartmentDao findById =======");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("====== Test 1: DepartmentDao Update =======");
		department = departmentDao.findById(2);
		department.setName("Marketing");
		departmentDao.update(department);
		

	}

}
