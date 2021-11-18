package demo.mindtree.Milestone5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.mindtree.Milestone5.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
