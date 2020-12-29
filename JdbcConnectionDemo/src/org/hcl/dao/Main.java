package org.hcl.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.hcl.model.Emp;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDao empdao = new EmpdaoImpl();
		Emp e = new Emp();
		List<Emp> l = new ArrayList<Emp>();
		System.out.println("Operation:\n1.Insertion\n2.Deletion\n3.Display table");
		int i = sc.nextInt();
		if (i==1) {
			System.out.println("Enter the employee details");
			e.setEno(sc.nextInt());
			sc.nextLine();
			e.setEname(sc.nextLine());
			e.setAddress(sc.nextLine());
			empdao.insert(e);
		}
		else if (i==2) {
			System.out.println("Enter the employee id to delete");
			int eno = sc.nextInt();
			empdao.delete(eno, e);
		}else if(i==3) {
			System.out.println("Enter the employee id ");
			int eno = sc.nextInt();
			.
		}

	}

}
