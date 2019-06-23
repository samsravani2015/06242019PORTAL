package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prgm_info database table.
 * 
 */
@Entity
@Table(name="prgm_info")
@NamedQuery(name="PrgmInfo.findAll", query="SELECT p FROM PrgmInfo p")
public class PrgmInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRGM_ID", unique=true, nullable=false)
	private int prgmId;

	@Column(name="AUD_INSRT_ID", nullable=false, length=50)
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP", nullable=false)
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID", length=50)
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Column(name="PRGM_NM", nullable=false, length=150)
	private String prgmNm;
/*
	//bi-directional many-to-one association to PorfolPrgmAssc
	@OneToMany(mappedBy="prgmInfo")
	private List<PorfolPrgmAssc> porfolPrgmAsscs;

	//bi-directional many-to-one association to PrgmProjAssc
	@OneToMany(mappedBy="prgmInfo")
	private List<PrgmProjAssc> prgmProjAsscs;

*/	public PrgmInfo() {
	}

	public int getPrgmId() {
		return this.prgmId;
	}

	public void setPrgmId(int prgmId) {
		this.prgmId = prgmId;
	}

	public String getAudInsrtId() {
		return this.audInsrtId;
	}

	public void setAudInsrtId(String audInsrtId) {
		this.audInsrtId = audInsrtId;
	}

	public Timestamp getAudInsrtTmstp() {
		return this.audInsrtTmstp;
	}

	public void setAudInsrtTmstp(Timestamp audInsrtTmstp) {
		this.audInsrtTmstp = audInsrtTmstp;
	}

	public String getAudUpdtId() {
		return this.audUpdtId;
	}

	public void setAudUpdtId(String audUpdtId) {
		this.audUpdtId = audUpdtId;
	}

	public Timestamp getAudUpdtTmstp() {
		return this.audUpdtTmstp;
	}

	public void setAudUpdtTmstp(Timestamp audUpdtTmstp) {
		this.audUpdtTmstp = audUpdtTmstp;
	}

	public String getPrgmNm() {
		return this.prgmNm;
	}

	public void setPrgmNm(String prgmNm) {
		this.prgmNm = prgmNm;
	}
/*
	public List<PorfolPrgmAssc> getPorfolPrgmAsscs() {
		return this.porfolPrgmAsscs;
	}

	public void setPorfolPrgmAsscs(List<PorfolPrgmAssc> porfolPrgmAsscs) {
		this.porfolPrgmAsscs = porfolPrgmAsscs;
	}

	public PorfolPrgmAssc addPorfolPrgmAssc(PorfolPrgmAssc porfolPrgmAssc) {
		getPorfolPrgmAsscs().add(porfolPrgmAssc);
		porfolPrgmAssc.setPrgmInfo(this);

		return porfolPrgmAssc;
	}

	public PorfolPrgmAssc removePorfolPrgmAssc(PorfolPrgmAssc porfolPrgmAssc) {
		getPorfolPrgmAsscs().remove(porfolPrgmAssc);
		porfolPrgmAssc.setPrgmInfo(null);

		return porfolPrgmAssc;
	}

	public List<PrgmProjAssc> getPrgmProjAsscs() {
		return this.prgmProjAsscs;
	}

	public void setPrgmProjAsscs(List<PrgmProjAssc> prgmProjAsscs) {
		this.prgmProjAsscs = prgmProjAsscs;
	}

	public PrgmProjAssc addPrgmProjAssc(PrgmProjAssc prgmProjAssc) {
		getPrgmProjAsscs().add(prgmProjAssc);
		prgmProjAssc.setPrgmInfo(this);

		return prgmProjAssc;
	}

	public PrgmProjAssc removePrgmProjAssc(PrgmProjAssc prgmProjAssc) {
		getPrgmProjAsscs().remove(prgmProjAssc);
		prgmProjAssc.setPrgmInfo(null);

		return prgmProjAssc;
	}
*/
}