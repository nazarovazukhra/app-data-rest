package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Boolean getActive();

    String getCode();

    Integer getCategory();

    Integer getAttachment();

    Integer getMeasurement();

}
