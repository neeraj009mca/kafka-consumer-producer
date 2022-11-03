package com.kafka.dto;

public class UserDTO {

	public String userName;
	public String address;
	public String name;

	public UserDTO(String userName, String address, String name) {
		super();
		this.userName = userName;
		this.address = address;
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", address=" + address + ", name=" + name + "]";
	}

}
