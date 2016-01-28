/**
 * LogItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.common.gdt;


/**
 *  LogItem bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class LogItem implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = LogItem
       Namespace URI = http://compartamos.com/common/gdt
       Namespace Prefix = ns1
     */

    /**
     * field for TypeID
     */
    protected com.compartamos.common.gdt.LogItemTypeID localTypeID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypeIDTracker = false;

    /**
     * field for CategoryCode
     */
    protected com.compartamos.common.gdt.LogItemCategoryCode localCategoryCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCategoryCodeTracker = false;

    /**
     * field for SeverityCode
     */
    protected com.compartamos.common.gdt.LogItemSeverityCode localSeverityCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSeverityCodeTracker = false;

    /**
     * field for ReferenceObjectNodeSenderTechnicalID
     */
    protected com.compartamos.common.gdt.ObjectNodePartyTechnicalID localReferenceObjectNodeSenderTechnicalID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenceObjectNodeSenderTechnicalIDTracker = false;

    /**
     * field for ReferenceMessageElementName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_Name localReferenceMessageElementName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenceMessageElementNameTracker = false;

    /**
     * field for Note
     */
    protected com.compartamos.common.gdt.LogItemNote localNote;

    /**
     * field for WebURI
     */
    protected com.compartamos.common.gdt.WebURI localWebURI;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWebURITracker = false;

    public boolean isTypeIDSpecified() {
        return localTypeIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LogItemTypeID
     */
    public com.compartamos.common.gdt.LogItemTypeID getTypeID() {
        return localTypeID;
    }

    /**
     * Auto generated setter method
     * @param param TypeID
     */
    public void setTypeID(com.compartamos.common.gdt.LogItemTypeID param) {
        localTypeIDTracker = param != null;

        this.localTypeID = param;
    }

    public boolean isCategoryCodeSpecified() {
        return localCategoryCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LogItemCategoryCode
     */
    public com.compartamos.common.gdt.LogItemCategoryCode getCategoryCode() {
        return localCategoryCode;
    }

    /**
     * Auto generated setter method
     * @param param CategoryCode
     */
    public void setCategoryCode(
        com.compartamos.common.gdt.LogItemCategoryCode param) {
        localCategoryCodeTracker = param != null;

        this.localCategoryCode = param;
    }

    public boolean isSeverityCodeSpecified() {
        return localSeverityCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LogItemSeverityCode
     */
    public com.compartamos.common.gdt.LogItemSeverityCode getSeverityCode() {
        return localSeverityCode;
    }

    /**
     * Auto generated setter method
     * @param param SeverityCode
     */
    public void setSeverityCode(
        com.compartamos.common.gdt.LogItemSeverityCode param) {
        localSeverityCodeTracker = param != null;

        this.localSeverityCode = param;
    }

    public boolean isReferenceObjectNodeSenderTechnicalIDSpecified() {
        return localReferenceObjectNodeSenderTechnicalIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.ObjectNodePartyTechnicalID
     */
    public com.compartamos.common.gdt.ObjectNodePartyTechnicalID getReferenceObjectNodeSenderTechnicalID() {
        return localReferenceObjectNodeSenderTechnicalID;
    }

    /**
     * Auto generated setter method
     * @param param ReferenceObjectNodeSenderTechnicalID
     */
    public void setReferenceObjectNodeSenderTechnicalID(
        com.compartamos.common.gdt.ObjectNodePartyTechnicalID param) {
        localReferenceObjectNodeSenderTechnicalIDTracker = param != null;

        this.localReferenceObjectNodeSenderTechnicalID = param;
    }

    public boolean isReferenceMessageElementNameSpecified() {
        return localReferenceMessageElementNameTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_Name getReferenceMessageElementName() {
        return localReferenceMessageElementName;
    }

    /**
     * Auto generated setter method
     * @param param ReferenceMessageElementName
     */
    public void setReferenceMessageElementName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_Name param) {
        localReferenceMessageElementNameTracker = param != null;

        this.localReferenceMessageElementName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LogItemNote
     */
    public com.compartamos.common.gdt.LogItemNote getNote() {
        return localNote;
    }

    /**
     * Auto generated setter method
     * @param param Note
     */
    public void setNote(com.compartamos.common.gdt.LogItemNote param) {
        this.localNote = param;
    }

    public boolean isWebURISpecified() {
        return localWebURITracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.WebURI
     */
    public com.compartamos.common.gdt.WebURI getWebURI() {
        return localWebURI;
    }

    /**
     * Auto generated setter method
     * @param param WebURI
     */
    public void setWebURI(com.compartamos.common.gdt.WebURI param) {
        localWebURITracker = param != null;

        this.localWebURI = param;
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
                    namespacePrefix + ":LogItem", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "LogItem", xmlWriter);
            }
        }

        if (localTypeIDTracker) {
            if (localTypeID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TypeID cannot be null!!");
            }

            localTypeID.serialize(new javax.xml.namespace.QName("", "TypeID"),
                xmlWriter);
        }

        if (localCategoryCodeTracker) {
            if (localCategoryCode == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CategoryCode cannot be null!!");
            }

            localCategoryCode.serialize(new javax.xml.namespace.QName("",
                    "CategoryCode"), xmlWriter);
        }

        if (localSeverityCodeTracker) {
            if (localSeverityCode == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SeverityCode cannot be null!!");
            }

            localSeverityCode.serialize(new javax.xml.namespace.QName("",
                    "SeverityCode"), xmlWriter);
        }

        if (localReferenceObjectNodeSenderTechnicalIDTracker) {
            if (localReferenceObjectNodeSenderTechnicalID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceObjectNodeSenderTechnicalID cannot be null!!");
            }

            localReferenceObjectNodeSenderTechnicalID.serialize(new javax.xml.namespace.QName(
                    "", "ReferenceObjectNodeSenderTechnicalID"), xmlWriter);
        }

        if (localReferenceMessageElementNameTracker) {
            if (localReferenceMessageElementName == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceMessageElementName cannot be null!!");
            }

            localReferenceMessageElementName.serialize(new javax.xml.namespace.QName(
                    "", "ReferenceMessageElementName"), xmlWriter);
        }

        if (localNote == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "Note cannot be null!!");
        }

        localNote.serialize(new javax.xml.namespace.QName("", "Note"), xmlWriter);

        if (localWebURITracker) {
            if (localWebURI == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "WebURI cannot be null!!");
            }

            localWebURI.serialize(new javax.xml.namespace.QName("", "WebURI"),
                xmlWriter);
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

        if (localTypeIDTracker) {
            elementList.add(new javax.xml.namespace.QName("", "TypeID"));

            if (localTypeID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TypeID cannot be null!!");
            }

            elementList.add(localTypeID);
        }

        if (localCategoryCodeTracker) {
            elementList.add(new javax.xml.namespace.QName("", "CategoryCode"));

            if (localCategoryCode == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CategoryCode cannot be null!!");
            }

            elementList.add(localCategoryCode);
        }

        if (localSeverityCodeTracker) {
            elementList.add(new javax.xml.namespace.QName("", "SeverityCode"));

            if (localSeverityCode == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SeverityCode cannot be null!!");
            }

            elementList.add(localSeverityCode);
        }

        if (localReferenceObjectNodeSenderTechnicalIDTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "ReferenceObjectNodeSenderTechnicalID"));

            if (localReferenceObjectNodeSenderTechnicalID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceObjectNodeSenderTechnicalID cannot be null!!");
            }

            elementList.add(localReferenceObjectNodeSenderTechnicalID);
        }

        if (localReferenceMessageElementNameTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "ReferenceMessageElementName"));

            if (localReferenceMessageElementName == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReferenceMessageElementName cannot be null!!");
            }

            elementList.add(localReferenceMessageElementName);
        }

        elementList.add(new javax.xml.namespace.QName("", "Note"));

        if (localNote == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "Note cannot be null!!");
        }

        elementList.add(localNote);

        if (localWebURITracker) {
            elementList.add(new javax.xml.namespace.QName("", "WebURI"));

            if (localWebURI == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "WebURI cannot be null!!");
            }

            elementList.add(localWebURI);
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
        public static LogItem parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            LogItem object = new LogItem();

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

                        if (!"LogItem".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (LogItem) com.compartamos.global.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "TypeID").equals(
                            reader.getName())) {
                    object.setTypeID(com.compartamos.common.gdt.LogItemTypeID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "CategoryCode").equals(
                            reader.getName())) {
                    object.setCategoryCode(com.compartamos.common.gdt.LogItemCategoryCode.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "SeverityCode").equals(
                            reader.getName())) {
                    object.setSeverityCode(com.compartamos.common.gdt.LogItemSeverityCode.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "ReferenceObjectNodeSenderTechnicalID").equals(
                            reader.getName())) {
                    object.setReferenceObjectNodeSenderTechnicalID(com.compartamos.common.gdt.ObjectNodePartyTechnicalID.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "ReferenceMessageElementName").equals(
                            reader.getName())) {
                    object.setReferenceMessageElementName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_Name.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "Note").equals(
                            reader.getName())) {
                    object.setNote(com.compartamos.common.gdt.LogItemNote.Factory.parse(
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
                        new javax.xml.namespace.QName("", "WebURI").equals(
                            reader.getName())) {
                    object.setWebURI(com.compartamos.common.gdt.WebURI.Factory.parse(
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
