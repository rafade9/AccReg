/**
 * AcctOriginationBusinessPartnerAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package com.compartamos.common.structures;


/**
 *  AcctOriginationBusinessPartnerAddress bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class AcctOriginationBusinessPartnerAddress implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = AcctOriginationBusinessPartnerAddress
       Namespace URI = http://compartamos.com/common/structures
       Namespace Prefix = ns3
     */

    /**
     * field for AddressTypeCode
     */
    protected com.compartamos.common.gdt.AddressTypeID localAddressTypeCode;

    /**
     * field for StreetName
     */
    protected com.compartamos.common.gdt.StreetName localStreetName;

    /**
     * field for CountryName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localCountryName;

    /**
     * field for RegionCode
     */
    protected com.compartamos.common.gdt.RegionCode localRegionCode;

    /**
     * field for CityName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localCityName;

    /**
     * field for DistrictName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localDistrictName;

    /**
     * field for AdditionalCityName
     */
    protected com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name localAdditionalCityName;

    /**
     * field for StreetPostalCode
     */
    protected com.compartamos.common.gdt.PostalCode localStreetPostalCode;

    /**
     * field for HouseID
     */
    protected com.compartamos.common.gdt.HouseID localHouseID;

    /**
     * field for AdditionalHouseID
     */
    protected com.compartamos.common.gdt.HouseID localAdditionalHouseID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAdditionalHouseIDTracker = false;

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.AddressTypeID
     */
    public com.compartamos.common.gdt.AddressTypeID getAddressTypeCode() {
        return localAddressTypeCode;
    }

    /**
     * Auto generated setter method
     * @param param AddressTypeCode
     */
    public void setAddressTypeCode(
        com.compartamos.common.gdt.AddressTypeID param) {
        this.localAddressTypeCode = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.StreetName
     */
    public com.compartamos.common.gdt.StreetName getStreetName() {
        return localStreetName;
    }

    /**
     * Auto generated setter method
     * @param param StreetName
     */
    public void setStreetName(com.compartamos.common.gdt.StreetName param) {
        this.localStreetName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getCountryName() {
        return localCountryName;
    }

    /**
     * Auto generated setter method
     * @param param CountryName
     */
    public void setCountryName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        this.localCountryName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.RegionCode
     */
    public com.compartamos.common.gdt.RegionCode getRegionCode() {
        return localRegionCode;
    }

    /**
     * Auto generated setter method
     * @param param RegionCode
     */
    public void setRegionCode(com.compartamos.common.gdt.RegionCode param) {
        this.localRegionCode = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getCityName() {
        return localCityName;
    }

    /**
     * Auto generated setter method
     * @param param CityName
     */
    public void setCityName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        this.localCityName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getDistrictName() {
        return localDistrictName;
    }

    /**
     * Auto generated setter method
     * @param param DistrictName
     */
    public void setDistrictName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        this.localDistrictName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name
     */
    public com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name getAdditionalCityName() {
        return localAdditionalCityName;
    }

    /**
     * Auto generated setter method
     * @param param AdditionalCityName
     */
    public void setAdditionalCityName(
        com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name param) {
        this.localAdditionalCityName = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.PostalCode
     */
    public com.compartamos.common.gdt.PostalCode getStreetPostalCode() {
        return localStreetPostalCode;
    }

    /**
     * Auto generated setter method
     * @param param StreetPostalCode
     */
    public void setStreetPostalCode(com.compartamos.common.gdt.PostalCode param) {
        this.localStreetPostalCode = param;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.HouseID
     */
    public com.compartamos.common.gdt.HouseID getHouseID() {
        return localHouseID;
    }

    /**
     * Auto generated setter method
     * @param param HouseID
     */
    public void setHouseID(com.compartamos.common.gdt.HouseID param) {
        this.localHouseID = param;
    }

    public boolean isAdditionalHouseIDSpecified() {
        return localAdditionalHouseIDTracker;
    }

    /**
     * Auto generated getter method
     * @return com.compartamos.common.gdt.HouseID
     */
    public com.compartamos.common.gdt.HouseID getAdditionalHouseID() {
        return localAdditionalHouseID;
    }

    /**
     * Auto generated setter method
     * @param param AdditionalHouseID
     */
    public void setAdditionalHouseID(com.compartamos.common.gdt.HouseID param) {
        localAdditionalHouseIDTracker = param != null;

        this.localAdditionalHouseID = param;
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
                    "http://compartamos.com/common/structures");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":AcctOriginationBusinessPartnerAddress",
                    xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "AcctOriginationBusinessPartnerAddress", xmlWriter);
            }
        }

        if (localAddressTypeCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "AddressTypeCode cannot be null!!");
        }

        localAddressTypeCode.serialize(new javax.xml.namespace.QName("",
                "AddressTypeCode"), xmlWriter);

        if (localStreetName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "StreetName cannot be null!!");
        }

        localStreetName.serialize(new javax.xml.namespace.QName("", "StreetName"),
            xmlWriter);

        if (localCountryName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CountryName cannot be null!!");
        }

        localCountryName.serialize(new javax.xml.namespace.QName("",
                "CountryName"), xmlWriter);

        if (localRegionCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "RegionCode cannot be null!!");
        }

        localRegionCode.serialize(new javax.xml.namespace.QName("", "RegionCode"),
            xmlWriter);

        if (localCityName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CityName cannot be null!!");
        }

        localCityName.serialize(new javax.xml.namespace.QName("", "CityName"),
            xmlWriter);

        if (localDistrictName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "DistrictName cannot be null!!");
        }

        localDistrictName.serialize(new javax.xml.namespace.QName("",
                "DistrictName"), xmlWriter);

        if (localAdditionalCityName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "AdditionalCityName cannot be null!!");
        }

        localAdditionalCityName.serialize(new javax.xml.namespace.QName("",
                "AdditionalCityName"), xmlWriter);

        if (localStreetPostalCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "StreetPostalCode cannot be null!!");
        }

        localStreetPostalCode.serialize(new javax.xml.namespace.QName("",
                "StreetPostalCode"), xmlWriter);

        if (localHouseID == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "HouseID cannot be null!!");
        }

        localHouseID.serialize(new javax.xml.namespace.QName("", "HouseID"),
            xmlWriter);

        if (localAdditionalHouseIDTracker) {
            if (localAdditionalHouseID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AdditionalHouseID cannot be null!!");
            }

            localAdditionalHouseID.serialize(new javax.xml.namespace.QName("",
                    "AdditionalHouseID"), xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://compartamos.com/common/structures")) {
            return "ns3";
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

        elementList.add(new javax.xml.namespace.QName("", "AddressTypeCode"));

        if (localAddressTypeCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "AddressTypeCode cannot be null!!");
        }

        elementList.add(localAddressTypeCode);

        elementList.add(new javax.xml.namespace.QName("", "StreetName"));

        if (localStreetName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "StreetName cannot be null!!");
        }

        elementList.add(localStreetName);

        elementList.add(new javax.xml.namespace.QName("", "CountryName"));

        if (localCountryName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CountryName cannot be null!!");
        }

        elementList.add(localCountryName);

        elementList.add(new javax.xml.namespace.QName("", "RegionCode"));

        if (localRegionCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "RegionCode cannot be null!!");
        }

        elementList.add(localRegionCode);

        elementList.add(new javax.xml.namespace.QName("", "CityName"));

        if (localCityName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CityName cannot be null!!");
        }

        elementList.add(localCityName);

        elementList.add(new javax.xml.namespace.QName("", "DistrictName"));

        if (localDistrictName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "DistrictName cannot be null!!");
        }

        elementList.add(localDistrictName);

        elementList.add(new javax.xml.namespace.QName("", "AdditionalCityName"));

        if (localAdditionalCityName == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "AdditionalCityName cannot be null!!");
        }

        elementList.add(localAdditionalCityName);

        elementList.add(new javax.xml.namespace.QName("", "StreetPostalCode"));

        if (localStreetPostalCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "StreetPostalCode cannot be null!!");
        }

        elementList.add(localStreetPostalCode);

        elementList.add(new javax.xml.namespace.QName("", "HouseID"));

        if (localHouseID == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "HouseID cannot be null!!");
        }

        elementList.add(localHouseID);

        if (localAdditionalHouseIDTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "AdditionalHouseID"));

            if (localAdditionalHouseID == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AdditionalHouseID cannot be null!!");
            }

            elementList.add(localAdditionalHouseID);
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
        public static AcctOriginationBusinessPartnerAddress parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AcctOriginationBusinessPartnerAddress object = new AcctOriginationBusinessPartnerAddress();

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

                        if (!"AcctOriginationBusinessPartnerAddress".equals(
                                    type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (AcctOriginationBusinessPartnerAddress) com.compartamos.global.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "AddressTypeCode").equals(
                            reader.getName())) {
                    object.setAddressTypeCode(com.compartamos.common.gdt.AddressTypeID.Factory.parse(
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
                        new javax.xml.namespace.QName("", "StreetName").equals(
                            reader.getName())) {
                    object.setStreetName(com.compartamos.common.gdt.StreetName.Factory.parse(
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
                        new javax.xml.namespace.QName("", "CountryName").equals(
                            reader.getName())) {
                    object.setCountryName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
                        new javax.xml.namespace.QName("", "RegionCode").equals(
                            reader.getName())) {
                    object.setRegionCode(com.compartamos.common.gdt.RegionCode.Factory.parse(
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
                        new javax.xml.namespace.QName("", "CityName").equals(
                            reader.getName())) {
                    object.setCityName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
                        new javax.xml.namespace.QName("", "DistrictName").equals(
                            reader.getName())) {
                    object.setDistrictName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
                        new javax.xml.namespace.QName("", "AdditionalCityName").equals(
                            reader.getName())) {
                    object.setAdditionalCityName(com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name.Factory.parse(
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
                        new javax.xml.namespace.QName("", "StreetPostalCode").equals(
                            reader.getName())) {
                    object.setStreetPostalCode(com.compartamos.common.gdt.PostalCode.Factory.parse(
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
                        new javax.xml.namespace.QName("", "HouseID").equals(
                            reader.getName())) {
                    object.setHouseID(com.compartamos.common.gdt.HouseID.Factory.parse(
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
                        new javax.xml.namespace.QName("", "AdditionalHouseID").equals(
                            reader.getName())) {
                    object.setAdditionalHouseID(com.compartamos.common.gdt.HouseID.Factory.parse(
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
