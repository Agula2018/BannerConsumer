package model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Banner model
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Banner {

    private long id;
    private Size size;
    private BigDecimal budget;
    private BigDecimal bidPrice;
    private boolean active;
}

