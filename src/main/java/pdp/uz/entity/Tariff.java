package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pdp.uz.enums.ClientType;
import pdp.uz.enums.TariffType;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tariffs")
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Double connectionPrice;

    private String description;

    @Enumerated(value = EnumType.STRING)
    private ClientType clientType;

    @Enumerated(value = EnumType.STRING)
    private TariffType tariffType;

    private Boolean status = true;

}
