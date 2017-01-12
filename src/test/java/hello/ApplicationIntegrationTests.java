/*
package hello;


import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.demo.domain.WriteEventLogRequest;
import com.demo.fedex.domain.Address;
import com.demo.fedex.domain.CarrierCodeType;
import com.demo.fedex.domain.ClientDetail;
import com.demo.fedex.domain.Localization;
import com.demo.fedex.domain.PagingDetail;
import com.demo.fedex.domain.TrackIdentifierType;
import com.demo.fedex.domain.TrackPackageIdentifier;
import com.demo.fedex.domain.TrackRequest;
import com.demo.fedex.domain.TrackSelectionDetail;
import com.demo.fedex.domain.TransactionDetail;
import com.demo.fedex.domain.VersionId;
import com.demo.fedex.domain.WebAuthenticationCredential;
import com.demo.fedex.domain.WebAuthenticationDetail;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApplicationIntegrationTests {

	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

	@LocalServerPort
	private int port = 0;

	@Before
	public void init() throws Exception {
		marshaller.setPackagesToScan(ClassUtils.getPackageName(WriteEventLogRequest.class));
		marshaller.afterPropertiesSet();
	}

	@Test
	public void testSendAndReceive() {

		TrackRequest request = new TrackRequest();
		WebAuthenticationDetail authenticationDetail = new WebAuthenticationDetail();
		WebAuthenticationCredential authenticationCredential = new WebAuthenticationCredential();
		authenticationCredential.setKey("v666RJqeaJPZnqQb");
		authenticationCredential.setPassword("bYtyAOZVyCB8BSx28bswXCgSD");
		authenticationDetail.setUserCredential(authenticationCredential);
		request.setWebAuthenticationDetail(authenticationDetail);
		ClientDetail clientdetail = new ClientDetail();
		clientdetail.setAccountNumber("510087828");
		clientdetail.setMeterNumber("118775751");
		clientdetail.setIntegratorId("123");
		Localization localization = new Localization();
		localization.setLanguageCode("EN");
		localization.setLocaleCode("US");
		clientdetail.setLocalization(localization);
		request.setClientDetail(clientdetail);
		TransactionDetail transactionDetail = new TransactionDetail();
		transactionDetail.setLocalization(localization);
		transactionDetail.setCustomerTransactionId("TEST");
		request.setTransactionDetail(transactionDetail);
		VersionId versionId = new VersionId();
		versionId.setIntermediate(0);
		versionId.setMajor(12);
		versionId.setMinor(0);
		versionId.setServiceId("trck");
		request.setVersion(versionId);
		TrackSelectionDetail trackSelectionDetail = new TrackSelectionDetail();
		trackSelectionDetail.setCarrierCode(CarrierCodeType.FDXE);
		TrackPackageIdentifier trackPackageIdentifier = new TrackPackageIdentifier();
		trackPackageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);
		trackPackageIdentifier.setValue("111111111111");
		trackSelectionDetail.setTrackingNumberUniqueIdentifier("111111111111");
		trackSelectionDetail.setPackageIdentifier(trackPackageIdentifier);
		trackSelectionDetail.setShipmentAccountNumber("510087020");
		trackSelectionDetail.setSecureSpodAccount("510051408");
		Address address = new Address();
		address.getStreetLines().add("1202 Chalet Ln");
		address.setCity("Harrison");
		address.setStateOrProvinceCode("AR");
		address.setPostalCode("72601");
		address.setCountryCode("US");
		trackSelectionDetail.setDestination(address);
		PagingDetail pagingDetail = new PagingDetail();
		pagingDetail.setNumberOfResultsPerPage(new BigInteger("100"));
		pagingDetail.setPagingToken("100");
		trackSelectionDetail.setPagingDetail(pagingDetail);
		request.getSelectionDetails().add(trackSelectionDetail);
		WebServiceTemplate ws = new WebServiceTemplate(marshaller);

		assertThat(ws.marshalSendAndReceive("https://wsbeta.fedex.com:443/web-services/track", request)).isNotNull();
	}
}*/