
package hello;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.demo.Application;
import com.demo.domain.WriteEventLog;
import com.demo.domain.WriteEventLogRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes=Application.class)
public class ApplicationIntegrationTests2 {

	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

	//@LocalServerPort
//	private int port = 0;

	@Before
	public void init() throws Exception {
		marshaller.setPackagesToScan(ClassUtils.getPackageName(WriteEventLogRequest.class));
		marshaller.afterPropertiesSet();
	}

	@Test
	public void testSendAndReceive() {

		WriteEventLog eventLog = new WriteEventLog();
		WriteEventLogRequest eventLogRequest = new WriteEventLogRequest();
		eventLog.setRequest(eventLogRequest);
		WebServiceTemplate ws = new WebServiceTemplate(marshaller);
		  assertThat(ws.marshalSendAndReceive("http://localhost:8080/ws/TrackingService", eventLog)).isNotNull();
	}
}