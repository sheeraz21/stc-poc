package com.stc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "UserDetails")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	@Id
	private Integer Id;
	
	@Column(name="CountryName")
	private String CountryName;
	
	@Column(name="StateName")
	private String StateName;
	
	@Column(name="StatePopulation")
	private Integer StatePopulation;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return CountryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return StateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		StateName = stateName;
	}

	/**
	 * @return the statePopulation
	 */
	public Integer getStatePopulation() {
		return StatePopulation;
	}

	/**
	 * @param statePopulation the statePopulation to set
	 */
	public void setStatePopulation(Integer statePopulation) {
		StatePopulation = statePopulation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CountryName == null) ? 0 : CountryName.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((StateName == null) ? 0 : StateName.hashCode());
		result = prime * result + ((StatePopulation == null) ? 0 : StatePopulation.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (CountryName == null) {
			if (other.CountryName != null)
				return false;
		} else if (!CountryName.equals(other.CountryName))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (StateName == null) {
			if (other.StateName != null)
				return false;
		} else if (!StateName.equals(other.StateName))
			return false;
		if (StatePopulation == null) {
			if (other.StatePopulation != null)
				return false;
		} else if (!StatePopulation.equals(other.StatePopulation))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserEntity [Id=" + Id + ", CountryName=" + CountryName + ", StateName=" + StateName
				+ ", StatePopulation=" + StatePopulation + "]";
	}
	
	
	
	
	
}
