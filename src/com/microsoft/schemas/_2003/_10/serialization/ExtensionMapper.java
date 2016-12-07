/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.microsoft.schemas._2003._10.serialization;


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
        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) &&
                "ArrayOfExecuteResultQuery".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ArrayOfExecuteResultQuery.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "Item".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.Item.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "References".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.References.Factory.parse(reader);
        }

        if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(
                    namespaceURI) && "char".equals(typeName)) {
            return com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "Log".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.Log.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ExecuteValidate".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteValidate.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ExecuteResultQuery".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteResultQuery.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) &&
                "ReferenceMovimientosData".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ReferenceMovimientosData.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ExecuteQuery".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteQuery.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "Execute".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.Execute.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ContactPerson".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ContactPerson.Factory.parse(reader);
        }

        if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(
                    namespaceURI) && "guid".equals(typeName)) {
            return com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
        }

        if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(
                    namespaceURI) && "duration".equals(typeName)) {
            return com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) &&
                "ArrayOfReferenceAttributeData".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ArrayOfReferenceAttributeData.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ReferenceData".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ReferenceData.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ReferenceAttributeData".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ReferenceAttributeData.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ExecuteIncrease".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteIncrease.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ExecuteResult".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteResult.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) && "ArrayOfContactPerson".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ArrayOfContactPerson.Factory.parse(reader);
        }

        if ("http://schemas.datacontract.org/2004/07/WCFReferenceManager".equals(
                    namespaceURI) &&
                "ArrayOfReferenceMovimientosData".equals(typeName)) {
            return org.datacontract.schemas._2004._07.wcfreferencemanager.ArrayOfReferenceMovimientosData.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
