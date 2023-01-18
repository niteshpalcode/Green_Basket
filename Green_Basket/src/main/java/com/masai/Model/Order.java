package com.masai.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderNo;
	
	private Double totalAmount;
	
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Vegetable> vegetableList;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Vegetable> getVegetableList() {
		return vegetableList;
	}

	public void setVegetableList(List<Vegetable> vegetableList) {
		this.vegetableList = vegetableList;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order(Integer orderNo, Double totalAmount, String status, List<Vegetable> vegetableList, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.totalAmount = totalAmount;
		this.status = status;
		this.vegetableList = vegetableList;
		this.customer = customer;
	}

	public Order() {
		super();
	}

	public Order(Double totalAmount, String status, List<Vegetable> vegetableList, Customer customer) {
		super();
		this.totalAmount = totalAmount;
		this.status = status;
		this.vegetableList = vegetableList;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", totalAmount=" + totalAmount + ", status=" + status + ", vegetableList="
				+ vegetableList + ", customer=" + customer + "]";
	}

	
	
}
