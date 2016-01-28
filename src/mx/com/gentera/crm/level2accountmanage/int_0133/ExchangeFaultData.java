/**
 * ExchangeFaultData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package mx.com.gentera.crm.level2accountmanage.int_0133;

public class ExchangeFaultData extends java.lang.Exception {
    private static final long serialVersionUID = 1453914498572L;
    private com.compartamos.global.ExchangeFaultData faultMessage;

    public ExchangeFaultData() {
        super("ExchangeFaultData");
    }

    public ExchangeFaultData(java.lang.String s) {
        super(s);
    }

    public ExchangeFaultData(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public ExchangeFaultData(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(com.compartamos.global.ExchangeFaultData msg) {
        faultMessage = msg;
    }

    public com.compartamos.global.ExchangeFaultData getFaultMessage() {
        return faultMessage;
    }
}
