package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the proj_info database table.
 * 
 */
@Entity
@Table(name="proj_info")
@NamedQuery(name="ProjInfo.findAll", query="SELECT p FROM ProjInfo p")
public class ProjInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROJ_ID", unique=true, nullable=false)
	private int projId;

	@Column(name="AUD_INSRT_ID", nullable=false, length=25)
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP", nullable=false)
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID", length=25)
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Column(name="PROJ_ADDL_DTLS", length=150)
	private String projAddlDtls;

	@Column(name="PROJ_CNTX", length=150)
	private String projCntx;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJ_END_DT")
	private Date projEndDt;

	@Column(name="PROJ_NM", nullable=false, length=150)
	private String projNm;

	@Column(name="PROJ_PPL_SFT_ID", nullable=false, length=150)
	private String projPplSftId;

	@Column(name="PROJ_SHRT_DESC", length=50)
	private String projShrtDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJ_START_DT", nullable=false)
	private Date projStartDt;

/*	//bi-directional many-to-one association to PrgmProjAssc
	@OneToMany(mappedBy="projInfo")
	private List<PrgmProjAssc> prgmProjAsscs;
*/
	public ProjInfo() {
	}

	public int getProjId() {
		return this.projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
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

	public String getProjAddlDtls() {
		return this.projAddlDtls;
	}

	public void setProjAddlDtls(String projAddlDtls) {
		this.projAddlDtls = projAddlDtls;
	}

	public String getProjCntx() {
		return this.projCntx;
	}

	public void setProjCntx(String projCntx) {
		this.projCntx = projCntx;
	}

	public Date getProjEndDt() {
		return this.projEndDt;
	}

	public void setProjEndDt(Date projEndDt) {
		this.projEndDt = projEndDt;
	}

	public String getProjNm() {
		return this.projNm;
	}

	public void setProjNm(String projNm) {
		this.projNm = projNm;
	}

	public String getProjPplSftId() {
		return this.projPplSftId;
	}

	public void setProjPplSftId(String projPplSftId) {
		this.projPplSftId = projPplSftId;
	}

	public String getProjShrtDesc() {
		return this.projShrtDesc;
	}

	public void setProjShrtDesc(String projShrtDesc) {
		this.projShrtDesc = projShrtDesc;
	}

	public Date getProjStartDt() {
		return this.projStartDt;
	}

	public void setProjStartDt(Date projStartDt) {
		this.projStartDt = projStartDt;
	}

/*	public List<PrgmProjAssc> getPrgmProjAsscs() {
		return this.prgmProjAsscs;
	}

	public void setPrgmProjAsscs(List<PrgmProjAssc> prgmProjAsscs) {
		this.prgmProjAsscs = prgmProjAsscs;
	}

	public PrgmProjAssc addPrgmProjAssc(PrgmProjAssc prgmProjAssc) {
		getPrgmProjAsscs().add(prgmProjAssc);
		prgmProjAssc.setProjInfo(this);

		return prgmProjAssc;
	}

	public PrgmProjAssc removePrgmProjAssc(PrgmProjAssc prgmProjAssc) {
		getPrgmProjAsscs().remove(prgmProjAssc);
		prgmProjAssc.setProjInfo(null);

		return prgmProjAssc;
	}
*/
}