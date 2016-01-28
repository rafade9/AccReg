/**
 * PartyID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.common.gdt;


/**
 *  PartyID bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PartyID extends com.compartamos.common.gdt.PartyIDContent
    implements org.apache.axis2.databinding.ADBBean {
    /**
     * field for SchemeID
     * This was an Attribute!
     */
    protected com.compartamos.common.gdt.SchemeID_type1 localSchemeID;

    /**
     * field for SchemeAgencyID
     * This was an Attribute!
     */
    protected com.compartamos.common.gdt.SchemeAgencyID_type1 localSchemeAgencyID;

    /**
     * field for SchemeAgencySchemeID
     * This was an Attribute!
     */
    protected com.compartamos.common.gdt.SchemeAgencySchemeID_type0 localSchemeAgencySchemeID;

    /**
     * field for SchemeAgencySchemeAgencyID
     * This was an Attribute!
     */
    protected com.compartamos.common.gdt.AgencyIdentificationCode localSchemeAgencySchemeAgencyID;

    /* This type was generated from the piece of schema that had
       name = PartyID
       Namespace URI = http://compartamos.com/common/gdt
       Namespace Prefix = ns1
     */

    /**
     * field for PartyIDContent
     */

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.Token
     */
    public org.apache.axis2.databinding.types.Token getPartyIDContent() {
        return localPartyIDContent;
    }

    /**
     * Auto generated setter method
     * @param param PartyIDContent
     */
    public void setPartyIDContent(
        org.apache.axis2.databinding.types.Token param) {
        if ((1 <= java.lang.String.valueOf(param).length()) &&
                (java.lang.String.valueOf(param).length() <= 60)) {
            this.localPartyIDContent = param;
        } else {
            throw new java.lang.RuntimeException(
                "Input values do not follow defined XSD restrictions");
        }
    }

    public java.lang.String toString() {
        return localPartyIDContent.toString();
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.SchemeID_type1
     */
    public com.compartamos.common.gdt.SchemeID_type1 getSchemeID() {
        return localSchemeID;
    }

    /**
     * Auto generated setter method
     * @param param SchemeID
     */
    public void setSchemeID(com.compartamos.common.gdt.SchemeID_type1 param) {
        this.localSchemeID = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.SchemeAgencyID_type1
     */
    public com.compartamos.common.gdt.SchemeAgencyID_type1 getSchemeAgencyID() {
        return localSchemeAgencyID;
    }

    /**
     * Auto generated setter method
     * @param param SchemeAgencyID
     */
    public void setSchemeAgencyID(
        com.compartamos.common.gdt.SchemeAgencyID_type1 param) {
        this.localSchemeAgencyID = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.SchemeAgencySchemeID_type0
     */
    public com.compartamos.common.gdt.SchemeAgencySchemeID_type0 getSchemeAgencySchemeID() {
        return localSchemeAgencySchemeID;
    }

    /**
     * Auto generated setter method
     * @param param SchemeAgencySchemeID
     */
    public void setSchemeAgencySchemeID(
        com.compartamos.common.gdt.SchemeAgencySchemeID_type0 param) {
        this.localSchemeAgencySchemeID = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.AgencyIdentificationCode
     */
    public com.compartamos.common.gdt.AgencyIdentificationCode getSchemeAgencySchemeAgencyID() {
        return localSchemeAgencySchemeAgencyID;
    }

    /**
     * Auto generated setter method
     * @param param SchemeAgencySchemeAgencyID
     */
    public void setSchemeAgencySchemeAgencyID(
        com.compartamos.common.gdt.AgencyIdentificationCode param) {
        this.localSchemeAgencySchemeAgencyID = param;
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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://compartamos.com/common/gdt");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", namespacePrefix + ":PartyID", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "PartyID", xmlWriter);
        }

        if (localSchemeID != null) {
            writeAttribute("", "schemeID", localSchemeID.toString(), xmlWriter);
        }

        if (localSchemeAgencyID != null) {
            writeAttribute("", "schemeAgencyID",
                localSchemeAgencyID.toString(), xmlWriter);
        }

        if (localSchemeAgencySchemeID != null) {
            writeAttribute("", "schemeAgencySchemeID",
                localSchemeAgencySchemeID.toString(), xmlWriter);
        }

        if (localSchemeAgencySchemeAgencyID != null) {
            writeAttribute("", "schemeAgencySchemeAgencyID",
                localSchemeAgencySchemeAgencyID.toString(), xmlWriter);
        }

        if (localPartyIDContent == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "PartyID.Content cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPartyIDContent));
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

        attribList.add(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema-instance", "type"));
        attribList.add(new javax.xml.namespace.QName(
                "http://compartamos.com/common/gdt", "PartyID"));

        elementList.add(org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT);

        if (localPartyIDContent != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPartyIDContent));
        } else {
            throw new org.apache.axis2.databinding.ADBException(
                "PartyID.Content cannot be null!!");
        }

        attribList.add(new javax.xml.namespace.QName("", "schemeID"));

        attribList.add(localSchemeID.toString());

        attribList.add(new javax.xml.namespace.QName("", "schemeAgencyID"));

        attribList.add(localSchemeAgencyID.toString());

        attribList.add(new javax.xml.namespace.QName("", "schemeAgencySchemeID"));

        attribList.add(localSchemeAgencySchemeID.toString());

        attribList.add(new javax.xml.namespace.QName("",
                "schemeAgencySchemeAgencyID"));

        attribList.add(localSchemeAgencySchemeAgencyID.toString());

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
            elementList.toArray(), attribList.toArray());
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        public static PartyID fromString(java.lang.String value,
            java.lang.String namespaceURI) {
            PartyID returnValue = new PartyID();

            returnValue.setPartyIDContent(org.apache.axis2.databinding.utils.ConverterUtil.convertToToken(
                    value));

            return returnValue;
        }

        public static PartyID fromString(
            javax.xml.stream.XMLStreamReader xmlStreamReader,
            java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext()
                                                               .getNamespaceURI(prefix);

                return PartyID.Factory.fromString(content, namespaceUri);
            } else {
                return PartyID.Factory.fromString(content, "");
            }
        }

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static PartyID parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            PartyID object = new PartyID();

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

                        if (!"PartyID".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (PartyID) com.compartamos.global.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "schemeID"
                java.lang.String tempAttribSchemeID = reader.getAttributeValue(null,
                        "schemeID");

                if (tempAttribSchemeID != null) {
                    java.lang.String content = tempAttribSchemeID;

                    object.setSchemeID(com.compartamos.common.gdt.SchemeID_type1.Factory.fromString(
                            reader, tempAttribSchemeID));
                } else {
                }

                handledAttributes.add("schemeID");

                // handle attribute "schemeAgencyID"
                java.lang.String tempAttribSchemeAgencyID = reader.getAttributeValue(null,
                        "schemeAgencyID");

                if (tempAttribSchemeAgencyID != null) {
                    java.lang.String content = tempAttribSchemeAgencyID;

                    object.setSchemeAgencyID(com.compartamos.common.gdt.SchemeAgencyID_type1.Factory.fromString(
                            reader, tempAttribSchemeAgencyID));
                } else {
                }

                handledAttributes.add("schemeAgencyID");

                // handle attribute "schemeAgencySchemeID"
                java.lang.String tempAttribSchemeAgencySchemeID = reader.getAttributeValue(null,
                        "schemeAgencySchemeID");

                if (tempAttribSchemeAgencySchemeID != null) {
                    java.lang.String content = tempAttribSchemeAgencySchemeID;

                    object.setSchemeAgencySchemeID(com.compartamos.common.gdt.SchemeAgencySchemeID_type0.Factory.fromString(
                            reader, tempAttribSchemeAgencySchemeID));
                } else {
                }

                handledAttributes.add("schemeAgencySchemeID");

                // handle attribute "schemeAgencySchemeAgencyID"
                java.lang.String tempAttribSchemeAgencySchemeAgencyID = reader.getAttributeValue(null,
                        "schemeAgencySchemeAgencyID");

                if (tempAttribSchemeAgencySchemeAgencyID != null) {
                    java.lang.String content = tempAttribSchemeAgencySchemeAgencyID;

                    object.setSchemeAgencySchemeAgencyID(com.compartamos.common.gdt.AgencyIdentificationCode.Factory.fromString(
                            reader, tempAttribSchemeAgencySchemeAgencyID));
                } else {
                }

                handledAttributes.add("schemeAgencySchemeAgencyID");

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        if (reader.isStartElement() || reader.hasText()) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PartyID.Content" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPartyIDContent(org.apache.axis2.databinding.utils.ConverterUtil.convertToToken(
                                    content));
                        } // End of if for expected property start element

                        else {
                            // A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
