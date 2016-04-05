
package com.myeclipseide.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTimestamps", query = "select myTimestamp from Timestamp myTimestamp"),
		@NamedQuery(name = "findTimestampByCreateDate", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.createDate = ?1"),
		@NamedQuery(name = "findTimestampById", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.id = ?1"),
		@NamedQuery(name = "findTimestampByIsActive", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.isActive = ?1"),
		@NamedQuery(name = "findTimestampByLoginDate", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.loginDate = ?1"),
		@NamedQuery(name = "findTimestampByLogoutDate", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.logoutDate = ?1"),
		@NamedQuery(name = "findTimestampByPrimaryKey", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.id = ?1"),
		@NamedQuery(name = "findTimestampByUpdateDate", query = "select myTimestamp from Timestamp myTimestamp where myTimestamp.updateDate = ?1") })

@Table(catalog = "test", name = "timestamp")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "scaff/com/myeclipseide/domain", name = "Timestamp")

public class Timestamp implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "login_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar loginDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "logout_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar logoutDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar createDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar updateDate;
	/**
	 */

	@Column(name = "isActive")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean isActive;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setLoginDate(Calendar loginDate) {
		this.loginDate = loginDate;
	}

	/**
	 */
	public Calendar getLoginDate() {
		return this.loginDate;
	}

	/**
	 */
	public void setLogoutDate(Calendar logoutDate) {
		this.logoutDate = logoutDate;
	}

	/**
	 */
	public Calendar getLogoutDate() {
		return this.logoutDate;
	}

	/**
	 */
	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	/**
	 */
	public Calendar getCreateDate() {
		return this.createDate;
	}

	/**
	 */
	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 */
	public Calendar getUpdateDate() {
		return this.updateDate;
	}

	/**
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 */
	public Boolean getIsActive() {
		return this.isActive;
	}

	/**
	 */
	public Timestamp() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Timestamp that) {
		setId(that.getId());
		setLoginDate(that.getLoginDate());
		setLogoutDate(that.getLogoutDate());
		setCreateDate(that.getCreateDate());
		setUpdateDate(that.getUpdateDate());
		setIsActive(that.getIsActive());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("loginDate=[").append(loginDate).append("] ");
		buffer.append("logoutDate=[").append(logoutDate).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("updateDate=[").append(updateDate).append("] ");
		buffer.append("isActive=[").append(isActive).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Timestamp))
			return false;
		Timestamp equalCheck = (Timestamp) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
