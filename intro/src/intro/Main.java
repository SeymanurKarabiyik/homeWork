package intro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Bosna Hersek", 500, "6 Gece 7 Gün");
		
		Product product2 = new Product(2,"Makedonya",600,"6 Gece 7 Gün");
				
		Product product3 = new Product(3,"Sırbistan",550,"6 Gece 7 Gün");
		
		
		Product[] products = {product1,product2,product3};
		
		for(Product product: products) {
			System.out.println(product.detail+" - "+product.name+ " - "+ product.unitPrice+" €");
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Vizesiz Avrupa Ülkeleri";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Orta Avrupa Ülkeleri";
		
		Category[] categories = {category1, category2};
		
		for(Category category:categories) {
			System.out.println(category.name);
		}
		
		ProductService productService = new ProductService();
		
		productService.getInformation(product1);
		productService.getInformation(product2);
		productService.getInformation(product3);
		
		
		

	}

}
