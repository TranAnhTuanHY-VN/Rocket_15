package org.vti.Entity;



import org.vti.Entity.Enumerate.SalaryName;
import org.vti.Entity.Enumerate.SalaryNameConvert;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Salary", catalog = "TestingSystem")
public class Salary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "SalaryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "SalaryName", nullable = false, unique = true)
	@Convert(converter = SalaryNameConvert.class)
	private SalaryName name;

	public Salary() {
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public SalaryName getName() {
		return name;
	}

	public void setName(SalaryName name) {
		this.name = name;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Salary { " + "ID = " + id + ", Name = '" + name.getValue() + '\'' + '}';
	}

}
