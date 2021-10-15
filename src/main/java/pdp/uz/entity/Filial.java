package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false , unique = true)
    private String address;

    @JoinColumn(nullable = false)
    @OneToOne
    private Staff filialBoss;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "filial")
    private List<Staff> filialStaffs;

}
