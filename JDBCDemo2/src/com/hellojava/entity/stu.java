package com.hellojava.entity;

public class stu {
	private int ID;
	private String NAME;
	private int AGE;
	private String SEX;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	@Override
	public String toString() {
		return "stu [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", SEX=" + SEX + "]";
	}
	
}
