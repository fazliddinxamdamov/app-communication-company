package pdp.uz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pdp.uz.repository.ClientRepo;
import pdp.uz.repository.RoleRepo;
import pdp.uz.repository.StaffRepo;

@Service
@RequiredArgsConstructor
public class AuthService implements UserDetailsService {

    //    @Autowired
//    UserRepo userRepo;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    StaffRepo staffRepo;
    @Autowired
    ClientRepo clientRepo;

//    public ApiResponse registerUser(RegisterDto registerDto) {
//        if (!registerDto.getPassword().equals(registerDto.getPrePassword()))
//            return new ApiResponse("passwords is not same", false);
//
//        boolean existsByUsername = userRepo.existsByUsername(registerDto.getUsername());
//        if (existsByUsername)
//            return new ApiResponse("username allaqachon mavjud", false);
//
//        User user = new User(
//                registerDto.getFullName(),
//                registerDto.getUsername(),
//                passwordEncoder.encode(registerDto.getPassword()),
//                roleRepo.findByName(Constants.USER).orElseThrow(() -> new ResourceNotFoundException("role","name",Constants.USER)),
//                true
//        );
//        userRepo.save(user);
//        return new ApiResponse("user saved successfully", true);
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return null;
    }

}
