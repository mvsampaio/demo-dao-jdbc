package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.IDepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IDepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ====");		
		Department department = departmentDao.findById(2);		
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ====");		
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: department insert ====");		
		Department newDepartment = new Department(null, "Teste");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: department update ====");
		department = departmentDao.findById(6);
		department.setName("Food");		
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: department delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();		
	}
}
