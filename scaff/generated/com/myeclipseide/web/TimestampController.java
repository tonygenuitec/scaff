package com.myeclipseide.web;

import com.myeclipseide.dao.TimestampDAO;

import com.myeclipseide.domain.Timestamp;

import com.myeclipseide.service.TimestampService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Timestamp entities
 * 
 */

@Controller("TimestampController")

public class TimestampController {

	/**
	 * DAO injected by Spring that manages Timestamp entities
	 * 
	 */
	@Autowired
	private TimestampDAO timestampDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Timestamp entities
	 * 
	 */
	@Autowired
	private TimestampService timestampService;

	/**
	 * Create a new Timestamp entity
	 * 
	 */
	@RequestMapping("/newTimestamp")
	public ModelAndView newTimestamp() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("timestamp", new Timestamp());
		mav.addObject("newFlag", true);
		mav.setViewName("timestamp/editTimestamp.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/timestampController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the Timestamp entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteTimestamp")
	public ModelAndView confirmDeleteTimestamp(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("timestamp", timestampDAO.findTimestampByPrimaryKey(idKey));
		mav.setViewName("timestamp/deleteTimestamp.jsp");

		return mav;
	}

	/**
	* Entry point to show all Timestamp entities
	* 
	*/
	public String indexTimestamp() {
		return "redirect:/indexTimestamp";
	}

	/**
	* Edit an existing Timestamp entity
	* 
	*/
	@RequestMapping("/editTimestamp")
	public ModelAndView editTimestamp(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("timestamp", timestampDAO.findTimestampByPrimaryKey(idKey));
		mav.setViewName("timestamp/editTimestamp.jsp");

		return mav;
	}

	/**
	* Delete an existing Timestamp entity
	* 
	*/
	@RequestMapping("/deleteTimestamp")
	public String deleteTimestamp(@RequestParam Integer idKey) {
		Timestamp timestamp = timestampDAO.findTimestampByPrimaryKey(idKey);
		timestampService.deleteTimestamp(timestamp);
		return "forward:/indexTimestamp";
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Save an existing Timestamp entity
	* 
	*/
	@RequestMapping("/saveTimestamp")
	public String saveTimestamp(@ModelAttribute Timestamp timestamp) {
		timestampService.saveTimestamp(timestamp);
		return "forward:/indexTimestamp";
	}

	/**
	* Show all Timestamp entities
	* 
	*/
	@RequestMapping("/indexTimestamp")
	public ModelAndView listTimestamps() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("timestamps", timestampService.loadTimestamps());

		mav.setViewName("timestamp/listTimestamps.jsp");

		return mav;
	}

	/**
	* Select an existing Timestamp entity
	* 
	*/
	@RequestMapping("/selectTimestamp")
	public ModelAndView selectTimestamp(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("timestamp", timestampDAO.findTimestampByPrimaryKey(idKey));
		mav.setViewName("timestamp/viewTimestamp.jsp");

		return mav;
	}
}