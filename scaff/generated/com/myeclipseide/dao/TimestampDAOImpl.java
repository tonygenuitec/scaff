
package com.myeclipseide.dao;

import com.myeclipseide.domain.Timestamp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Timestamp entities.
 * 
 */
@Repository("TimestampDAO")

@Transactional
public class TimestampDAOImpl extends AbstractJpaDao<Timestamp> implements TimestampDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Timestamp.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySql
	 *
	 */
	@PersistenceContext(unitName = "MySql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TimestampDAOImpl
	 *
	 */
	public TimestampDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findTimestampByIsActive
	 *
	 */
	@Transactional
	public Set<Timestamp> findTimestampByIsActive(Boolean isActive) throws DataAccessException {

		return findTimestampByIsActive(isActive, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampByIsActive
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Timestamp> findTimestampByIsActive(Boolean isActive, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTimestampByIsActive", startResult, maxRows, isActive);
		return new LinkedHashSet<Timestamp>(query.getResultList());
	}

	/**
	 * JPQL Query - findTimestampByUpdateDate
	 *
	 */
	@Transactional
	public Set<Timestamp> findTimestampByUpdateDate(java.util.Calendar updateDate) throws DataAccessException {

		return findTimestampByUpdateDate(updateDate, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampByUpdateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Timestamp> findTimestampByUpdateDate(java.util.Calendar updateDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTimestampByUpdateDate", startResult, maxRows, updateDate);
		return new LinkedHashSet<Timestamp>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTimestamps
	 *
	 */
	@Transactional
	public Set<Timestamp> findAllTimestamps() throws DataAccessException {

		return findAllTimestamps(-1, -1);
	}

	/**
	 * JPQL Query - findAllTimestamps
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Timestamp> findAllTimestamps(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTimestamps", startResult, maxRows);
		return new LinkedHashSet<Timestamp>(query.getResultList());
	}

	/**
	 * JPQL Query - findTimestampById
	 *
	 */
	@Transactional
	public Timestamp findTimestampById(Integer id) throws DataAccessException {

		return findTimestampById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampById
	 *
	 */

	@Transactional
	public Timestamp findTimestampById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTimestampById", startResult, maxRows, id);
			return (com.myeclipseide.domain.Timestamp) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTimestampByLoginDate
	 *
	 */
	@Transactional
	public Set<Timestamp> findTimestampByLoginDate(java.util.Calendar loginDate) throws DataAccessException {

		return findTimestampByLoginDate(loginDate, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampByLoginDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Timestamp> findTimestampByLoginDate(java.util.Calendar loginDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTimestampByLoginDate", startResult, maxRows, loginDate);
		return new LinkedHashSet<Timestamp>(query.getResultList());
	}

	/**
	 * JPQL Query - findTimestampByPrimaryKey
	 *
	 */
	@Transactional
	public Timestamp findTimestampByPrimaryKey(Integer id) throws DataAccessException {

		return findTimestampByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampByPrimaryKey
	 *
	 */

	@Transactional
	public Timestamp findTimestampByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTimestampByPrimaryKey", startResult, maxRows, id);
			return (com.myeclipseide.domain.Timestamp) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTimestampByLogoutDate
	 *
	 */
	@Transactional
	public Set<Timestamp> findTimestampByLogoutDate(java.util.Calendar logoutDate) throws DataAccessException {

		return findTimestampByLogoutDate(logoutDate, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampByLogoutDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Timestamp> findTimestampByLogoutDate(java.util.Calendar logoutDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTimestampByLogoutDate", startResult, maxRows, logoutDate);
		return new LinkedHashSet<Timestamp>(query.getResultList());
	}

	/**
	 * JPQL Query - findTimestampByCreateDate
	 *
	 */
	@Transactional
	public Set<Timestamp> findTimestampByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findTimestampByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findTimestampByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Timestamp> findTimestampByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTimestampByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<Timestamp>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Timestamp entity) {
		return true;
	}
}
