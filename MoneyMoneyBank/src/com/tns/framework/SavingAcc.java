package com.tns.framework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalary;
	private static final float MINBAL=1000;
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	public float getAccBal() {
		return accBal;
	}

	public void withdraw(float accBal) 
	{
		System.out.println("Account balance is:" +accBal);
	} 
	
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accBal=" + accBal + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	
}

