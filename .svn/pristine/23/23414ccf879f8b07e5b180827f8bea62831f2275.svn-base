/**
 * AcctOriginationBusinessPartnerName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.common.gdt;


/**
 *  AcctOriginationBusinessPartnerName bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class AcctOriginationBusinessPartnerName implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = AcctOriginationBusinessPartnerName
       Namespace URI = http://compartamos.com/common/gdt
       Namespace Prefix = ns1
     */

    /**
     * field for GivenName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localGivenName;

    /**
     * field for MiddleName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localMiddleName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMiddleNameTracker = false;

    /**
     * field for FamilyName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localFamilyName;

    /**
     * field for AditionalFamilyName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localAditionalFamilyName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAditionalFamilyNameTracker = false;

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getGivenName() {
        return localGivenName;
    }

    /**
     * Auto generated setter method
     * @param param GivenName
     */
    public void setGivenName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        this.localGivenName = param;
    }

    public boolean isMiddleNameSpecified() {
        return localMiddleNameTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getMiddleName() {
        return localMiddleName;
    }

    /**
     * Auto generated setter method
     * @param param MiddleName
     */
    public void setMiddleName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        localMiddleNameTracker = param != null;

        this.localMiddleName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getFamilyName() {
        return localFamilyName;
    }

    /**
     * Auto generated setter method
     * @param param FamilyName
     */
    public void setFamilyName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        this.localFamilyName = param;
    }

    public boolean isAditionalFamilyNameSpecified() {
        return localAditionalFamilyNameTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getAditionalFamilyName() {
        return localAditionalFamilyName;
    }

    /**
     * Auto generated setter method
     * @param param AditionalFamilyName
     */
    public void setAditionalFamilyName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        localAditionalFamilyNameTracker = param != null;

        this.localAditionalFamilyName = param;
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
                    namespacePrefix + ":AcctOriginationBusinessPartnerName",
                    xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "AcctOriginationBusinessPartnerName", xmlWriter);
            }
        }

        if (localGivenName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "GivenName cannot be null!!");
        }

        localGivenName.serialize(new javax.xml.namespace.QName("", "GivenName"),
            xmlWriter);

        if (localMiddleNameTracker) {
            if (localMiddleName == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "MiddleName cannot be null!!");
            }

            localMiddleName.serialize(new javax.xml.namespace.QName("",
                    "MiddleName"), xmlWriter);
        }

        if (localFamilyName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "FamilyName cannot be null!!");
        }

        localFamilyName.serialize(new javax.xml.namespace.QName("", "FamilyName"),
            xmlWriter);

        if (localAditionalFamilyNameTracker) {
            if (localAditionalFamilyName == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AditionalFamilyName cannot be null!!");
            }

            localAditionalFamilyName.serialize(new javax.xml.namespace.QName(
                    "", "AditionalFamilyName"), xmlWriter);
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

        elementList.add(new javax.xml.namespace.QName("", "GivenName"));

        if (localGivenName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "GivenName cannot be null!!");
        }

        elementList.add(localGivenName);

        if (localMiddleNameTracker) {
            elementList.add(new javax.xml.namespace.QName("", "MiddleName"));

            if (localMiddleName == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "MiddleName cannot be null!!");
            }

            elementList.add(localMiddleName);
        }

        elementList.add(new javax.xml.namespace.QName("", "FamilyName"));

        if (localFamilyName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "FamilyName cannot be null!!");
        }

        elementList.add(localFamilyName);

        if (localAditionalFamilyNameTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "AditionalFamilyName"));

            if (localAditionalFamilyName == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AditionalFamilyName cannot be null!!");
            }

            elementList.add(localAditionalFamilyName);
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
        public static AcctOriginationBusinessPartnerName parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AcctOriginationBusinessPartnerName object = new AcctOriginationBusinessPartnerName();

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

                        if (!"AcctOriginationBusinessPartnerName".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (AcctOriginationBusinessPartnerName) com.compartamos.global.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "GivenName").equals(
                            reader.getName())) {
                    object.setGivenName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
                        new javax.xml.namespace.QName("", "MiddleName").equals(
                            reader.getName())) {
                    object.setMiddleName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "FamilyName").equals(
                            reader.getName())) {
                    object.setFamilyName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
                        new javax.xml.namespace.QName("", "AditionalFamilyName").equals(
                            reader.getName())) {
                    object.setAditionalFamilyName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
