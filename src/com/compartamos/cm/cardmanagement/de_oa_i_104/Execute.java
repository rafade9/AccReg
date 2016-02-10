/**
 * Execute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.cm.cardmanagement.de_oa_i_104;


/**
 *  Execute bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Execute implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://compartamos.com/CM/CardManagement/DE-OA-I-104",
            "Execute", "ns1");

    /**
     * field for BankBP
     */
    protected java.lang.String localBankBP;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBankBPTracker = false;

    /**
     * field for CardStatus
     */
    protected java.lang.String localCardStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCardStatusTracker = false;

    /**
     * field for ExternalUser
     */
    protected java.lang.String localExternalUser;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternalUserTracker = false;

    /**
     * field for CMSUserId
     */
    protected java.lang.String localCMSUserId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCMSUserIdTracker = false;

    /**
     * field for AditionalData
     */
    protected java.lang.String localAditionalData;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAditionalDataTracker = false;

    public boolean isBankBPSpecified() {
        return localBankBPTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBankBP() {
        return localBankBP;
    }

    /**
     * Auto generated setter method
     * @param param BankBP
     */
    public void setBankBP(java.lang.String param) {
        localBankBPTracker = param != null;

        this.localBankBP = param;
    }

    public boolean isCardStatusSpecified() {
        return localCardStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCardStatus() {
        return localCardStatus;
    }

    /**
     * Auto generated setter method
     * @param param CardStatus
     */
    public void setCardStatus(java.lang.String param) {
        localCardStatusTracker = param != null;

        this.localCardStatus = param;
    }

    public boolean isExternalUserSpecified() {
        return localExternalUserTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getExternalUser() {
        return localExternalUser;
    }

    /**
     * Auto generated setter method
     * @param param ExternalUser
     */
    public void setExternalUser(java.lang.String param) {
        localExternalUserTracker = param != null;

        this.localExternalUser = param;
    }

    public boolean isCMSUserIdSpecified() {
        return localCMSUserIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCMSUserId() {
        return localCMSUserId;
    }

    /**
     * Auto generated setter method
     * @param param CMSUserId
     */
    public void setCMSUserId(java.lang.String param) {
        localCMSUserIdTracker = param != null;

        this.localCMSUserId = param;
    }

    public boolean isAditionalDataSpecified() {
        return localAditionalDataTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAditionalData() {
        return localAditionalData;
    }

    /**
     * Auto generated setter method
     * @param param AditionalData
     */
    public void setAditionalData(java.lang.String param) {
        localAditionalDataTracker = param != null;

        this.localAditionalData = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                MY_QNAME);

        return factory.createOMElement(dataSource, MY_QNAME);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Execute", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Execute", xmlWriter);
            }
        }

        if (localBankBPTracker) {
            namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
            writeStartElement(null, namespace, "BankBP", xmlWriter);

            if (localBankBP == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "BankBP cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBankBP);
            }

            xmlWriter.writeEndElement();
        }

        if (localCardStatusTracker) {
            namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
            writeStartElement(null, namespace, "CardStatus", xmlWriter);

            if (localCardStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "CardStatus cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCardStatus);
            }

            xmlWriter.writeEndElement();
        }

        if (localExternalUserTracker) {
            namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
            writeStartElement(null, namespace, "ExternalUser", xmlWriter);

            if (localExternalUser == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ExternalUser cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localExternalUser);
            }

            xmlWriter.writeEndElement();
        }

        if (localCMSUserIdTracker) {
            namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
            writeStartElement(null, namespace, "CMSUserId", xmlWriter);

            if (localCMSUserId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "CMSUserId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCMSUserId);
            }

            xmlWriter.writeEndElement();
        }

        if (localAditionalDataTracker) {
            namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
            writeStartElement(null, namespace, "AditionalData", xmlWriter);

            if (localAditionalData == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "AditionalData cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAditionalData);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(
        javax.xml.namespace.QName qName)
        throws org.apache.axis2.databinding.ADBException {
        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localBankBPTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "BankBP"));

            if (localBankBP != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localBankBP));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "BankBP cannot be null!!");
            }
        }

        if (localCardStatusTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "CardStatus"));

            if (localCardStatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCardStatus));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "CardStatus cannot be null!!");
            }
        }

        if (localExternalUserTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "ExternalUser"));

            if (localExternalUser != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localExternalUser));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "ExternalUser cannot be null!!");
            }
        }

        if (localCMSUserIdTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "CMSUserId"));

            if (localCMSUserId != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCMSUserId));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "CMSUserId cannot be null!!");
            }
        }

        if (localAditionalDataTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "AditionalData"));

            if (localAditionalData != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAditionalData));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "AditionalData cannot be null!!");
            }
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
            elementList.toArray(), attribList.toArray());
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Execute parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Execute object = new Execute();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"Execute".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Execute) com.compartamos.cm.cardmanagement.de_oa_i_104.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                            "BankBP").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "BankBP" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBankBP(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                            "CardStatus").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CardStatus" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCardStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                            "ExternalUser").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ExternalUser" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExternalUser(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                            "CMSUserId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CMSUserId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCMSUserId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                            "AditionalData").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "AditionalData" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAditionalData(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
