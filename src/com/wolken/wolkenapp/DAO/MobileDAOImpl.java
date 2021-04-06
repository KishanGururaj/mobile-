package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.MobileDTO;

public class MobileDAOImpl implements MobileDAO {
	MobileDTO[] dto;
	int index = 0;
	int flag = 0;

	public MobileDAOImpl(int size) {
		dto = new MobileDTO[size];
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i]);
		}

	}

	@Override
	public void  deleteByMobileId(int mobileId) {
		// TODO Auto-generated method stub
		for (int i = 0; i < dto.length; i++) {
			int id = dto[i].getMobileId();
			if (id == mobileId) {
				System.out.println("condition is true ");
				System.out.println(dto[i]);
				dto[i] = null;
				System.out.println("data deleted ");
			}

		}
		for(int i=0;i<dto.length;i++) {
			System.out.println(dto[i]);
		}
	}

	@Override
	public MobileDTO updateBySerialNumber(int serialNumber, int price) {
		// TODO Auto-generated method stub
		for (int i = 0; i < dto.length; i++) {
			int Sno = dto[i].getSerialNumber();
			if (Sno == serialNumber) {
				System.out.println("enter the price to be update");
				dto[i].setPrice(price);
				return dto[i];

			} else {
				return null;
			}

		}
		return null;

	}

	@Override
	public void getAllByBrandName() {
		// TODO Auto-generated method stub
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i].getBrandName());
		}

	}

	public boolean add(MobileDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside add");
		System.out.println(index);
		System.out.println(dto);
		if (dto!=null){
			this.dto[index++]=dto;
			System.out.println("data is added");
			return true;
			}
		else {
			System.out.println("data is not added ");
			return false;
	}
	}

}
