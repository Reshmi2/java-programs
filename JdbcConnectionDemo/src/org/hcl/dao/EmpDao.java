package org.hcl.dao;

import java.util.Optional;

import org.hcl.model.Emp;

public interface EmpDao {
	boolean insert(Emp e);
	boolean delete(int eno, Emp e);
	Optional<Emp> get(int eno);
}
