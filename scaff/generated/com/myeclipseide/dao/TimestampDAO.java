
package com.myeclipseide.dao;

import com.myeclipseide.domain.Timestamp;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Timestamp entities.
 * 
 */
public interface TimestampDAO extends JpaDao<Timestamp> {

	/**
	 * JPQL Query - findTimestampByIsActive
	 *
	 */
	public Set<Timestamp> findTimestampByIsActive(Boolean isActive) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByIsActive
	 *
	 */
	public Set<Timestamp> findTimestampByIsActive(Boolean isActive, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByUpdateDate
	 *
	 */
	public Set<Timestamp> findTimestampByUpdateDate(java.util.Calendar updateDate) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByUpdateDate
	 *
	 */
	public Set<Timestamp> findTimestampByUpdateDate(Calendar updateDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTimestamps
	 *
	 */
	public Set<Timestamp> findAllTimestamps() throws DataAccessException;

	/**
	 * JPQL Query - findAllTimestamps
	 *
	 */
	public Set<Timestamp> findAllTimestamps(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampById
	 *
	 */
	public Timestamp findTimestampById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampById
	 *
	 */
	public Timestamp findTimestampById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByLoginDate
	 *
	 */
	public Set<Timestamp> findTimestampByLoginDate(java.util.Calendar loginDate) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByLoginDate
	 *
	 */
	public Set<Timestamp> findTimestampByLoginDate(Calendar loginDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByPrimaryKey
	 *
	 */
	public Timestamp findTimestampByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByPrimaryKey
	 *
	 */
	public Timestamp findTimestampByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByLogoutDate
	 *
	 */
	public Set<Timestamp> findTimestampByLogoutDate(java.util.Calendar logoutDate) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByLogoutDate
	 *
	 */
	public Set<Timestamp> findTimestampByLogoutDate(Calendar logoutDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByCreateDate
	 *
	 */
	public Set<Timestamp> findTimestampByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findTimestampByCreateDate
	 *
	 */
	public Set<Timestamp> findTimestampByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

}