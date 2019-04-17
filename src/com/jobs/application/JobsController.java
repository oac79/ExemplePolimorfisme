package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();

	public JobsController()
		{

		}

	public Employee createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
		{
			AbsStaffMember employee = new Employee(name, address, phone, salaryPerMonth,
					PaymentFactory.createPaymentRateEmployee());
			repository.addMember(employee);
			return (Employee) employee;
		}

	public void createBoss(String name, String address, String phone, double salaryPerMonth) throws Exception
		{
			AbsStaffMember boss = new Employee(name, address, phone, salaryPerMonth,
					PaymentFactory.createPaymentRateBoss());
			repository.addMember(boss);
		}

	public void createManager(String name, String address, String phone, double salaryPerMonth) throws Exception
		{
			AbsStaffMember manager = new Employee(name, address, phone, salaryPerMonth,
					PaymentFactory.createIPaymentRateManager());
			repository.addMember(manager);
		}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception
		{
			AbsStaffMember volunteer = new Volunteer(name, address, phone, description);
			repository.addMember(volunteer);

		}

	public void payAllEmployeers()
		{
			List<AbsStaffMember> employees = new ArrayList<>();
			employees = repository.getAllMembers();
			for (int i = 0; i < employees.size(); i++)
				{
					employees.get(i).pay();
				}

		}

	public String getAllEmployees()
		{
			List<AbsStaffMember> members = new ArrayList<AbsStaffMember>();
			members = repository.getAllMembers();
			AbsStaffMember employee;
			String employeeList = "";
			for (int i = 0; i < members.size(); i++)
				{
					employee = members.get(i);
					String employeeString = employee.getName().concat(" " + employee.getAddress())
							.concat(" " + employee.getPhone()).concat(" " + employee.getTotalPaid()) + "\n";
					employeeList = employeeList.concat(employeeString);
				}
			return employeeList;

		}

}
