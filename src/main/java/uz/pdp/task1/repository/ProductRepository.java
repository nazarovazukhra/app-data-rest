package uz.pdp.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Product;
import uz.pdp.task1.projection.CustomProduct;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
