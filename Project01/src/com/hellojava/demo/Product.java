package com.hellojava.demo;
public class Product{
	private int productId;
	private String productName;
	public int getProductId(){
		return this.productId;
	}
	
	public void setProductId(int productId){
		this.productId=productId;
	}
	
	public String getProductName(){
		return this.productName;
	}
	
	public void setProductName(String productName){
		this.productName=productName;
	}
	
	public String toString(){
		return "Product:["+productId+"   "+productName+"]";
	}
}