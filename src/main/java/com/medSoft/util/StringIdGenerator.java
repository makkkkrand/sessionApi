package com.medSoft.util;

import java.io.Serializable;
import java.time.DateTimeException;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringIdGenerator implements IdentifierGenerator {

	private static final long serialVersionUID = 1L;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String id="";
		try {
			id = UUID.randomUUID().toString();
		} catch (DateTimeException e) {
			log.error("unable to fetch new Id having error" );
		}
		return String.valueOf(id);
	}
}
