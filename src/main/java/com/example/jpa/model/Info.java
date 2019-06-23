package com.example.jpa.model;

public class Info {
Object rgnInfo;
Object acctInfo;
Object portfInfo;

public Info(Object rgnInfo, Object acctInfo, Object portfInfo) {
	this.rgnInfo = rgnInfo;
	this.rgnInfo = rgnInfo;
	this.portfInfo = portfInfo;
}

public Info() {
	
}

public Object getRgnInfo() {
	return rgnInfo;
}

public void setRgnInfo(Object rgnInfo) {
	this.rgnInfo = rgnInfo;
}

public Object getAcctInfo() {
	return acctInfo;
}

public void setAcctInfo(Object acctInfo) {
	this.acctInfo = acctInfo;
}

public Object getPortfInfo() {
	return portfInfo;
}

public void setPortfInfo(Object portfInfo) {
	this.portfInfo = portfInfo;
}

}

