package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerdao = DaoFactory.createSellerDao(); //injeção de dependencia.
		
		System.out.println("=== Teste 1, Seller findById ===");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
	}

}
