package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=1000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal) 
	{
		System.out.println("Dear User your Saving Account Balance is: "+accBal+" *Remember you should maintain a Minimum Balance of: "+MINBAL);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accBal=" + accBal + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
