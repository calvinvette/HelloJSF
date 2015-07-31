package vz.jsf;

import javax.faces.bean.ManagedBean;


@ManagedBean(name="customer")
public class CustomerManagedBean {
	private Customer customer = new Customer();
	private CustomerDAO dao = new CustomerJPADAO();
	
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	
	
	

	public Long getCustomerId() {
		return customer.getCustomerId();
	}

	public void setCustomerId(Long customerId) {
		customer.setCustomerId(customerId);
	}

	public String getFirstName() {
		return customer.getFirstName();
	}

	public void setFirstName(String firstName) {
		customer.setFirstName(firstName);
	}

	public String getLastName() {
		return customer.getLastName();
	}

	public void setLastName(String lastName) {
		customer.setLastName(lastName);
	}

	public String getPhoneNumber() {
		return customer.getPhoneNumber();
	}

	public void setPhoneNumber(String phoneNumber) {
		customer.setPhoneNumber(phoneNumber);
	}

	public String getEmail() {
		return customer.getEmail();
	}

	public void setEmail(String email) {
		customer.setEmail(email);
	}

	public Long getAge() {
		return customer.getAge();
	}

	public void setAge(Long age) {
		customer.setAge(age);
	}

	public String toString() {
		return customer.toString();
	}

	public int hashCode() {
		return customer.hashCode();
	}

	public boolean equals(Object obj) {
		return customer.equals(obj);
	}
	
	public String addCustomer() {
		dao.insert(customer);
//		System.out.println("Added Customer: " + getCustomer());
		System.out.println("Added Customer: " + this.toString());
		return null;
	}
	
}
