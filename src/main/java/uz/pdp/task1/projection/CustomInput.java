package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Input;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();

    Integer getCurrency();

    Integer getSupplier();

    Integer getWarehouse();
}
