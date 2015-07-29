package vz.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
	private String name;

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
}
