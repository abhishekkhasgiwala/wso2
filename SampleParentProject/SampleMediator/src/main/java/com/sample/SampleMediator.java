package com.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class SampleMediator extends AbstractMediator {

	Log log = LogFactory.getLog(SampleMediator.class);

	public boolean mediate(MessageContext context) {
		String city = (String) context.getProperty("uri.var.city");
		log.info("=======City " + city);
		context.setProperty("CITY", city.toUpperCase());
		return true;
	}
}
