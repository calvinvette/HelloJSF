package vz.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="MyHelloBean")
@SessionScoped
public class HelloBean implements Serializable {
	private String name;
	private Customer customer = new Customer();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getName() {
		System.out.println("Getting name: " + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name to: " + name);
		this.name = name;
	}
	
	public String register() {
		System.out.println("Registered: " + getName());
		return null;
	}
	
	public String addCustomer() {
		System.out.println("Added Customer: " + getCustomer());
		return null;
	}
	
}
