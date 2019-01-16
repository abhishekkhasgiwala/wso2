package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class HelloMediator extends AbstractMediator {

	Log log = LogFactory.getLog(HelloMediator.class);

	public boolean mediate(MessageContext context) {
		String city = (String) context.getProperty("uri.var.city");
		log.info("=======City " + city);
		context.setProperty("CITY", city.toUpperCase());
		return true;
	}
}
