//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.01.23 시간 07:14:33 PM KST 
//


package com.shb.git.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.shb.git.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.shb.git.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayNotificationRequest }
     * 
     */
    public PayNotificationRequest createPayNotificationRequest() {
        return new PayNotificationRequest();
    }

    /**
     * Create an instance of {@link PayNotificationResponse }
     * 
     */
    public PayNotificationResponse createPayNotificationResponse() {
        return new PayNotificationResponse();
    }

    /**
     * Create an instance of {@link PrepayIdRequest }
     * 
     */
    public PrepayIdRequest createPrepayIdRequest() {
        return new PrepayIdRequest();
    }

    /**
     * Create an instance of {@link PrepayIdResponse }
     * 
     */
    public PrepayIdResponse createPrepayIdResponse() {
        return new PrepayIdResponse();
    }

    /**
     * Create an instance of {@link UnifiedOrderAPIRequest }
     * 
     */
    public UnifiedOrderAPIRequest createUnifiedOrderAPIRequest() {
        return new UnifiedOrderAPIRequest();
    }

    /**
     * Create an instance of {@link UnifiedOrderAPIResponse }
     * 
     */
    public UnifiedOrderAPIResponse createUnifiedOrderAPIResponse() {
        return new UnifiedOrderAPIResponse();
    }

    /**
     * Create an instance of {@link PayNotificationRequest.Xml }
     * 
     */
    public PayNotificationRequest.Xml createPayNotificationRequestXml() {
        return new PayNotificationRequest.Xml();
    }

    /**
     * Create an instance of {@link PayNotificationResponse.Xml }
     * 
     */
    public PayNotificationResponse.Xml createPayNotificationResponseXml() {
        return new PayNotificationResponse.Xml();
    }

    /**
     * Create an instance of {@link PrepayIdRequest.Xml }
     * 
     */
    public PrepayIdRequest.Xml createPrepayIdRequestXml() {
        return new PrepayIdRequest.Xml();
    }

    /**
     * Create an instance of {@link PrepayIdResponse.Xml }
     * 
     */
    public PrepayIdResponse.Xml createPrepayIdResponseXml() {
        return new PrepayIdResponse.Xml();
    }

    /**
     * Create an instance of {@link UnifiedOrderAPIRequest.Xml }
     * 
     */
    public UnifiedOrderAPIRequest.Xml createUnifiedOrderAPIRequestXml() {
        return new UnifiedOrderAPIRequest.Xml();
    }

    /**
     * Create an instance of {@link UnifiedOrderAPIResponse.Xml }
     * 
     */
    public UnifiedOrderAPIResponse.Xml createUnifiedOrderAPIResponseXml() {
        return new UnifiedOrderAPIResponse.Xml();
    }

}
