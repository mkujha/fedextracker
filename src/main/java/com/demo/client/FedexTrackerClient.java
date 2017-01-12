
package com.demo.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.demo.fedex.domain.CompletedTrackDetail;
import com.demo.fedex.domain.TrackReply;
import com.demo.fedex.domain.TrackRequest;


@Component
public class FedexTrackerClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(FedexTrackerClient.class);

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	public TrackReply trackFedEx(TrackRequest request) {
		TrackReply response =null;
		WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);
		try{
			response =  (TrackReply)webServiceTemplate 
				.marshalSendAndReceive("https://wsbeta.fedex.com:443/web-services/track", request);
		}catch (Exception e) {
			 e.printStackTrace();
		}
		return response;
	}

	public void printResponse(TrackReply response) {

		List<CompletedTrackDetail> forecastReturn = response.getCompletedTrackDetails();

		if (!forecastReturn.isEmpty()) {
			log.info("Result size " + forecastReturn.size());
			for (CompletedTrackDetail forecast : forecastReturn) {
				log.info("Result :  " + forecast.toString());
			}
		} else {
			log.info("No Response received");
		}
	}

}
