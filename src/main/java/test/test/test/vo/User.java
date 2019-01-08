package test.test.test.vo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {

	private Integer userNumber;
	private String userID;
	private String userPassword;
	private String myBook;
	
	public User() {};
	
	public User(Integer userNumber, String userID, String userPassword, String myBook) {
		super();
		this.userNumber = userNumber;
		this.userID = userID;
		this.userPassword = userPassword;
		this.myBook = myBook;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getMyBook() {
		return myBook;
	}

	public void setMyBook(String myBook) {
		this.myBook = myBook;
	}

	@Override
	public String toString() {
		return "user [userNumber=" + userNumber + ", userID=" + userID + ", userPassword=" + userPassword + ", myBook="
				+ myBook + "]";
	}
	
}
