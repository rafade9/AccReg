/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package org.datacontract.schemas._2004._07.wcfreferencemanager;


/**
 *  Item bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Item implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Item
       Namespace URI = http://schemas.datacontract.org/2004/07/WCFReferenceManager
       Namespace Prefix = ns1
     */

    /**
     * field for CategoryCode
     */
    protected java.lang.String localCategoryCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCategoryCodeTracker = false;

    /**
     * field for Note
     */
    protected java.lang.String localNote;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoteTracker = false;

    /**
     * field for ReferenceObjectNodeSenderTechnicalID
     */
    protected java.lang.String localReferenceObjectNodeSenderTechnicalID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenceObjectNodeSenderTechnicalIDTracker = false;

    /**
     * field for SeverityCode
     */
    protected int localSeverityCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSeverityCodeTracker = false;

    /**
     * field for TypeID
     */
    protected java.lang.String localTypeID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypeIDTracker = false;

    /**
     * field for WebURI
     */
    protected java.lang.String localWebURI;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWebURITracker = false;

    public boolean isCategoryCodeSpecified() {
        return localCategoryCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCategoryCode() {
        return localCategoryCode;
    }

    /**
     * Auto generated setter method
     * @param param CategoryCode
     */
    public void setCategoryCode(java.lang.String param) {
        localCategoryCodeTracker = true;

        this.localCategoryCode = param;
    }

    public boolean isNoteSpecified() {
        return localNoteTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNote() {
        return localNote;
    }

    /**
     * Auto generated setter method
     * @param param Note
     */
    public void setNote(java.lang.String param) {
        localNoteTracker = true;

        this.localNote = param;
    }

    public boolean isReferenceObjectNodeSenderTechnicalIDSpecified() {
        return localReferenceObjectNodeSenderTechnicalIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getReferenceObjectNodeSenderTechnicalID() {
        return localReferenceObjectNodeSenderTechnicalID;
    }

    /**
     * Auto generated setter method
     * @param param ReferenceObjectNodeSenderTechnicalID
     */
    public void setReferenceObjectNodeSenderTechnicalID(java.lang.String param) {
        localReferenceObjectNodeSenderTechnicalIDTracker = true;

        this.localReferenceObjectNodeSenderTechnicalID = param;
    }

    public boolean isSeverityCodeSpecified() {
        return localSeverityCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getSeverityCode() {
        return localSeverityCode;
    }

    /**
     * Auto generated setter method
     * @param param SeverityCode
     */
    public void setSeverityCode(int param) {
        // setting primitive attribute tracker to true
        localSeverityCodeTracker = param != java.lang.Integer.MIN_VALUE;

        this.localSeverityCode = param;
    }

    public boolean isTypeIDSpecified() {
        return localTypeIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTypeID() {
        return localTypeID;
    }

    /**
     * Auto generated setter method
     * @param param TypeID
     */
    public void setTypeID(java.lang.String param) {
        localTypeIDTracker = true;

        this.localTypeID = param;
    }

    public boolean isWebURISpecified() {
        return localWebURITracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getWebURI() {
        return localWebURI;
    }

    /**
     * Auto generated setter method
     * @param param WebURI
     */
    public void setWebURI(java.lang.String param) {
        localWebURITracker = true;

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
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Item", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Item", xmlWriter);
            }
        }

        if (localCategoryCodeTracker) {
            namespace = "http://schemas.datacontract.org/2004/07/WCFReferenceManager";
            writeStartElement(null, namespace, "CategoryCode", xmlWriter);

            if (localCategoryCode == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localCategoryCode);
            }

            xmlWriter.writeEndElement();
        }

        if (localNoteTracker) {
            namespace = "http://schemas.datacontract.org/2004/07/WCFReferenceManager";
            writeStartElement(null, namespace, "Note", xmlWriter);

            if (localNote == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localNote);
            }

            xmlWriter.writeEndElement();
        }

        if (localReferenceObjectNodeSenderTechnicalIDTracker) {
            namespace = "http://schemas.datacontract.org/2004/07/WCFReferenceManager";
            writeStartElement(null, namespace,
                "ReferenceObjectNodeSenderTechnicalID", xmlWriter);

            if (localReferenceObjectNodeSenderTechnicalID == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localReferenceObjectNodeSenderTechnicalID);
            }

            xmlWriter.writeEndElement();
        }

        if (localSeverityCodeTracker) {
            namespace = "http://schemas.datacontract.org/2004/07/WCFReferenceManager";
            writeStartElement(null, namespace, "SeverityCode", xmlWriter);

            if (localSeverityCode == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SeverityCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSeverityCode));
            }

            xmlWriter.writeEndElement();
        }

        if (localTypeIDTracker) {
            namespace = "http://schemas.datacontract.org/2004/07/WCFReferenceManager";
            writeStartElement(null, namespace, "TypeID", xmlWriter);

            if (localTypeID == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localTypeID);
            }

            xmlWriter.writeEndElement();
        }

        if (localWebURITracker) {
            namespace = "http://schemas.datacontract.org/2004/07/WCFReferenceManager";
            writeStartElement(null, namespace, "WebURI", xmlWriter);

            if (localWebURI == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localWebURI);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager")) {
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

        if (localCategoryCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                    "CategoryCode"));

            elementList.add((localCategoryCode == null) ? null
                                                        : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCategoryCode));
        }

        if (localNoteTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                    "Note"));

            elementList.add((localNote == null) ? null
                                                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNote));
        }

        if (localReferenceObjectNodeSenderTechnicalIDTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                    "ReferenceObjectNodeSenderTechnicalID"));

            elementList.add((localReferenceObjectNodeSenderTechnicalID == null)
                ? null
                : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localReferenceObjectNodeSenderTechnicalID));
        }

        if (localSeverityCodeTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                    "SeverityCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSeverityCode));
        }

        if (localTypeIDTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                    "TypeID"));

            elementList.add((localTypeID == null) ? null
                                                  : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTypeID));
        }

        if (localWebURITracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                    "WebURI"));

            elementList.add((localWebURI == null) ? null
                                                  : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localWebURI));
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
        public static Item parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Item object = new Item();

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

                        if (!"Item".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Item) org.tempuri.imports.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                            "CategoryCode").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setCategoryCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                            "Note").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setNote(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                            "ReferenceObjectNodeSenderTechnicalID").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setReferenceObjectNodeSenderTechnicalID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                            "SeverityCode").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "SeverityCode" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSeverityCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setSeverityCode(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                            "TypeID").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setTypeID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://schemas.datacontract.org/2004/07/WCFReferenceManager",
                            "WebURI").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setWebURI(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

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
