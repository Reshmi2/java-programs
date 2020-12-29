package org.hcl.services;

import java.util.List;

import org.hcl.dao.EmpDao;
import org.hcl.dao.EmpDaoImpl;
import org.hcl.model.Emp;

public class EmpServiceImpl implements EmpService {
	EmpDao empdao = new EmpDaoImpl();
	@Override
	public List<Emp> getEmployees() {
		return empdao.getEmployees();
	}

}
