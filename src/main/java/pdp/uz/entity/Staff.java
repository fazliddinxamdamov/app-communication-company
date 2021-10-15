package pdp.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pdp.uz.enums.PermissionEnum;
import pdp.uz.template.AbsMain;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "staff")
public class Staff extends AbsMain implements UserDetails {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false , unique = true)
    private String address;

    @Column(nullable = false , unique = true)
    private String username;

    @Column(nullable = false , unique = true)
    private String password;

    private boolean enabled;

    @JoinColumn(nullable = false)
    @OneToOne
    private Role role;

    @ManyToOne
    private Filial filial;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<PermissionEnum> permissionList = this.role.getPermissionList();

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (PermissionEnum permission : permissionList) {
            grantedAuthorities.add(new SimpleGrantedAuthority(permission.name()));
        }
        return grantedAuthorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
}
