package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float creditLimit) {
		System.out.println("Dear User your Current Account Balance is: "+accBal+" with credit limit of: "+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accBal=" + accBal + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
