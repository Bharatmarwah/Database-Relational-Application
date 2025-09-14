package in.bm.DatabaseRelationalApplication.REPOSITORY;

import in.bm.DatabaseRelationalApplication.MODEL.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserAddressRepo extends JpaRepository<Address,Integer> {

}
