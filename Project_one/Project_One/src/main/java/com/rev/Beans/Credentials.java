package com.rev.Beans;

public class Credentials {
	public Credentials(int id, String userName, String password) {
		super();
		this.id = id;
		UserName = userName;
		Password = password;
	}
	private int id;
	private String UserName;
	private String Password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + ((UserName == null) ? 0 : UserName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credentials other = (Credentials) obj;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (UserName == null) {
			if (other.UserName != null)
				return false;
		} else if (!UserName.equals(other.UserName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Credentials [id=" + id + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
