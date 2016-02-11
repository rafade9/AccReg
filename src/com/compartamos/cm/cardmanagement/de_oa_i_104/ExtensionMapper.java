/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.cm.cardmanagement.de_oa_i_104;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://compartamos.com/CM/CardManagement/DE-OA-I-104".equals(
                    namespaceURI) && "CardNumbers".equals(typeName)) {
            return com.compartamos.cm.cardmanagement.de_oa_i_104.CardNumbers.Factory.parse(reader);
        }

        if ("http://compartamos.com/CM/CardManagement/DE-OA-I-104".equals(
                    namespaceURI) && "ArrayOfCardNumbers".equals(typeName)) {
            return com.compartamos.cm.cardmanagement.de_oa_i_104.ArrayOfCardNumbers.Factory.parse(reader);
        }

        if ("http://compartamos.com/CM/CardManagement/DE-OA-I-104".equals(
                    namespaceURI) && "wsSalida".equals(typeName)) {
            return com.compartamos.cm.cardmanagement.de_oa_i_104.WsSalida.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
