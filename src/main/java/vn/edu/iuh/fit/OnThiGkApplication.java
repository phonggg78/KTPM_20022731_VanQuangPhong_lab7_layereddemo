package vn.edu.iuh.fit;

import net.datafaker.providers.food.Beer;
import net.datafaker.providers.food.FoodFaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.repositories.ProductRepository;

@SpringBootApplication
public class OnThiGkApplication  implements CommandLineRunner{
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(OnThiGkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Beer faker = new FoodFaker().beer();
        for (int i = 0; i < 10; i++) {
            Product p = new Product(faker.name(), faker.brand(),null);
            productRepository.save(p);
        }
    }

}
