package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.DAO.MobileDAO;
import com.wolken.wolkenapp.DAO.MobileDAOImpl;
import com.wolken.wolkenapp.DTO.MobileDTO;
import com.wolken.wolkenapp.exception.MobileIdException;
import com.wolken.wolkenapp.service.MobileService;
import com.wolken.wolkenapp.service.MobileServiceImpl;

public class MobileUtil {
	public static void main(String[] args) {
		MobileService mobileService =new MobileServiceImpl();
		IdChecker id = new IdChecker();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		if(mobileService.validateSize(size)) {
			MobileDAO mobileDAO = new MobileDAOImpl(size);
			for (int i = 0; i < size; i++) {
				MobileDTO mobileDTO = new MobileDTO();
				System.out.println("enter the Id");
				mobileDTO.setMobileId(scanner.nextInt());
				System.out.println("enter the Model Name");
				mobileDTO.setModelName(scanner.next());
				System.out.println("enter the Brand Name ");
				mobileDTO.setBrandName(scanner.next());
				System.out.println("enter the Serial Number");
				mobileDTO.setSerialNumber(scanner.nextInt());
				System.out.println("enter the No Of camera");
				mobileDTO.setNoOfCamera(scanner.nextInt());
				System.out.println("enter the Price");
				mobileDTO.setPrice(scanner.nextInt());
				System.out.println("enter the Memory");
				mobileDTO.setMemory(scanner.next());
				//mobileDAO.add(mobileDTO);
				mobileService.validateAdd(mobileDTO);
			}
			mobileDAO.getAll();
			System.out.println("enter the id for deletion");
			int moibleId=scanner.nextInt();
			mobileService.validateDeleteById(moibleId);
			System.out.println("enter the serialnummber to updated ");
			int serialNo=scanner.nextInt();
			System.out.println("enter the price for updation ");
			int price =scanner.nextInt();
			mobileService.validateUpdateBySerialNo(serialNo, price);
			//System.out.println(mobileDAO.updateBySerialNumber(12345678,23456));
			mobileDAO.getAllByBrandName();
			//mobileDAO.deleteByMobileId(123);
			//System.out.println(mobileDTO);
			
		
		}
		
		
		
			
		}

		
	}


