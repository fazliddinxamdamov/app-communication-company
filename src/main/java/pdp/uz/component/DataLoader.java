package pdp.uz.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pdp.uz.repo.RoleRepo;
import pdp.uz.repo.StaffRepo;

@Component
@RequiredArgsConstructor

public class DataLoader implements CommandLineRunner {

    @Value("${spring.datasource.initialization-mode}")
    private String mode;

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    StaffRepo staffRepo;
    @Autowired
    RoleRepo roleRepo;


    @Override
    public void run(String... args) throws Exception {

        if (mode.equals("always")){


        }
    }
}
