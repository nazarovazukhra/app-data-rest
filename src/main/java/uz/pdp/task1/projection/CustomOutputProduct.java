package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.OutputProduct;


@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Double getAmount();

    Double getPrice();

    Integer getProduct();

    Integer getOutput();

}
