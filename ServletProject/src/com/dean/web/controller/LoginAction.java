package com.dean.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import com.dean.web.beans.CodeTableForm;
import com.dean.web.utils.StrUtils;

/**
 * @author Lucifer
 * @version create time：Jul 7, 2014 11:24:15 AM
 */
@Controller("/login")
public class LoginAction extends Action
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CodeTableForm sform = (CodeTableForm)form;
		StrUtils.writeLog
			(this, "go into LoginAction|"+sform.getValue("name")+"|"+sform.getValue("password"));
		return mapping.findForward("success");
	}
	
	
	
}
