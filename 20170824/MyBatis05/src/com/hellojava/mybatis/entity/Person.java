package com.hellojava.mybatis.entity;

import java.io.Serializable;

public class Person implements Serializable{
	private int personId;
	private String personName;
	private Card card=new Card();
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", card=" + card + "]";
	}
	
}
