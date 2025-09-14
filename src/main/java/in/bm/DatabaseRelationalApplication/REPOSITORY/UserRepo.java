package in.bm.DatabaseRelationalApplication.REPOSITORY;

import in.bm.DatabaseRelationalApplication.MODEL.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
