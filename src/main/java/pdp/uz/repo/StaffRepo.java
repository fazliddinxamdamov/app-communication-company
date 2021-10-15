package pdp.uz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Long> {

}
