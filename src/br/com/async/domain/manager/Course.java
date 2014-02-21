package br.com.async.domain.manager;

import java.io.Serializable;
import java.util.List;

public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer code;
	private String name;
	private Manager manager;
	private List<ClassSchool> gang;

	public Course(Integer code, String name, Manager manager, List<ClassSchool> gang) {
		super();
		this.code = code;
		this.name = name;
		this.manager = manager;
		this.gang = gang;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Manager getManager() {
		return manager;
	}

	public List<ClassSchool> getGang() {
		return gang;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((gang == null) ? 0 : gang.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Course other = (Course) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (gang == null) {
			if (other.gang != null)
				return false;
		} else if (!gang.equals(other.gang))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
