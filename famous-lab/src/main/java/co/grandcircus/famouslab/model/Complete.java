package co.grandcircus.famouslab.model;

public class Complete {

	private String firstName;
	private String lastName;
	private String innovation;
	private Integer year; // "Integer" refers to wrapper type in Java whereas "int" is a primitive type

	public Complete() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
