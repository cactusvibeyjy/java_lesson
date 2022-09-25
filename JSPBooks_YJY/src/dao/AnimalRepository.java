package dao;


import java.util.ArrayList;



import dto.Animal;


public class AnimalRepository {
	
	private ArrayList<Animal> listOfProducts = new ArrayList<Animal>();
	private static AnimalRepository instance = new AnimalRepository();

	public static AnimalRepository getInstance(){
		return instance;
	} 

	public AnimalRepository() {//dummy data
		
		Animal a1 = new Animal();
		
		
		a1.setName("Salmon"); 
		a1.setArea("River"); 
		a1.setAge(5); 
		Animal a2 = new Animal();
		a2.setName("Shark"); 
		a2.setArea("Ocean"); 
		a2.setAge(3); 
		Animal a3 = new Animal();
		a3.setName("Crab"); 
		a3.setArea("Ocean"); 
		a3.setAge(2);
		

		listOfProducts.add(a1);
		listOfProducts.add(a2);
		listOfProducts.add(a3);
	}

	public ArrayList<Animal> getAllProducts() {
		return listOfProducts;
	}
	
	public Animal getProductByAge(String Name) {
		Animal aByName = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Animal a = listOfProducts.get(i);
			if (a != null && a.getName() != null && a.getName().equals(Name)) {
				aByName = a;
				break;
			}
		}
		return aByName;
	}
	
	public void addAnimal(Animal a) {
		listOfProducts.add(a);
	}
}
