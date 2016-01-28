/**
 * BusinessDocumentMessageHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.common.gdt;


/**
 *  BusinessDocumentMessageHeader bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class BusinessDocumentMessageHeader implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = BusinessDocumentMessageHeader
       Namespace URI = http://compartamos.com/common/gdt
       Namespace Prefix = ns1
     */

    /**
     * field for ID
     */
    protected com.compartamos.common.gdt.BusinessDocumentMessageID localID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIDTracker = false;

    /**
     * field for UUID
     */
    protected com.compartamos.common.gdt.UUID localUUID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUUIDTracker = false;

    /**
     * field for ReferenceID
     */
    protected com.compartamos.common.gdt.BusinessDocumentMessageID localReferenceID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenceIDTracker = false;

    /**
     * field for ReferenceUUID
     */
    protected com.compartamos.common.gdt.UUID localReferenceUUID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenceUUIDTracker = false;

    /**
     * field for CreationDateTime
     */
    protected com.compartamos.common.gdt.GLOBAL_DateTime localCreationDateTime;

    /**
     * field for TestDataIndicator
     */
    protected com.compartamos.common.gdt.Indicator localTestDataIndicator;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTestDataIndicatorTracker = false;

    /**
     * field for SenderBusinessSystemID
     */
    protected com.compartamos.common.gdt.BusinessSystemID localSenderBusinessSystemID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSenderBusinessSystemIDTracker = false;

    /**
     * field for RecipientBusinessSystemID
     */
    protected com.compartamos.common.gdt.BusinessSystemID localRecipientBusinessSystemID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecipientBusinessSystemIDTracker = false;

    /**
     * field for SenderParty
     */
    protected com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty localSenderParty;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSenderPartyTracker = false;

    /**
     * field for RecipientParty
     */
    protected com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty localRecipientParty;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecipientPartyTracker = false;

    public boolean isIDSpecified() {
        return localIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.BusinessDocumentMessageID
     */
    public com.compartamos.common.gdt.BusinessDocumentMessageID getID() {
        return localID;
    }

    /**
     * Auto generated setter method
     * @param param ID
     */
    public void setID(
        com.compartamos.common.gdt.BusinessDocumentMessageID param) {
        localIDTracker = param != null;

        this.localID = param;
    }

    public boolean isUUIDSpecified() {
        return localUUIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.UUID
     */
    public com.compartamos.common.gdt.UUID getUUID() {
        return localUUID;
    }

    /**
     * Auto generated setter method
     * @param param UUID
     */
    public void setUUID(com.compartamos.common.gdt.UUID param) {
        localUUIDTracker = param != null;

        this.localUUID = param;
    }

    public boolean isReferenceIDSpecified() {
        return localReferenceIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.BusinessDocumentMessageID
     */
    public com.compartamos.common.gdt.BusinessDocumentMessageID getReferenceID() {
        return localReferenceID;
    }

    /**
     * Auto generated setter method
     * @param param ReferenceID
     */
    public void setReferenceID(
        com.compartamos.common.gdt.BusinessDocumentMessageID param) {
        localReferenceIDTracker = param != null;

        this.localReferenceID = param;
    }

    public boolean isReferenceUUIDSpecified() {
        return localReferenceUUIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.UUID
     */
    public com.compartamos.common.gdt.UUID getReferenceUUID() {
        return localReferenceUUID;
    }

    /**
     * Auto generated setter method
     * @param param ReferenceUUID
     */
    public void setReferenceUUID(com.compartamos.common.gdt.UUID param) {
        localReferenceUUIDTracker = param != null;

        this.localReferenceUUID = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.GLOBAL_DateTime
     */
    public com.compartamos.common.gdt.GLOBAL_DateTime getCreationDateTime() {
        return localCreationDateTime;
    }

    /**
     * Auto generated setter method
     * @param param CreationDateTime
     */
    public void setCreationDateTime(
        com.compartamos.common.gdt.GLOBAL_DateTime param) {
        this.localCreationDateTime = param;
    }

    public boolean isTestDataIndicatorSpecified() {
        return localTestDataIndicatorTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.Indicator
     */
    public com.compartamos.common.gdt.Indicator getTestDataIndicator() {
        return localTestDataIndicator;
    }

    /**
     * Auto generated setter method
     * @param param TestDataIndicator
     */
    public void setTestDataIndicator(com.compartamos.common.gdt.Indicator param) {
        localTestDataIndicatorTracker = param != null;

        this.localTestDataIndicator = param;
    }

    public boolean isSenderBusinessSystemIDSpecified() {
        return localSenderBusinessSystemIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.BusinessSystemID
     */
    public com.compartamos.common.gdt.BusinessSystemID getSenderBusinessSystemID() {
        return localSenderBusinessSystemID;
    }

    /**
     * Auto generated setter method
     * @param param SenderBusinessSystemID
     */
    public void setSenderBusinessSystemID(
        com.compartamos.common.gdt.BusinessSystemID param) {
        localSenderBusinessSystemIDTracker = param != null;

        this.localSenderBusinessSystemID = param;
    }

    public boolean isRecipientBusinessSystemIDSpecified() {
        return localRecipientBusinessSystemIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.BusinessSystemID
     */
    public com.compartamos.common.gdt.BusinessSystemID getRecipientBusinessSystemID() {
        return localRecipientBusinessSystemID;
    }

    /**
     * Auto generated setter method
     * @param param RecipientBusinessSystemID
     */
    public void setRecipientBusinessSystemID(
        com.compartamos.common.gdt.BusinessSystemID param) {
        localRecipientBusinessSystemIDTracker = param != null;

        this.localRecipientBusinessSystemID = param;
    }

    public boolean isSenderPartySpecified() {
        return localSenderPartyTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty
     */
    public com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty getSenderParty() {
        return localSenderParty;
    }

    /**
     * Auto generated setter method
     * @param param SenderParty
     */
    public void setSenderParty(
        com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty param) {
        localSenderPartyTracker = param != null;

        this.localSenderParty = param;
    }

    public boolean isRecipientPartySpecified() {
        return localRecipientPartyTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty
     */
    public com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty getRecipientParty() {
        return localRecipientParty;
    }

    /**
     * Auto generated setter method
     * @param param RecipientParty
     */
    public void setRecipientParty(
        com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty param) {
        localRecipientPartyTracker = param != null;

        this.localRecipientParty = param;
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
                parentQName);

        return factory.createOMElement(dataSource, parentQName);
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
                    "http://compartamos.com/common/gdt");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":BusinessDocumentMessageHeader",
                    xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "BusinessDocumentMessageHeader", xmlWriter);
            }
        }

        if (localIDTracker) {
            if (localID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ID cannot be null!!");
            }

            localID.serialize(new javax.xml.namespace.QName("", "ID"), xmlWriter);
        }

        if (localUUIDTracker) {
            if (localUUID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "UUID cannot be null!!");
            }

            localUUID.serialize(new javax.xml.namespace.QName("", "UUID"),
                xmlWriter);
        }

        if (localReferenceIDTracker) {
            if (localReferenceID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceID cannot be null!!");
            }

            localReferenceID.serialize(new javax.xml.namespace.QName("",
                    "ReferenceID"), xmlWriter);
        }

        if (localReferenceUUIDTracker) {
            if (localReferenceUUID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceUUID cannot be null!!");
            }

            localReferenceUUID.serialize(new javax.xml.namespace.QName("",
                    "ReferenceUUID"), xmlWriter);
        }

        if (localCreationDateTime == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CreationDateTime cannot be null!!");
        }

        localCreationDateTime.serialize(new javax.xml.namespace.QName("",
                "CreationDateTime"), xmlWriter);

        if (localTestDataIndicatorTracker) {
            if (localTestDataIndicator == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TestDataIndicator cannot be null!!");
            }

            localTestDataIndicator.serialize(new javax.xml.namespace.QName("",
                    "TestDataIndicator"), xmlWriter);
        }

        if (localSenderBusinessSystemIDTracker) {
            if (localSenderBusinessSystemID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SenderBusinessSystemID cannot be null!!");
            }

            localSenderBusinessSystemID.serialize(new javax.xml.namespace.QName(
                    "", "SenderBusinessSystemID"), xmlWriter);
        }

        if (localRecipientBusinessSystemIDTracker) {
            if (localRecipientBusinessSystemID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RecipientBusinessSystemID cannot be null!!");
            }

            localRecipientBusinessSystemID.serialize(new javax.xml.namespace.QName(
                    "", "RecipientBusinessSystemID"), xmlWriter);
        }

        if (localSenderPartyTracker) {
            if (localSenderParty == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SenderParty cannot be null!!");
            }

            localSenderParty.serialize(new javax.xml.namespace.QName("",
                    "SenderParty"), xmlWriter);
        }

        if (localRecipientPartyTracker) {
            if (localRecipientParty == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RecipientParty cannot be null!!");
            }

            localRecipientParty.serialize(new javax.xml.namespace.QName("",
                    "RecipientParty"), xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://compartamos.com/common/gdt")) {
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

        if (localIDTracker) {
            elementList.add(new javax.xml.namespace.QName("", "ID"));

            if (localID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ID cannot be null!!");
            }

            elementList.add(localID);
        }

        if (localUUIDTracker) {
            elementList.add(new javax.xml.namespace.QName("", "UUID"));

            if (localUUID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "UUID cannot be null!!");
            }

            elementList.add(localUUID);
        }

        if (localReferenceIDTracker) {
            elementList.add(new javax.xml.namespace.QName("", "ReferenceID"));

            if (localReferenceID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceID cannot be null!!");
            }

            elementList.add(localReferenceID);
        }

        if (localReferenceUUIDTracker) {
            elementList.add(new javax.xml.namespace.QName("", "ReferenceUUID"));

            if (localReferenceUUID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceUUID cannot be null!!");
            }

            elementList.add(localReferenceUUID);
        }

        elementList.add(new javax.xml.namespace.QName("", "CreationDateTime"));

        if (localCreationDateTime == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CreationDateTime cannot be null!!");
        }

        elementList.add(localCreationDateTime);

        if (localTestDataIndicatorTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "TestDataIndicator"));

            if (localTestDataIndicator == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TestDataIndicator cannot be null!!");
            }

            elementList.add(localTestDataIndicator);
        }

        if (localSenderBusinessSystemIDTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "SenderBusinessSystemID"));

            if (localSenderBusinessSystemID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SenderBusinessSystemID cannot be null!!");
            }

            elementList.add(localSenderBusinessSystemID);
        }

        if (localRecipientBusinessSystemIDTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "RecipientBusinessSystemID"));

            if (localRecipientBusinessSystemID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RecipientBusinessSystemID cannot be null!!");
            }

            elementList.add(localRecipientBusinessSystemID);
        }

        if (localSenderPartyTracker) {
            elementList.add(new javax.xml.namespace.QName("", "SenderParty"));

            if (localSenderParty == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SenderParty cannot be null!!");
            }

            elementList.add(localSenderParty);
        }

        if (localRecipientPartyTracker) {
            elementList.add(new javax.xml.namespace.QName("", "RecipientParty"));

            if (localRecipientParty == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RecipientParty cannot be null!!");
            }

            elementList.add(localRecipientParty);
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
        public static BusinessDocumentMessageHeader parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            BusinessDocumentMessageHeader object = new BusinessDocumentMessageHeader();

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

                        if (!"BusinessDocumentMessageHeader".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (BusinessDocumentMessageHeader) com.compartamos.global.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "ID").equals(
                            reader.getName())) {
                    object.setID(com.compartamos.common.gdt.BusinessDocumentMessageID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "UUID").equals(
                            reader.getName())) {
                    object.setUUID(com.compartamos.common.gdt.UUID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ReferenceID").equals(
                            reader.getName())) {
                    object.setReferenceID(com.compartamos.common.gdt.BusinessDocumentMessageID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ReferenceUUID").equals(
                            reader.getName())) {
                    object.setReferenceUUID(com.compartamos.common.gdt.UUID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "CreationDateTime").equals(
                            reader.getName())) {
                    object.setCreationDateTime(com.compartamos.common.gdt.GLOBAL_DateTime.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "TestDataIndicator").equals(
                            reader.getName())) {
                    object.setTestDataIndicator(com.compartamos.common.gdt.Indicator.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "SenderBusinessSystemID").equals(reader.getName())) {
                    object.setSenderBusinessSystemID(com.compartamos.common.gdt.BusinessSystemID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "RecipientBusinessSystemID").equals(
                            reader.getName())) {
                    object.setRecipientBusinessSystemID(com.compartamos.common.gdt.BusinessSystemID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "SenderParty").equals(
                            reader.getName())) {
                    object.setSenderParty(com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "RecipientParty").equals(
                            reader.getName())) {
                    object.setRecipientParty(com.compartamos.common.gdt.BusinessDocumentMessageHeaderParty.Factory.parse(
                            reader));

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
