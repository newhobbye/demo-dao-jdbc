package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "livros");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail", new Date(), 3000.0, obj);
		
		SellerDao sellerdao = DaoFactory.createSellerDao(); //injeção de dependencia.
		System.out.println(seller);
	}

}
