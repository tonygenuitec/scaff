
package com.myeclipseide.service;

import com.myeclipseide.domain.Timestamp;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/scaff-security-context.xml",
		"file:./resources/scaff-service-context.xml",
		"file:./resources/scaff-dao-context.xml",
		"file:./resources/scaff-web-context.xml" })
@Transactional
public class TimestampServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected TimestampService service;

	/**
	 * Instantiates a new TimestampServiceTest.
	 *
	 */
	public TimestampServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTimestampByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTimestampByPrimaryKey 
		Integer id = 0;
		Timestamp response = null;
		response = service.findTimestampByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findTimestampByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all Timestamp entity
	* 
	 */
	@Test
	public void countTimestamps() {
		Integer response = null;
		response = service.countTimestamps();
		// TODO: JUnit - Add assertions to test outputs of operation: countTimestamps
	}

	/**
	 * Operation Unit Test
	* Delete an existing Timestamp entity
	* 
	 */
	@Test
	public void deleteTimestamp() {
		// TODO: JUnit - Populate test inputs for operation: deleteTimestamp 
		Timestamp timestamp = new com.myeclipseide.domain.Timestamp();
		service.deleteTimestamp(timestamp);
	}

	/**
	 * Operation Unit Test
	* Load an existing Timestamp entity
	* 
	 */
	@Test
	public void loadTimestamps() {
		Set<Timestamp> response = null;
		response = service.loadTimestamps();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTimestamps
	}

	/**
	 * Operation Unit Test
	* Save an existing Timestamp entity
	* 
	 */
	@Test
	public void saveTimestamp() {
		// TODO: JUnit - Populate test inputs for operation: saveTimestamp 
		Timestamp timestamp_1 = new com.myeclipseide.domain.Timestamp();
		service.saveTimestamp(timestamp_1);
	}

	/**
	 * Operation Unit Test
	* Return all Timestamp entity
	* 
	 */
	@Test
	public void findAllTimestamps() {
		// TODO: JUnit - Populate test inputs for operation: findAllTimestamps 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Timestamp> response = null;
		response = service.findAllTimestamps(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTimestamps
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
