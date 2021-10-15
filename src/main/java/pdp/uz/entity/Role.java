package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pdp.uz.enums.PermissionEnum;
import pdp.uz.enums.RoleType;
import pdp.uz.template.AbsMain;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "roles")
public class Role extends AbsMain {

    @Column(nullable = false , unique = true)
    @Enumerated(value = EnumType.STRING)
    private RoleType name;

    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    private List<PermissionEnum> permissionList;

    private String description;
}
