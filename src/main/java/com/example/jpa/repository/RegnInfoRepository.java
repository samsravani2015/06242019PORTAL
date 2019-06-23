package com.example.jpa.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.RegnInfo;

/**
 * Created by sambasiva on 05/12/2019.
 */
@Repository
public interface RegnInfoRepository extends JpaRepository<RegnInfo, Long> {
	
	@Query(value = "SELECT r.REGN_NM,a.ACCT_NM,p.PORFOL_NM FROM hc_portal.regn_info r "+
	"LEFT JOIN hc_portal.regn_acct_assc raa ON r.REGN_ID = raa.REGN_ID "+
	"LEFT JOIN hc_portal.acct_info a ON raa.ACCT_ID = a.ACCT_ID "+
	"LEFT JOIN hc_portal.acct_porfol_assc apa ON a.ACCT_ID = apa.ACCT_ID "+
	"LEFT JOIN hc_portal.porfol_info p ON apa.PORFOL_ID = p.PORFOL_ID", nativeQuery = true)
    ArrayList<Object> findAllDetails();
	
	
}