package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Output;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();

    Integer getCurrency();

    Integer getClient();

    Integer getWarehouse();
}
