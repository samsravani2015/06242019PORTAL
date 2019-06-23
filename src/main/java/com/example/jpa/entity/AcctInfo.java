package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the acct_info database table.
 * 
 */
@Entity
@Table(name="acct_info")
@NamedQuery(name="AcctInfo.findAll", query="SELECT a FROM AcctInfo a")
public class AcctInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_ID", unique=true, nullable=false)
	private int acctId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCT_END_DT", nullable=false)
	private Date acctEndDt;

	@Column(name="ACCT_NM", nullable=false, length=150)
	private String acctNm;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCT_START_DT", nullable=false)
	private Date acctStartDt;

	@Column(name="AUD_INSRT_ID", nullable=false, length=25)
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP", nullable=false)
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID", length=25)
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;
/*
	//bi-directional many-to-one association to AcctPorfolAssc
	@OneToMany(mappedBy="acctInfo")
	private List<AcctPorfolAssc> acctPorfolAsscs;

	//bi-directional many-to-one association to RegnAcctAssc
	@OneToMany(mappedBy="acctInfo")
	private List<RegnAcctAssc> regnAcctAsscs;
*/
	public AcctInfo() {
	}

	public int getAcctId() {
		return this.acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public Date getAcctEndDt() {
		return this.acctEndDt;
	}

	public void setAcctEndDt(Date acctEndDt) {
		this.acctEndDt = acctEndDt;
	}

	public String getAcctNm() {
		return this.acctNm;
	}

	public void setAcctNm(String acctNm) {
		this.acctNm = acctNm;
	}

	public Date getAcctStartDt() {
		return this.acctStartDt;
	}

	public void setAcctStartDt(Date acctStartDt) {
		this.acctStartDt = acctStartDt;
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

	/*public List<AcctPorfolAssc> getAcctPorfolAsscs() {
		return this.acctPorfolAsscs;
	}

	public void setAcctPorfolAsscs(List<AcctPorfolAssc> acctPorfolAsscs) {
		this.acctPorfolAsscs = acctPorfolAsscs;
	}

	public AcctPorfolAssc addAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		getAcctPorfolAsscs().add(acctPorfolAssc);
		acctPorfolAssc.setAcctInfo(this);

		return acctPorfolAssc;
	}

	public AcctPorfolAssc removeAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		getAcctPorfolAsscs().remove(acctPorfolAssc);
		acctPorfolAssc.setAcctInfo(null);

		return acctPorfolAssc;
	}

	public List<RegnAcctAssc> getRegnAcctAsscs() {
		return this.regnAcctAsscs;
	}

	public void setRegnAcctAsscs(List<RegnAcctAssc> regnAcctAsscs) {
		this.regnAcctAsscs = regnAcctAsscs;
	}

	public RegnAcctAssc addRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		getRegnAcctAsscs().add(regnAcctAssc);
		regnAcctAssc.setAcctInfo(this);

		return regnAcctAssc;
	}

	public RegnAcctAssc removeRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		getRegnAcctAsscs().remove(regnAcctAssc);
		regnAcctAssc.setAcctInfo(null);

		return regnAcctAssc;
	}
*/
}