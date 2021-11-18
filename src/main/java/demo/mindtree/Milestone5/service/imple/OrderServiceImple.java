package demo.mindtree.Milestone5.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.mindtree.Milestone5.entity.Order;
import demo.mindtree.Milestone5.repository.OrderRepo;
import demo.mindtree.Milestone5.service.OrderService;

@Service
public class OrderServiceImple implements OrderService {
	
	@Autowired
	private OrderRepo ord;
	
	public Order orderInsert(Order req){
		Order o = ord.save(req);
		return o;
	}

}
