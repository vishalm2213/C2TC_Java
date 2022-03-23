package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory {
	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal,isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}
	
	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
