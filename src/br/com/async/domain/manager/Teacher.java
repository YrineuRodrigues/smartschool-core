package br.com.async.domain.manager;

import java.io.Serializable;

import br.com.async.domain.person.Person;

public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer code;
	private Person person;
	private String enrollments;
	private String formation;

	public Teacher(Integer code, Person person, String enrollments,
			String formation) {
		super();
		this.code = code;
		this.person = person;
		this.enrollments = enrollments;
		this.formation = formation;
	}

	public Integer getCode() {
		return code;
	}

	public Person getPerson() {
		return person;
	}

	public String getEnrollments() {
		return enrollments;
	}

	public String getFormation() {
		return formation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((enrollments == null) ? 0 : enrollments.hashCode());
		result = prime * result
				+ ((formation == null) ? 0 : formation.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
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
		Teacher other = (Teacher) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (enrollments == null) {
			if (other.enrollments != null)
				return false;
		} else if (!enrollments.equals(other.enrollments))
			return false;
		if (formation == null) {
			if (other.formation != null)
				return false;
		} else if (!formation.equals(other.formation))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

}
