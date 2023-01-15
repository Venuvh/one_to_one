package com.ty.one_to_one.dao;

import java.util.Scanner;
import com.ty.one_to_one_uni.dto.AdhaarCard;
import com.ty.one_to_one_uni.dto.Person;

public class PersonDao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean condition = true;
		PersonCRUD personCRUD = new PersonCRUD();
		do {
			System.out.println(
					"Enter your choice \n Enter 1 to save Person  \n Enter 2 to Update Person \n Enter 3 to Delete Person  \n Enter 4 to get Person details using id  \n Enter 5 to get all details in list format \n enter 6 to Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Id");
				int id = scanner.nextInt();
				System.out.println("enter Name");
				String name = scanner.next();
				System.out.println("enter Phone");
				long phone = scanner.nextLong();
				System.out.println("Enter Address");
				String address = scanner.next();
				Person person = new Person();
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				person.setAddress(address);

				AdhaarCard adhaarCard = new AdhaarCard();
				System.out.println("Enter AdhaarId");
				int id1 = scanner.nextInt();
				System.out.println("enter Name");
				String name1 = scanner.next();
				System.out.println("Enter Address");
				String address1 = scanner.next();
				adhaarCard.setAid(id1);
				adhaarCard.setName(name1);
				adhaarCard.setAddress(address1);
				person.setAdhaarCard(adhaarCard);
				personCRUD.SavePerson(person);
			}
				break;
			case 2: {
				System.out.println("Enter valid Id only Don't enter duplicate ");
				System.out.println("Enter Id ");
				int id = scanner.nextInt();
				System.out.println("enter Name");
				String name = scanner.next();
				System.out.println("enter Phone");
				long phone = scanner.nextLong();
				System.out.println("Enter Address");
				String address = scanner.next();
				Person person = new Person();
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				person.setAddress(address);

				AdhaarCard adhaarCard = new AdhaarCard();
				System.out.println("Enter AdhaarId");
				int id1 = scanner.nextInt();
				System.out.println("enter Name");
				String name1 = scanner.next();
				System.out.println("Enter Address");
				String address1 = scanner.next();
				adhaarCard.setAid(id1);
				adhaarCard.setName(name1);
				adhaarCard.setAddress(address1);
				person.setAdhaarCard(adhaarCard);
				personCRUD.updatePerson(person);
			}
				break;
			case 3: {
				System.out.println("Enter id to be delete");
				int id = scanner.nextInt();
				personCRUD.deletePerson(id);
			}
			case 4: {
				System.out.println("Enter id ");
				int id = scanner.nextInt();
				System.out.println(personCRUD.getdetails(id));
			}
				break;
			case 5: {
				System.out.println(personCRUD.getDetailsList());
			}
				break;
			case 6: {
				condition = false;
				System.out.println("thank You");
			}
			}
		} while (condition);
	}
}
