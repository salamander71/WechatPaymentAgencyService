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
 *                   &lt;element name="return_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sub_appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sub_mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="device_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nonce_str" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="err_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="err_code_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="trade_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="prepay_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="code_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "unifiedOrderAPIResponse")
public class UnifiedOrderAPIResponse {

    protected UnifiedOrderAPIResponse.Xml xml;

    /**
     * xml 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedOrderAPIResponse.Xml }
     *     
     */
    public UnifiedOrderAPIResponse.Xml getXml() {
        return xml;
    }

    /**
     * xml 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedOrderAPIResponse.Xml }
     *     
     */
    public void setXml(UnifiedOrderAPIResponse.Xml value) {
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
     *         &lt;element name="return_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sub_appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sub_mch_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="device_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="nonce_str" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="err_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="err_code_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="trade_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="prepay_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="code_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "nonceStr",
        "sign",
        "resultCode",
        "errCode",
        "errCodeDes",
        "tradeType",
        "prepayId",
        "codeUrl"
    })
    public static class Xml {

        @XmlElement(name = "return_code", required = true)
        protected String returnCode;
        @XmlElement(name = "return_msg")
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
        @XmlElement(name = "nonce_str", required = true)
        protected String nonceStr;
        @XmlElement(required = true)
        protected String sign;
        @XmlElement(name = "result_code", required = true)
        protected String resultCode;
        @XmlElement(name = "err_code")
        protected String errCode;
        @XmlElement(name = "err_code_des")
        protected String errCodeDes;
        @XmlElement(name = "trade_type", required = true)
        protected String tradeType;
        @XmlElement(name = "prepay_id", required = true)
        protected String prepayId;
        @XmlElement(name = "code_url")
        protected String codeUrl;

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
         * prepayId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrepayId() {
            return prepayId;
        }

        /**
         * prepayId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrepayId(String value) {
            this.prepayId = value;
        }

        /**
         * codeUrl 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeUrl() {
            return codeUrl;
        }

        /**
         * codeUrl 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeUrl(String value) {
            this.codeUrl = value;
        }

    }

}
