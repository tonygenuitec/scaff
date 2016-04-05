
package com.myeclipseide.service;

import com.myeclipseide.domain.Timestamp;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Timestamp entities
 * 
 */
public interface TimestampService {

	/**
	 */
	public Timestamp findTimestampByPrimaryKey(Integer id);

	/**
	* Return a count of all Timestamp entity
	* 
	 */
	public Integer countTimestamps();

	/**
	* Delete an existing Timestamp entity
	* 
	 */
	public void deleteTimestamp(Timestamp timestamp);

	/**
	* Load an existing Timestamp entity
	* 
	 */
	public Set<Timestamp> loadTimestamps();

	/**
	* Save an existing Timestamp entity
	* 
	 */
	public void saveTimestamp(Timestamp timestamp_1);

	/**
	* Return all Timestamp entity
	* 
	 */
	public List<Timestamp> findAllTimestamps(Integer startResult, Integer maxRows);
}