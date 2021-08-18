//Presentation Layer
package com.onlineshoping;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.gowtham.dao.CustomerLoginDAO;
import com.gowtham.dao.impl.CustomerLoginDAOimpl;
import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public class Main {
	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) throws BusinessException {

		Scanner scanner = new Scanner(System.in);
		CustomerLoginDAO customerLoginDAO = new CustomerLoginDAOimpl();
		log.info("Welcome to Konuko OnlineShopping App V1.0");
		log.info("==========================================");

		int ch = 0;
		do {
			log.info("\n\nMain Menu");
			log.info("1)Login as Employee");
			log.info("2)Login as Customer");
			log.info("3)New  Customer? Register here");
			log.info("4)Exit");
			log.info("Please enter your choice(1-4)");

			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}

			switch (ch) {
			case 1:
				log.info("Enter your employee email");
				String email = scanner.nextLine();
				log.info("Enter your password");
				String password = scanner.nextLine();
				try {
					if (isValidEmployeeId(email, password) == true) {
						log.info("Employee logged in sucessfully");
					}
				} catch (BusinessException e) {
					log.info("Invalid Credentials");
				}

				break;
			case 2:
				int s = 0;
				log.info("Enter your Email");
				String email1 = scanner.nextLine();
				log.info("Enter your Password");
				String password1 = scanner.nextLine();
				if (isValidCustomerId(email1, password1) == true) {
				}
				do {
					log.info("1)Search your products");
					log.info("2)View Orders");
					log.info("3)Logout");
					try {
						s = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e) {
						System.out.println(e.getMessage());
					}				
				} while (s != 3);

				break;
			case 3:
				int option = 0;

				try {
					option = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
				}
				log.info("Enter your name: ");
				String Name = scanner.nextLine();
				log.info("Enter your Email: ");
				String Email = scanner.nextLine();
				log.info("Enter your password");
				String Password = scanner.nextLine();
				CustomerDetails customerDetails = new CustomerDetails(Name, Email, Password);
				try {
					if (customerLoginDAO.createCustomerLogin(customerDetails) == 1) {
						log.info("Customer has been added sucessfully");
					}
				} catch (BusinessException e) {
					log.info(e.getMessage());
				}
				break;
			case 4:
				log.info("Thanks for using the APP we will see you soon :)");
				break;
			default:
				log.warn("Invalid Search option..Choice should be only b/w 1-4 only.Kindly Retry ");
				break;
			}
		} while (ch != 4);

	}

	private static boolean isValidEmployeeId(String email, String password) throws BusinessException {
		if (email.equals("abc@konuko.com") && password.equals("abcxyz")) {
			return true;
		}
		return false;
	}

	private static boolean isValidCustomerId(String email1, String password1) throws BusinessException {
		if (email1.equals("xyz@gmail.com") && password1.equals("xyz123")) {
			return true;
		}
		if (email1.equals("xyz1@gmail.com") && password1.equals("xyz1231")) {
			return true;
		}
		return false;
	}
}
