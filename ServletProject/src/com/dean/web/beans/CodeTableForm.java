package com.dean.web.beans;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts.action.ActionForm;

/**
 * @author Lucifer
 * @version create time：Jul 7, 2014 11:15:02 AM
 */
public class CodeTableForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> map = new HashMap<String, Object>();


	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void setValue(String key,Object value)
	{
		map.put(key, value);
	}
	
	public Object getValue(String key)
	{
		return map.get(key);
	}
}
