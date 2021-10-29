package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// SellerDao sellerdao = DaoFactory.createSellerDao(); //injeção de dependencia.
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();

		System.out.println("=== Teste 1, Department findById ===");
		Department department = departmentdao.findById(3);
		System.out.println(department);

		System.out.println("=== Teste 2, Department findall ===");
		List<Department> list = new ArrayList<>();
		list = departmentdao.findAll();
		for (Department obj : list) {
			System.out.println(obj);

			System.out.println("=== Teste 3, Department Insert ===");
			/*
			 * Department newDepartment = new Department(null, "Rollers");
			 * departmentdao.insert(newDepartment); System.out.println("Inserido! id = " +
			 * newDepartment.getId());
			 */
			
			System.out.println("=== Teste 4, Department Update ===");
			
			department = departmentdao.findById(6);
			department.setNome("Roller Duplicado");
			departmentdao.update(department);
			System.out.println("Update complete!");
			
			System.out.println("=== Teste 5, Department Delete ===");
			System.out.println("Digite o id a ser deletado: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			departmentdao.deleteById(id);
			
			System.out.println("Deletado! id escolhido: " + id);
			
			sc.close();
		}
	}
}
