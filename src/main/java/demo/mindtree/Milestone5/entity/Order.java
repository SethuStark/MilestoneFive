package demo.mindtree.Milestone5.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	private long orderId;
	private String orderName;
	private double amount;
	private String orderDate;
	
	public Order() {
		super();
	}

	public Order(long orderId, String orderName, double amount, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.amount = amount;
		this.orderDate = orderDate;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
