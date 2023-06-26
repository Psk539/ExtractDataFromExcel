package com.ExtractDataFromEcel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="draft_details")
public class Draft_Details {
	
	@Id
	private Double draftId;
	
	@Column(name="draft")
	private Double draft;
	
	
	@Column(name="dispt")
	private Double dispt;
	
	@Column(name="dis")
	private Double dis;
	
	@Column(name="tkm")
	private Double tkm;
	
	@Column(name="lkm")
	private Double lkm;
	
	@Column(name="lcb")
	private Double lcb;
	
	
	@Column(name="lcf")
	private Double lcf;
	
	@Column(name="tpc")
	private Double tpc;
	
	@Column(name="mtc")
	private Double mtc;
	
	@Column(name="kb")
	private Double kb;
	
	@Column(name="aw")
	private Double aw;
	
	@Column(name="am")
	private Double am;
	
	@Column(name="other")
	private Double other;
	
	@Column(name="shipImoNo")
	private Double shipImoNo;
	

}

