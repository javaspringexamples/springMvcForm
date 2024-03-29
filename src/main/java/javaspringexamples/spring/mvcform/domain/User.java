package javaspringexamples.spring.mvcform.domain;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class User {

	@Size(min = 3, max = 14)
	private String name;
	@Size(min = 3, max = 14)
	private String lastname;
	private String password;
	private String detail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	private Gender gender;
	private String country;
	private boolean nonSmoking;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isNonSmoking() {
		return nonSmoking;
	}

	public void setNonSmoking(boolean nonSmoking) {
		this.nonSmoking = nonSmoking;
	}
}