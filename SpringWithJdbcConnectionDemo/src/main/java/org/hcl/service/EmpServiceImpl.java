package org.hcl.service;

import java.util.List;

import org.hcl.dao.EmpDao;
import org.hcl.model.Emp;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService {
	private EmpDao empDao;
	public EmpServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public EmpServiceImpl(EmpDao empDao) {
		super();
		this.empDao = empDao;
	}

	public List<Emp> getEmployees() {
		
		return empDao.getAll();
	}

}
