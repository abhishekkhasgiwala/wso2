# WSO2
Sample project to illustrate simple rest api using WSO2 Integator

Rest Url : (GET)
http://localhost:8280/hello/weather/{reading}

	Used :
		Class Mediator
		Sequence
		Log Mediator
		Property Mediator

Created Sample Proxy Service
	Consumer call proxy service which inter call backend Soap webservice (Mocked)
  
  Counsumer Url:
	http://localhost:8280/services/SimpleQuoteProxy.SimpleQuoteProxyHttpSoap11Endpoint
  
  Soap Mocked url:
    http://localhost:8080/axis2/services/SimpleStockQuoteService.SimpleStockQuoteServiceHttpSoap11Endpoint/

	