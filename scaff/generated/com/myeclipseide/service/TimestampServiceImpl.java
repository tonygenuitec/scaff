package com.myeclipseide.service;

import com.myeclipseide.dao.TimestampDAO;

import com.myeclipseide.domain.Timestamp;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Timestamp entities
 * 
 */

@Service("TimestampService")

@Transactional
public class TimestampServiceImpl implements TimestampService {

	/**
	 * DAO injected by Spring that manages Timestamp entities
	 * 
	 */
	@Autowired
	private TimestampDAO timestampDAO;

	/**
	 * Instantiates a new TimestampServiceImpl.
	 *
	 */
	public TimestampServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Timestamp findTimestampByPrimaryKey(Integer id) {
		return timestampDAO.findTimestampByPrimaryKey(id);
	}

	/**
	 * Return a count of all Timestamp entity
	 * 
	 */
	@Transactional
	public Integer countTimestamps() {
		return ((Long) timestampDAO.createQuerySingleResult("select count(o) from Timestamp o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Timestamp entity
	 * 
	 */
	@Transactional
	public void deleteTimestamp(Timestamp timestamp) {
		timestampDAO.remove(timestamp);
		timestampDAO.flush();
	}

	/**
	 * Load an existing Timestamp entity
	 * 
	 */
	@Transactional
	public Set<Timestamp> loadTimestamps() {
		return timestampDAO.findAllTimestamps();
	}

	/**
	 * Save an existing Timestamp entity
	 * 
	 */
	@Transactional
	public void saveTimestamp(Timestamp timestamp) {
		Timestamp existingTimestamp = timestampDAO.findTimestampByPrimaryKey(timestamp.getId());

		if (existingTimestamp != null) {
			if (existingTimestamp != timestamp) {
				existingTimestamp.setId(timestamp.getId());
				existingTimestamp.setLoginDate(timestamp.getLoginDate());
				existingTimestamp.setLogoutDate(timestamp.getLogoutDate());
				existingTimestamp.setCreateDate(timestamp.getCreateDate());
				existingTimestamp.setUpdateDate(timestamp.getUpdateDate());
				existingTimestamp.setIsActive(timestamp.getIsActive());
			}
			timestamp = timestampDAO.store(existingTimestamp);
		} else {
			timestamp = timestampDAO.store(timestamp);
		}
		timestampDAO.flush();
	}

	/**
	 * Return all Timestamp entity
	 * 
	 */
	@Transactional
	public List<Timestamp> findAllTimestamps(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Timestamp>(timestampDAO.findAllTimestamps(startResult, maxRows));
	}
}
