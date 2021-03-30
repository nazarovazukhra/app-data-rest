package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.InputProduct;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Integer getProduct();

    Integer getInput();
}
