package in.bm.DatabaseRelationalApplication.REPOSITORY;

import in.bm.DatabaseRelationalApplication.MODEL.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOrderService extends JpaRepository<Order,Integer> {
}
