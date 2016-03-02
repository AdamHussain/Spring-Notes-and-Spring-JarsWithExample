package com.adam.app;

public class Address {

private int aid;
private String area;
private String city;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", area=" + area + ", city=" + city + "]";
}


	
}
