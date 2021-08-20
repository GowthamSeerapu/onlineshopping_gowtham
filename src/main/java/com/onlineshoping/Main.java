//Presentation Layer
package com.onlineshoping;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;
import com.online.model.ProductDetails;
import com.online.service.CustomerService;
import com.online.service.CustomerValidationService;
import com.online.service.ProductService;
import com.online.service.ViewProductService;
import com.online.service.impl.CustomerServiceImpl;
import com.online.service.impl.CustomerValidationServiveImpl;
import com.online.service.impl.ProductServiceImpl;
import com.online.service.impl.ViewProductServiceImpl;

public class Main {
	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) throws BusinessException {

		Scanner scanner = new Scanner(System.in);

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

						log.info("\nEnter Product Name: ");
						String name = scanner.nextLine();
						log.info("\nEnter Product Price: ");
						int price = Integer.parseInt(scanner.nextLine());
						log.info("\nEnter Product Brand: ");
						String brand = scanner.nextLine();
						log.info("Enter Product Catergory: ");
						String category = scanner.nextLine();
						ProductDetails productDetails = new ProductDetails(price, name, brand, category);
						ProductService productService = new ProductServiceImpl();
						try {

							int productId = productService.createProductService(productDetails);
							if (productId != 0) {
								log.info("Product has been added sucessfully");
							}
						} catch (BusinessException e) {
							log.info(e.getMessage());
						}
					} else {
						log.info("Invalid Credentials");
					}
				} catch (BusinessException e) {
					log.info(e.getMessage());
				}

				break;
			case 2:
				int s = 0;
				CustomerValidationService customerValidationService = new CustomerValidationServiveImpl();
				CustomerDetails customerDetails = new CustomerDetails();
				log.info("Enter your Email");
				// System.out.println("enter your email");
				String email1 = scanner.nextLine();

				log.info("Enter your Password");

				String password1 = scanner.nextLine();
				customerDetails = customerValidationService.isValidUser(email1, password1);
				String q = customerDetails.getCust_email();
				String p = customerDetails.getCust_password();
				if (p.equals(password1) && q.equals(email1)) {
					log.info("Sucessfully logged in!!!");
					do {
						log.info("1)View Products");
						log.info("2)View Orders");
						log.info("3)Logout");
						try {
							s = Integer.parseInt(scanner.nextLine());
						} catch (NumberFormatException e) {
							System.out.println(e.getMessage());
						}
						ViewProductService viewProductService = new ViewProductServiceImpl();
						switch (s) {
						case 1:

							log.info("Below are the Products");
							List<ProductDetails> pd = viewProductService.getAllProducts();
							if (pd != null && pd.size() > 0) {
								log.info("Select the products from below");
								for (ProductDetails productDetails : pd) {
									log.info(productDetails);
								}
							}

							break;
						case 2:

							break;

						case 3:
							break;

						default:
							break;
						}

					} while (s!=3);
				} else {
					log.info("Invalid Credentials\nTry again with Correct Email and Password ");
				}
				break;
			case 3:
				CustomerService customerLogin = new CustomerServiceImpl();
				log.info("Enter your name: ");
				String Name = scanner.nextLine();
				log.info("Enter your Email: ");
				String Email = scanner.nextLine();
				log.info("Enter your password");
				String Password = scanner.nextLine();
				CustomerDetails customerDetails1= new CustomerDetails(Name, Email, Password);
				try {
					int customerId = customerLogin.createCustomerLogin(customerDetails1);
					if (customerId != 0) {
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
		if (email.equals("employee@konuko.com") && password.equals("employee")) {
			return true;
		}
		return false;
	}

//	private static boolean isValidCustomerId(String email1, String password1) throws BusinessException {
//		if (email1.equals("customer@gmail.com") && password1.equals("customer")) {
//			return true;
//		}
//		if (email1.equals("customers@gmail.com") && password1.equals("customers")) {
//			return true;
//		}
//		return false;
}
