package com.medSoft.app.models;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userdetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Audited
public class Session {

	private static final long serialVersionUID = 7946657849577891456L;
	@Id
	@Column(name = "session_id")
	@GenericGenerator(name = "IntegerIdGenerator", strategy = "com.medSoft.util.StringIdGenerator")
	@GeneratedValue(generator = "IntegerIdGenerator")
	private String id;
	
	@Column
	private String userId;
	
	@Column
	private Date loggedOn;
	
	@Column
	private Date loggedOff;
	
	@Embedded
	private Base base;

}