package br.com.async.domain.manager;

import java.io.Serializable;

public class Gang implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer code;
	private String name;
	private Discipline discipline;

	public Gang(Integer code, String name, Discipline discipline) {
		super();
		this.code = code;
		this.name = name;
		this.discipline = discipline;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((discipline == null) ? 0 : discipline.hashCode());
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
		Gang other = (Gang) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (discipline == null) {
			if (other.discipline != null)
				return false;
		} else if (!discipline.equals(other.discipline))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
