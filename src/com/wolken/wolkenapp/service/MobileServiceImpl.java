package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.DAO.MobileDAO;
import com.wolken.wolkenapp.DAO.MobileDAOImpl;
import com.wolken.wolkenapp.DTO.MobileDTO;

public class MobileServiceImpl implements MobileService {
	int size =0;
	@Override
	public boolean validateSize(int size) {
		// TODO Auto-generated method stub
		if(size >0) {
			this.size=size;
			System.out.println("inside validate");
			return true;
		}
		else {
			return false;
		}
	}
	MobileDAO mobileDAO=new MobileDAOImpl(size);
	@Override
	public void validateAdd(MobileDTO mobileDTO) {
		// TODO Auto-generated method stub
		if(mobileDTO.getMobileId()>0) {
			if(mobileDTO.getBrandName()!=null) {
				if (mobileDTO.getModelName()!=null) {
					if(mobileDTO.getSerialNumber()>0) {
						if(mobileDTO.getNoOfCamera()>0) {
							if(mobileDTO.getPrice()>0) {
								if(mobileDTO.getMemory()!=null) {
									System.out.println("inside add validation");
									System.out.println(mobileDAO.add(mobileDTO));
								}else {
									System.out.println("Wrong memory data");
								}
							}else {
								System.out.println("Wrong price data");
							}
						}else {
							System.out.println("Wrong no of camera data");
						}
					}else {
						System.out.println("Wrong serial number data");
					}
				}else {
					System.out.println("Wrong model name data");
				}
				
			}else {
				System.out.println("Wrong brandname dta ");
			}
		}else {
			System.out.println("Wrong mobile id data");
		}
	}

	@Override
	public void validateDeleteById(int mobileId) {
		// TODO Auto-generated method stub
		if(mobileId>0) {
			System.out.println("validated id for delete function");
			mobileDAO.deleteByMobileId(mobileId);
		}
		else {
			System.out.println("Wrong id given for delete function ");
		}
	}

	@Override
	public void validateUpdateBySerialNo(int serialno,int price) {
		// TODO Auto-generated method stub
		if(serialno>0) {
			System.out.println("validated serialno by update function");
			if(price>0) {
				System.out.println("validate id by update function");
				System.out.println(mobileDAO.updateBySerialNumber(serialno, price));
			}else {
				System.out.println("wrong price give to update");
			}
		}else {
			System.out.println("wrong serialno given to update");
		}
	}

	

}
