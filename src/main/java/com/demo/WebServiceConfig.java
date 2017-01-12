/*package com.demo;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "TrackerService")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("TrackerServicePort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://demo.com/ws/track/v12");
		wsdl11Definition.setSchema(countriesSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema countriesSchema() {
		return new SimpleXsdSchema(new ClassPathResource("tracker.xsd"));
	}
	
    @Bean
    public Jaxb2Marshaller customerLocationClientMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.demo.fedex.domain", "com.demo.domain");
        return marshaller;
    }
    @Bean(name = "TrackerService")
    public SimpleWsdl11Definition definition1509() {
        SimpleWsdl11Definition wsdl = new SimpleWsdl11Definition();
        wsdl.setWsdl(customerServiceWsdl());
        return wsdl;
    }

    @Bean
    public Resource customerServiceWsdl() {
        return new ClassPathResource("TrackingService.wsdl");
    }
}
*/