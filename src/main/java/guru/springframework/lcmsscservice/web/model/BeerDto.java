package guru.springframework.lcmsscservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdOn;
    private OffsetDateTime updatedOn;

    private String name;
    private BeerStyleEnum style;
    private Long upc;
    private BigDecimal price;

    private Integer quantityOnHand;
}
