package com.example.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.RptDtl;
import com.example.jpa.model.Info;
import com.example.jpa.repository.RegnInfoRepository;
import com.example.jpa.repository.RptDtlRepository;

@RestController
public class RptDtlController {

		@Autowired
		RptDtlRepository rptDtlRepo;
		
		@Autowired
		RegnInfoRepository regnInfoRepo;
    
    @GetMapping("/report")
    public List<RptDtl> getAllReports() {
    	System.out.println("HIIIIIIIIIIIIIIIIIIII.......");
    	return rptDtlRepo.findAll();
    }
    
    
    
    @GetMapping("/info")
    public List<Info> getAllInfo() {
    	ArrayList al = new ArrayList();
    	List<Object> details = regnInfoRepo.findAllDetails();
    	for(Object item :details) {
    		Info info = new Info();
    		Object[] itemDetail = (Object[]) item;
    		for (int i = 0; i < itemDetail.length; i++) {
    			if(i==0) {
    				info.setRgnInfo(itemDetail[i]);
    			}else if(i==1) {
    				info.setAcctInfo(itemDetail[i]);
    			}else if(i==2) {
    				info.setPortfInfo(itemDetail[i]);
    			}
    		 }
    		al.add(info);
    	}
    	return al;
    }
      
    
}
