package com.dean.web.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Lucifer
 * @version create time：Jul 7, 2014 9:51:37 AM
 */
public class StrUtils 
{
	private static final Logger log = LoggerFactory.getLogger(StrUtils.class);
	
	public static void writeLog(Object obj,String msg)
	{
		if(log.isInfoEnabled())
		{
			log.info(obj.getClass().getName()+":"+msg);
		}else if(log.isDebugEnabled())
		{
			log.debug(obj.getClass().getName()+":"+msg);
		}else if(log.isErrorEnabled())
		{
			log.error(obj.getClass().getName()+":"+msg);
		}
	}
}
