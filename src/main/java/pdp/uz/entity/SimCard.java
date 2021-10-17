package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SimCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Number number;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Filial filial;

    private Double balance;

    private Double price;

    private LocalDate createdAt = LocalDate.now();

    private Boolean status = true;
}
