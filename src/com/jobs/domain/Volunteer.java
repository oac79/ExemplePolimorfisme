package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	protected double salaryPerMonth;

	public Volunteer(String name, String address, String phone, String description) throws Exception
		{
			super(name, address, phone);
			// SALARIO NO PUEDE SER DISTINTO A CERO
			if (salaryPerMonth != 0)
				throw new Exception();
		}

	@Override
	public void pay()
		{
			salaryPerMonth = 0;

		}

}
