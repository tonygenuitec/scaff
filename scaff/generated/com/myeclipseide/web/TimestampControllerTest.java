
package com.myeclipseide.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>TimestampController</code> controller.
 *
 * @see com.myeclipseide.web.TimestampController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/scaff-security-context.xml",
		"file:./resources/scaff-service-context.xml",
		"file:./resources/scaff-dao-context.xml",
		"file:./resources/scaff-web-context.xml" })
public class TimestampControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTimestamp()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTimestamp() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTimestamp");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>timestampControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettimestampControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/timestampController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TimestampController controller = (TimestampController) context.getBean("TimestampController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}