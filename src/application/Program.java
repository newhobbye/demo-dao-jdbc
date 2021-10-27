package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		SellerDao sellerdao = DaoFactory.createSellerDao(); //injeção de dependencia.
		
		System.out.println("=== Teste 1, Seller findById ===");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== Teste 2, Seller findByDepartmentId ===");
		Department department = new Department(2, null);
		List <Seller> list = sellerdao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== Teste 3, Seller findByDepartmentId ===");
		list = sellerdao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
			
			System.out.println("=== Teste 4, Seller Insert ===");
			
			/*
			 * Seller newSeller = new Seller(null, "Robson", "Robson@g", new Date(), 3000.0,
			 * department); sellerdao.insert(newSeller);
			 * System.out.println("Inserido! id = " + newSeller.getId());
			 */
			
			System.out.println("=== Teste 5, Seller Update ===");
			
			seller = sellerdao.findById(1);
			seller.setName("Martha Wayne");
			sellerdao.update(seller);
			System.out.println("Update complete!");
			
			System.out.println("=== Teste 6, Seller Update ===");
			System.out.println("Digite o id a ser deletado: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			sellerdao.deleteById(id);
			
			System.out.println("Deletado! id escolhido: " + id);
			
			sc.close();


		}
	}

}
