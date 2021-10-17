package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Client;
import pdp.uz.entity.Staff;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

}
