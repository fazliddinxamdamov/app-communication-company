package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.util.List;

@Entity(name = "numbers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Check(constraints = "length(number) = 7")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"code", "number"}))
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Short code;         //93 yo 94 90 , 99 li kodlar

    @Column(nullable = false)
    private String number;

    private boolean status = true;

    private boolean owned = true;

    @Transient
    private String fullNumber;

    public String getFullNumber() {
        return "+998" + this.code + this.number;
    }
}
