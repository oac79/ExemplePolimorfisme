package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller = new JobsController();

	public static void main(String[] args) throws Exception
		{

			controller.createBoss("Pepe Boss -------------", "Address molona  -------", "666666666 -------", 100.0);
			controller.createEmployee("Pedro Employee --------", "Address molona 2 ------", "665266666 -------", 40.0);
			controller.createEmployee("Laura Employee --------", "Address molona 3 ------", "625266666 -------", 45.0);
			controller.createVolunteer("Juan Volunteer --------", "Address molona 4 ------", "614266666 -------", "");
			controller.createManager("Pedro Manager ---------", "Address molona 2 ------", "665226666 -------", 80.0);

			controller.payAllEmployeers();

			String allEmployees = controller.getAllEmployees();

			System.out.println("EMPLOYEE: " + "\n" + allEmployees + "\n");

		}

}
