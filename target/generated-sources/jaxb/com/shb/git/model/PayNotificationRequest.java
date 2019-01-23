//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.01.23 시간 07:14:33 PM KST 
//


package com.shb.git.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="xml"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="return_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="return_msg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sub_appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sub_mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="device_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="is_subscribe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nonce_str" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sub_is_subscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="err_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="err_code_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="openid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sub_openid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="trade_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="bank_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="total_fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="fee_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="cash_fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="cash_fee_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="settlement_total_fee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_type_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_id_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_11" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_13" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_14" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_15" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_16" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_17" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_18" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_19" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="coupon_fee_20" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="out_trade_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="attach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="time_end" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xml"
})
@XmlRootElement(name = "payNotificationRequest")
public class PayNotificationRequest {

    protected PayNotificationRequest.Xml xml;

    /**
     * xml 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PayNotificationRequest.Xml }
     *     
     */
    public PayNotificationRequest.Xml getXml() {
        return xml;
    }

    /**
     * xml 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PayNotificationRequest.Xml }
     *     
     */
    public void setXml(PayNotificationRequest.Xml value) {
        this.xml = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="return_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="return_msg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sub_appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sub_mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="device_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="is_subscribe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nonce_str" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sub_is_subscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="err_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="err_code_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="openid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sub_openid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="trade_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="bank_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="total_fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="fee_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="cash_fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="cash_fee_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="settlement_total_fee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_type_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_id_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_11" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_13" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_14" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_15" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_16" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_17" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_18" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_19" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="coupon_fee_20" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="out_trade_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="attach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="time_end" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "returnCode",
        "returnMsg",
        "appid",
        "mchId",
        "subAppid",
        "subMchId",
        "deviceInfo",
        "isSubscribe",
        "nonceStr",
        "subIsSubscribe",
        "sign",
        "resultCode",
        "errCode",
        "errCodeDes",
        "openid",
        "subOpenid",
        "tradeType",
        "bankType",
        "totalFee",
        "feeType",
        "cashFee",
        "cashFeeType",
        "settlementTotalFee",
        "couponCount",
        "couponType",
        "couponType0",
        "couponType1",
        "couponType2",
        "couponType3",
        "couponType4",
        "couponType5",
        "couponType6",
        "couponType7",
        "couponType8",
        "couponType9",
        "couponType10",
        "couponType11",
        "couponType12",
        "couponType13",
        "couponType14",
        "couponType15",
        "couponType16",
        "couponType17",
        "couponType18",
        "couponType19",
        "couponId",
        "couponId1",
        "couponId2",
        "couponId3",
        "couponId4",
        "couponId5",
        "couponId6",
        "couponId7",
        "couponId8",
        "couponId9",
        "couponId10",
        "couponId11",
        "couponId12",
        "couponId13",
        "couponId14",
        "couponId15",
        "couponId16",
        "couponId17",
        "couponId18",
        "couponId19",
        "couponId20",
        "couponFee",
        "couponFee0",
        "couponFee1",
        "couponFee2",
        "couponFee3",
        "couponFee4",
        "couponFee5",
        "couponFee6",
        "couponFee7",
        "couponFee8",
        "couponFee9",
        "couponFee10",
        "couponFee11",
        "couponFee12",
        "couponFee13",
        "couponFee14",
        "couponFee15",
        "couponFee16",
        "couponFee17",
        "couponFee18",
        "couponFee19",
        "couponFee20",
        "transactionId",
        "outTradeNo",
        "attach",
        "timeEnd"
    })
    public static class Xml {

        @XmlElement(name = "return_code", required = true)
        protected String returnCode;
        @XmlElement(name = "return_msg", required = true)
        protected String returnMsg;
        @XmlElement(required = true)
        protected String appid;
        @XmlElement(name = "mch_id", required = true)
        protected String mchId;
        @XmlElement(name = "sub_appid")
        protected String subAppid;
        @XmlElement(name = "sub_mch_id", required = true)
        protected String subMchId;
        @XmlElement(name = "device_info")
        protected String deviceInfo;
        @XmlElement(name = "is_subscribe", required = true)
        protected String isSubscribe;
        @XmlElement(name = "nonce_str", required = true)
        protected String nonceStr;
        @XmlElement(name = "sub_is_subscribe")
        protected String subIsSubscribe;
        @XmlElement(required = true)
        protected String sign;
        @XmlElement(name = "result_code", required = true)
        protected String resultCode;
        @XmlElement(name = "err_code")
        protected String errCode;
        @XmlElement(name = "err_code_des")
        protected String errCodeDes;
        @XmlElement(required = true)
        protected String openid;
        @XmlElement(name = "sub_openid")
        protected String subOpenid;
        @XmlElement(name = "trade_type", required = true)
        protected String tradeType;
        @XmlElement(name = "bank_type", required = true)
        protected String bankType;
        @XmlElement(name = "total_fee")
        protected int totalFee;
        @XmlElement(name = "fee_type")
        protected String feeType;
        @XmlElement(name = "cash_fee")
        protected int cashFee;
        @XmlElement(name = "cash_fee_type")
        protected String cashFeeType;
        @XmlElement(name = "settlement_total_fee")
        protected Integer settlementTotalFee;
        @XmlElement(name = "coupon_count")
        protected Integer couponCount;
        @XmlElement(name = "coupon_type")
        protected String couponType;
        @XmlElement(name = "coupon_type_0")
        protected String couponType0;
        @XmlElement(name = "coupon_type_1")
        protected String couponType1;
        @XmlElement(name = "coupon_type_2")
        protected String couponType2;
        @XmlElement(name = "coupon_type_3")
        protected String couponType3;
        @XmlElement(name = "coupon_type_4")
        protected String couponType4;
        @XmlElement(name = "coupon_type_5")
        protected String couponType5;
        @XmlElement(name = "coupon_type_6")
        protected String couponType6;
        @XmlElement(name = "coupon_type_7")
        protected String couponType7;
        @XmlElement(name = "coupon_type_8")
        protected String couponType8;
        @XmlElement(name = "coupon_type_9")
        protected String couponType9;
        @XmlElement(name = "coupon_type_10")
        protected String couponType10;
        @XmlElement(name = "coupon_type_11")
        protected String couponType11;
        @XmlElement(name = "coupon_type_12")
        protected String couponType12;
        @XmlElement(name = "coupon_type_13")
        protected String couponType13;
        @XmlElement(name = "coupon_type_14")
        protected String couponType14;
        @XmlElement(name = "coupon_type_15")
        protected String couponType15;
        @XmlElement(name = "coupon_type_16")
        protected String couponType16;
        @XmlElement(name = "coupon_type_17")
        protected String couponType17;
        @XmlElement(name = "coupon_type_18")
        protected String couponType18;
        @XmlElement(name = "coupon_type_19")
        protected String couponType19;
        @XmlElement(name = "coupon_id")
        protected String couponId;
        @XmlElement(name = "coupon_id_1")
        protected String couponId1;
        @XmlElement(name = "coupon_id_2")
        protected String couponId2;
        @XmlElement(name = "coupon_id_3")
        protected String couponId3;
        @XmlElement(name = "coupon_id_4")
        protected String couponId4;
        @XmlElement(name = "coupon_id_5")
        protected String couponId5;
        @XmlElement(name = "coupon_id_6")
        protected String couponId6;
        @XmlElement(name = "coupon_id_7")
        protected String couponId7;
        @XmlElement(name = "coupon_id_8")
        protected String couponId8;
        @XmlElement(name = "coupon_id_9")
        protected String couponId9;
        @XmlElement(name = "coupon_id_10")
        protected String couponId10;
        @XmlElement(name = "coupon_id_11")
        protected String couponId11;
        @XmlElement(name = "coupon_id_12")
        protected String couponId12;
        @XmlElement(name = "coupon_id_13")
        protected String couponId13;
        @XmlElement(name = "coupon_id_14")
        protected String couponId14;
        @XmlElement(name = "coupon_id_15")
        protected String couponId15;
        @XmlElement(name = "coupon_id_16")
        protected String couponId16;
        @XmlElement(name = "coupon_id_17")
        protected String couponId17;
        @XmlElement(name = "coupon_id_18")
        protected String couponId18;
        @XmlElement(name = "coupon_id_19")
        protected String couponId19;
        @XmlElement(name = "coupon_id_20")
        protected String couponId20;
        @XmlElement(name = "coupon_fee")
        protected Integer couponFee;
        @XmlElement(name = "coupon_fee_0")
        protected Integer couponFee0;
        @XmlElement(name = "coupon_fee_1")
        protected Integer couponFee1;
        @XmlElement(name = "coupon_fee_2")
        protected Integer couponFee2;
        @XmlElement(name = "coupon_fee_3")
        protected Integer couponFee3;
        @XmlElement(name = "coupon_fee_4")
        protected Integer couponFee4;
        @XmlElement(name = "coupon_fee_5")
        protected Integer couponFee5;
        @XmlElement(name = "coupon_fee_6")
        protected Integer couponFee6;
        @XmlElement(name = "coupon_fee_7")
        protected Integer couponFee7;
        @XmlElement(name = "coupon_fee_8")
        protected Integer couponFee8;
        @XmlElement(name = "coupon_fee_9")
        protected Integer couponFee9;
        @XmlElement(name = "coupon_fee_10")
        protected Integer couponFee10;
        @XmlElement(name = "coupon_fee_11")
        protected Integer couponFee11;
        @XmlElement(name = "coupon_fee_12")
        protected Integer couponFee12;
        @XmlElement(name = "coupon_fee_13")
        protected Integer couponFee13;
        @XmlElement(name = "coupon_fee_14")
        protected Integer couponFee14;
        @XmlElement(name = "coupon_fee_15")
        protected Integer couponFee15;
        @XmlElement(name = "coupon_fee_16")
        protected Integer couponFee16;
        @XmlElement(name = "coupon_fee_17")
        protected Integer couponFee17;
        @XmlElement(name = "coupon_fee_18")
        protected Integer couponFee18;
        @XmlElement(name = "coupon_fee_19")
        protected Integer couponFee19;
        @XmlElement(name = "coupon_fee_20")
        protected Integer couponFee20;
        @XmlElement(name = "transaction_id", required = true)
        protected String transactionId;
        @XmlElement(name = "out_trade_no", required = true)
        protected String outTradeNo;
        protected String attach;
        @XmlElement(name = "time_end", required = true)
        protected String timeEnd;

        /**
         * returnCode 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnCode() {
            return returnCode;
        }

        /**
         * returnCode 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnCode(String value) {
            this.returnCode = value;
        }

        /**
         * returnMsg 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnMsg() {
            return returnMsg;
        }

        /**
         * returnMsg 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnMsg(String value) {
            this.returnMsg = value;
        }

        /**
         * appid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppid() {
            return appid;
        }

        /**
         * appid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppid(String value) {
            this.appid = value;
        }

        /**
         * mchId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMchId() {
            return mchId;
        }

        /**
         * mchId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMchId(String value) {
            this.mchId = value;
        }

        /**
         * subAppid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubAppid() {
            return subAppid;
        }

        /**
         * subAppid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubAppid(String value) {
            this.subAppid = value;
        }

        /**
         * subMchId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubMchId() {
            return subMchId;
        }

        /**
         * subMchId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubMchId(String value) {
            this.subMchId = value;
        }

        /**
         * deviceInfo 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceInfo() {
            return deviceInfo;
        }

        /**
         * deviceInfo 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceInfo(String value) {
            this.deviceInfo = value;
        }

        /**
         * isSubscribe 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsSubscribe() {
            return isSubscribe;
        }

        /**
         * isSubscribe 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsSubscribe(String value) {
            this.isSubscribe = value;
        }

        /**
         * nonceStr 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonceStr() {
            return nonceStr;
        }

        /**
         * nonceStr 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonceStr(String value) {
            this.nonceStr = value;
        }

        /**
         * subIsSubscribe 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubIsSubscribe() {
            return subIsSubscribe;
        }

        /**
         * subIsSubscribe 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubIsSubscribe(String value) {
            this.subIsSubscribe = value;
        }

        /**
         * sign 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSign() {
            return sign;
        }

        /**
         * sign 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSign(String value) {
            this.sign = value;
        }

        /**
         * resultCode 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultCode() {
            return resultCode;
        }

        /**
         * resultCode 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultCode(String value) {
            this.resultCode = value;
        }

        /**
         * errCode 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrCode() {
            return errCode;
        }

        /**
         * errCode 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrCode(String value) {
            this.errCode = value;
        }

        /**
         * errCodeDes 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrCodeDes() {
            return errCodeDes;
        }

        /**
         * errCodeDes 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrCodeDes(String value) {
            this.errCodeDes = value;
        }

        /**
         * openid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenid() {
            return openid;
        }

        /**
         * openid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenid(String value) {
            this.openid = value;
        }

        /**
         * subOpenid 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubOpenid() {
            return subOpenid;
        }

        /**
         * subOpenid 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubOpenid(String value) {
            this.subOpenid = value;
        }

        /**
         * tradeType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeType() {
            return tradeType;
        }

        /**
         * tradeType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeType(String value) {
            this.tradeType = value;
        }

        /**
         * bankType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankType() {
            return bankType;
        }

        /**
         * bankType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankType(String value) {
            this.bankType = value;
        }

        /**
         * totalFee 속성의 값을 가져옵니다.
         * 
         */
        public int getTotalFee() {
            return totalFee;
        }

        /**
         * totalFee 속성의 값을 설정합니다.
         * 
         */
        public void setTotalFee(int value) {
            this.totalFee = value;
        }

        /**
         * feeType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeType() {
            return feeType;
        }

        /**
         * feeType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeType(String value) {
            this.feeType = value;
        }

        /**
         * cashFee 속성의 값을 가져옵니다.
         * 
         */
        public int getCashFee() {
            return cashFee;
        }

        /**
         * cashFee 속성의 값을 설정합니다.
         * 
         */
        public void setCashFee(int value) {
            this.cashFee = value;
        }

        /**
         * cashFeeType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCashFeeType() {
            return cashFeeType;
        }

        /**
         * cashFeeType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCashFeeType(String value) {
            this.cashFeeType = value;
        }

        /**
         * settlementTotalFee 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSettlementTotalFee() {
            return settlementTotalFee;
        }

        /**
         * settlementTotalFee 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSettlementTotalFee(Integer value) {
            this.settlementTotalFee = value;
        }

        /**
         * couponCount 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponCount() {
            return couponCount;
        }

        /**
         * couponCount 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponCount(Integer value) {
            this.couponCount = value;
        }

        /**
         * couponType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType() {
            return couponType;
        }

        /**
         * couponType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType(String value) {
            this.couponType = value;
        }

        /**
         * couponType0 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType0() {
            return couponType0;
        }

        /**
         * couponType0 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType0(String value) {
            this.couponType0 = value;
        }

        /**
         * couponType1 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType1() {
            return couponType1;
        }

        /**
         * couponType1 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType1(String value) {
            this.couponType1 = value;
        }

        /**
         * couponType2 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType2() {
            return couponType2;
        }

        /**
         * couponType2 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType2(String value) {
            this.couponType2 = value;
        }

        /**
         * couponType3 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType3() {
            return couponType3;
        }

        /**
         * couponType3 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType3(String value) {
            this.couponType3 = value;
        }

        /**
         * couponType4 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType4() {
            return couponType4;
        }

        /**
         * couponType4 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType4(String value) {
            this.couponType4 = value;
        }

        /**
         * couponType5 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType5() {
            return couponType5;
        }

        /**
         * couponType5 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType5(String value) {
            this.couponType5 = value;
        }

        /**
         * couponType6 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType6() {
            return couponType6;
        }

        /**
         * couponType6 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType6(String value) {
            this.couponType6 = value;
        }

        /**
         * couponType7 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType7() {
            return couponType7;
        }

        /**
         * couponType7 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType7(String value) {
            this.couponType7 = value;
        }

        /**
         * couponType8 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType8() {
            return couponType8;
        }

        /**
         * couponType8 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType8(String value) {
            this.couponType8 = value;
        }

        /**
         * couponType9 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType9() {
            return couponType9;
        }

        /**
         * couponType9 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType9(String value) {
            this.couponType9 = value;
        }

        /**
         * couponType10 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType10() {
            return couponType10;
        }

        /**
         * couponType10 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType10(String value) {
            this.couponType10 = value;
        }

        /**
         * couponType11 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType11() {
            return couponType11;
        }

        /**
         * couponType11 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType11(String value) {
            this.couponType11 = value;
        }

        /**
         * couponType12 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType12() {
            return couponType12;
        }

        /**
         * couponType12 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType12(String value) {
            this.couponType12 = value;
        }

        /**
         * couponType13 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType13() {
            return couponType13;
        }

        /**
         * couponType13 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType13(String value) {
            this.couponType13 = value;
        }

        /**
         * couponType14 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType14() {
            return couponType14;
        }

        /**
         * couponType14 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType14(String value) {
            this.couponType14 = value;
        }

        /**
         * couponType15 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType15() {
            return couponType15;
        }

        /**
         * couponType15 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType15(String value) {
            this.couponType15 = value;
        }

        /**
         * couponType16 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType16() {
            return couponType16;
        }

        /**
         * couponType16 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType16(String value) {
            this.couponType16 = value;
        }

        /**
         * couponType17 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType17() {
            return couponType17;
        }

        /**
         * couponType17 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType17(String value) {
            this.couponType17 = value;
        }

        /**
         * couponType18 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType18() {
            return couponType18;
        }

        /**
         * couponType18 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType18(String value) {
            this.couponType18 = value;
        }

        /**
         * couponType19 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponType19() {
            return couponType19;
        }

        /**
         * couponType19 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponType19(String value) {
            this.couponType19 = value;
        }

        /**
         * couponId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId() {
            return couponId;
        }

        /**
         * couponId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId(String value) {
            this.couponId = value;
        }

        /**
         * couponId1 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId1() {
            return couponId1;
        }

        /**
         * couponId1 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId1(String value) {
            this.couponId1 = value;
        }

        /**
         * couponId2 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId2() {
            return couponId2;
        }

        /**
         * couponId2 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId2(String value) {
            this.couponId2 = value;
        }

        /**
         * couponId3 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId3() {
            return couponId3;
        }

        /**
         * couponId3 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId3(String value) {
            this.couponId3 = value;
        }

        /**
         * couponId4 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId4() {
            return couponId4;
        }

        /**
         * couponId4 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId4(String value) {
            this.couponId4 = value;
        }

        /**
         * couponId5 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId5() {
            return couponId5;
        }

        /**
         * couponId5 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId5(String value) {
            this.couponId5 = value;
        }

        /**
         * couponId6 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId6() {
            return couponId6;
        }

        /**
         * couponId6 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId6(String value) {
            this.couponId6 = value;
        }

        /**
         * couponId7 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId7() {
            return couponId7;
        }

        /**
         * couponId7 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId7(String value) {
            this.couponId7 = value;
        }

        /**
         * couponId8 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId8() {
            return couponId8;
        }

        /**
         * couponId8 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId8(String value) {
            this.couponId8 = value;
        }

        /**
         * couponId9 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId9() {
            return couponId9;
        }

        /**
         * couponId9 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId9(String value) {
            this.couponId9 = value;
        }

        /**
         * couponId10 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId10() {
            return couponId10;
        }

        /**
         * couponId10 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId10(String value) {
            this.couponId10 = value;
        }

        /**
         * couponId11 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId11() {
            return couponId11;
        }

        /**
         * couponId11 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId11(String value) {
            this.couponId11 = value;
        }

        /**
         * couponId12 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId12() {
            return couponId12;
        }

        /**
         * couponId12 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId12(String value) {
            this.couponId12 = value;
        }

        /**
         * couponId13 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId13() {
            return couponId13;
        }

        /**
         * couponId13 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId13(String value) {
            this.couponId13 = value;
        }

        /**
         * couponId14 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId14() {
            return couponId14;
        }

        /**
         * couponId14 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId14(String value) {
            this.couponId14 = value;
        }

        /**
         * couponId15 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId15() {
            return couponId15;
        }

        /**
         * couponId15 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId15(String value) {
            this.couponId15 = value;
        }

        /**
         * couponId16 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId16() {
            return couponId16;
        }

        /**
         * couponId16 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId16(String value) {
            this.couponId16 = value;
        }

        /**
         * couponId17 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId17() {
            return couponId17;
        }

        /**
         * couponId17 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId17(String value) {
            this.couponId17 = value;
        }

        /**
         * couponId18 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId18() {
            return couponId18;
        }

        /**
         * couponId18 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId18(String value) {
            this.couponId18 = value;
        }

        /**
         * couponId19 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId19() {
            return couponId19;
        }

        /**
         * couponId19 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId19(String value) {
            this.couponId19 = value;
        }

        /**
         * couponId20 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponId20() {
            return couponId20;
        }

        /**
         * couponId20 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponId20(String value) {
            this.couponId20 = value;
        }

        /**
         * couponFee 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee() {
            return couponFee;
        }

        /**
         * couponFee 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee(Integer value) {
            this.couponFee = value;
        }

        /**
         * couponFee0 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee0() {
            return couponFee0;
        }

        /**
         * couponFee0 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee0(Integer value) {
            this.couponFee0 = value;
        }

        /**
         * couponFee1 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee1() {
            return couponFee1;
        }

        /**
         * couponFee1 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee1(Integer value) {
            this.couponFee1 = value;
        }

        /**
         * couponFee2 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee2() {
            return couponFee2;
        }

        /**
         * couponFee2 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee2(Integer value) {
            this.couponFee2 = value;
        }

        /**
         * couponFee3 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee3() {
            return couponFee3;
        }

        /**
         * couponFee3 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee3(Integer value) {
            this.couponFee3 = value;
        }

        /**
         * couponFee4 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee4() {
            return couponFee4;
        }

        /**
         * couponFee4 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee4(Integer value) {
            this.couponFee4 = value;
        }

        /**
         * couponFee5 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee5() {
            return couponFee5;
        }

        /**
         * couponFee5 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee5(Integer value) {
            this.couponFee5 = value;
        }

        /**
         * couponFee6 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee6() {
            return couponFee6;
        }

        /**
         * couponFee6 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee6(Integer value) {
            this.couponFee6 = value;
        }

        /**
         * couponFee7 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee7() {
            return couponFee7;
        }

        /**
         * couponFee7 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee7(Integer value) {
            this.couponFee7 = value;
        }

        /**
         * couponFee8 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee8() {
            return couponFee8;
        }

        /**
         * couponFee8 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee8(Integer value) {
            this.couponFee8 = value;
        }

        /**
         * couponFee9 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee9() {
            return couponFee9;
        }

        /**
         * couponFee9 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee9(Integer value) {
            this.couponFee9 = value;
        }

        /**
         * couponFee10 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee10() {
            return couponFee10;
        }

        /**
         * couponFee10 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee10(Integer value) {
            this.couponFee10 = value;
        }

        /**
         * couponFee11 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee11() {
            return couponFee11;
        }

        /**
         * couponFee11 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee11(Integer value) {
            this.couponFee11 = value;
        }

        /**
         * couponFee12 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee12() {
            return couponFee12;
        }

        /**
         * couponFee12 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee12(Integer value) {
            this.couponFee12 = value;
        }

        /**
         * couponFee13 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee13() {
            return couponFee13;
        }

        /**
         * couponFee13 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee13(Integer value) {
            this.couponFee13 = value;
        }

        /**
         * couponFee14 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee14() {
            return couponFee14;
        }

        /**
         * couponFee14 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee14(Integer value) {
            this.couponFee14 = value;
        }

        /**
         * couponFee15 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee15() {
            return couponFee15;
        }

        /**
         * couponFee15 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee15(Integer value) {
            this.couponFee15 = value;
        }

        /**
         * couponFee16 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee16() {
            return couponFee16;
        }

        /**
         * couponFee16 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee16(Integer value) {
            this.couponFee16 = value;
        }

        /**
         * couponFee17 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee17() {
            return couponFee17;
        }

        /**
         * couponFee17 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee17(Integer value) {
            this.couponFee17 = value;
        }

        /**
         * couponFee18 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee18() {
            return couponFee18;
        }

        /**
         * couponFee18 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee18(Integer value) {
            this.couponFee18 = value;
        }

        /**
         * couponFee19 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee19() {
            return couponFee19;
        }

        /**
         * couponFee19 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee19(Integer value) {
            this.couponFee19 = value;
        }

        /**
         * couponFee20 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponFee20() {
            return couponFee20;
        }

        /**
         * couponFee20 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponFee20(Integer value) {
            this.couponFee20 = value;
        }

        /**
         * transactionId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionId() {
            return transactionId;
        }

        /**
         * transactionId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionId(String value) {
            this.transactionId = value;
        }

        /**
         * outTradeNo 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutTradeNo() {
            return outTradeNo;
        }

        /**
         * outTradeNo 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutTradeNo(String value) {
            this.outTradeNo = value;
        }

        /**
         * attach 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttach() {
            return attach;
        }

        /**
         * attach 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttach(String value) {
            this.attach = value;
        }

        /**
         * timeEnd 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeEnd() {
            return timeEnd;
        }

        /**
         * timeEnd 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeEnd(String value) {
            this.timeEnd = value;
        }

    }

}
