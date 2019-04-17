package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members = new ArrayList<>();

	public EmployeeRepository()
		{

		}

	public List<AbsStaffMember> getAllMembers()
		{
			return new ArrayList<AbsStaffMember>(members);
		}

	public void addMember(AbsStaffMember member) throws Exception
		{
			if (member.equals(null))
				throw new Exception("Not NULL");
			members.add(member);
		}

}
