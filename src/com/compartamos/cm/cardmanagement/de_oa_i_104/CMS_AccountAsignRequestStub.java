/**
 * CMS_AccountAsignRequestStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.compartamos.cm.cardmanagement.de_oa_i_104;


/*
 *  CMS_AccountAsignRequestStub java implementation
 */
public class CMS_AccountAsignRequestStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public CMS_AccountAsignRequestStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public CMS_AccountAsignRequestStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public CMS_AccountAsignRequestStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://bcbeta445/CMS_AccountAsignRequest/CMS_AccountAsignRequest.asmx");
    }

    /**
     * Default Constructor
     */
    public CMS_AccountAsignRequestStub() throws org.apache.axis2.AxisFault {
        this(
            "https://bcbeta445/CMS_AccountAsignRequest/CMS_AccountAsignRequest.asmx");
    }

    /**
     * Constructor taking the target endpoint
     */
    public CMS_AccountAsignRequestStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "CMS_AccountAsignRequest" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                "execute"));
        _service.addOperation(__operation);

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     * Execute
     * @see com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequest#execute
     * @param execute0
     */
    public com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse execute(
        com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute execute0)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://compartamos.com/CM/CardManagement/DE-OA-I-104/Execute");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    execute0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                            "execute")),
                    new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "execute"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Execute"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Execute"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Execute"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Execute
     * @see com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequest#startexecute
     * @param execute0
     */
    public void startexecute(
        com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute execute0,
        final com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                        .setAction("http://compartamos.com/CM/CardManagement/DE-OA-I-104/Execute");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                execute0,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "execute")),
                new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "execute"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultexecute((com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorexecute(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "Execute"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "Execute"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "Execute"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorexecute(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorexecute(f);
                                }
                            } else {
                                callback.receiveErrorexecute(f);
                            }
                        } else {
                            callback.receiveErrorexecute(f);
                        }
                    } else {
                        callback.receiveErrorexecute(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorexecute(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            if (com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute.class.equals(
                        type)) {
                return com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse.class.equals(
                        type)) {
                return com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    //https://bcbeta445/CMS_AccountAsignRequest/CMS_AccountAsignRequest.asmx
    public static class Execute implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                "Execute", "ns1");

        /**
         * field for CardID
         */
        protected java.lang.String localCardID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCardIDTracker = false;

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
         * field for BankCardProductID
         */
        protected java.lang.String localBankCardProductID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankCardProductIDTracker = false;

        /**
         * field for BankCardCardHolderParty
         */
        protected java.lang.String localBankCardCardHolderParty;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankCardCardHolderPartyTracker = false;

        /**
         * field for BankCardCardType
         */
        protected java.lang.String localBankCardCardType;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankCardCardTypeTracker = false;

        /**
         * field for BankAccountID
         */
        protected java.lang.String localBankAccountID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankAccountIDTracker = false;

        /**
         * field for BankAccountCurrencyCode
         */
        protected java.lang.String localBankAccountCurrencyCode;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankAccountCurrencyCodeTracker = false;

        /**
         * field for BankRoutingID
         */
        protected java.lang.String localBankRoutingID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankRoutingIDTracker = false;

        /**
         * field for BankCountryCode
         */
        protected java.lang.String localBankCountryCode;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBankCountryCodeTracker = false;

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
         * field for ExternalUser
         */
        protected java.lang.String localExternalUser;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExternalUserTracker = false;

        /**
         * field for AditionalData
         */
        protected java.lang.String localAditionalData;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAditionalDataTracker = false;

        public boolean isCardIDSpecified() {
            return localCardIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCardID() {
            return localCardID;
        }

        /**
         * Auto generated setter method
         * @param param CardID
         */
        public void setCardID(java.lang.String param) {
            localCardIDTracker = param != null;

            this.localCardID = param;
        }

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

        public boolean isBankCardProductIDSpecified() {
            return localBankCardProductIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankCardProductID() {
            return localBankCardProductID;
        }

        /**
         * Auto generated setter method
         * @param param BankCardProductID
         */
        public void setBankCardProductID(java.lang.String param) {
            localBankCardProductIDTracker = param != null;

            this.localBankCardProductID = param;
        }

        public boolean isBankCardCardHolderPartySpecified() {
            return localBankCardCardHolderPartyTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankCardCardHolderParty() {
            return localBankCardCardHolderParty;
        }

        /**
         * Auto generated setter method
         * @param param BankCardCardHolderParty
         */
        public void setBankCardCardHolderParty(java.lang.String param) {
            localBankCardCardHolderPartyTracker = param != null;

            this.localBankCardCardHolderParty = param;
        }

        public boolean isBankCardCardTypeSpecified() {
            return localBankCardCardTypeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankCardCardType() {
            return localBankCardCardType;
        }

        /**
         * Auto generated setter method
         * @param param BankCardCardType
         */
        public void setBankCardCardType(java.lang.String param) {
            localBankCardCardTypeTracker = param != null;

            this.localBankCardCardType = param;
        }

        public boolean isBankAccountIDSpecified() {
            return localBankAccountIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankAccountID() {
            return localBankAccountID;
        }

        /**
         * Auto generated setter method
         * @param param BankAccountID
         */
        public void setBankAccountID(java.lang.String param) {
            localBankAccountIDTracker = param != null;

            this.localBankAccountID = param;
        }

        public boolean isBankAccountCurrencyCodeSpecified() {
            return localBankAccountCurrencyCodeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankAccountCurrencyCode() {
            return localBankAccountCurrencyCode;
        }

        /**
         * Auto generated setter method
         * @param param BankAccountCurrencyCode
         */
        public void setBankAccountCurrencyCode(java.lang.String param) {
            localBankAccountCurrencyCodeTracker = param != null;

            this.localBankAccountCurrencyCode = param;
        }

        public boolean isBankRoutingIDSpecified() {
            return localBankRoutingIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankRoutingID() {
            return localBankRoutingID;
        }

        /**
         * Auto generated setter method
         * @param param BankRoutingID
         */
        public void setBankRoutingID(java.lang.String param) {
            localBankRoutingIDTracker = param != null;

            this.localBankRoutingID = param;
        }

        public boolean isBankCountryCodeSpecified() {
            return localBankCountryCodeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBankCountryCode() {
            return localBankCountryCode;
        }

        /**
         * Auto generated setter method
         * @param param BankCountryCode
         */
        public void setBankCountryCode(java.lang.String param) {
            localBankCountryCodeTracker = param != null;

            this.localBankCountryCode = param;
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

            if (localCardIDTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "CardID", xmlWriter);

                if (localCardID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "CardID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCardID);
                }

                xmlWriter.writeEndElement();
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

            if (localBankCardProductIDTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankCardProductID",
                    xmlWriter);

                if (localBankCardProductID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCardProductID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankCardProductID);
                }

                xmlWriter.writeEndElement();
            }

            if (localBankCardCardHolderPartyTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankCardCardHolderParty",
                    xmlWriter);

                if (localBankCardCardHolderParty == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCardCardHolderParty cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankCardCardHolderParty);
                }

                xmlWriter.writeEndElement();
            }

            if (localBankCardCardTypeTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankCardCardType", xmlWriter);

                if (localBankCardCardType == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCardCardType cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankCardCardType);
                }

                xmlWriter.writeEndElement();
            }

            if (localBankAccountIDTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankAccountID", xmlWriter);

                if (localBankAccountID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankAccountID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankAccountID);
                }

                xmlWriter.writeEndElement();
            }

            if (localBankAccountCurrencyCodeTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankAccountCurrencyCode",
                    xmlWriter);

                if (localBankAccountCurrencyCode == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankAccountCurrencyCode cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankAccountCurrencyCode);
                }

                xmlWriter.writeEndElement();
            }

            if (localBankRoutingIDTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankRoutingID", xmlWriter);

                if (localBankRoutingID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankRoutingID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankRoutingID);
                }

                xmlWriter.writeEndElement();
            }

            if (localBankCountryCodeTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "BankCountryCode", xmlWriter);

                if (localBankCountryCode == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCountryCode cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBankCountryCode);
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

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
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
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
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
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
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

            if (localCardIDTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "CardID"));

                if (localCardID != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCardID));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "CardID cannot be null!!");
                }
            }

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

            if (localBankCardProductIDTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankCardProductID"));

                if (localBankCardProductID != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankCardProductID));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCardProductID cannot be null!!");
                }
            }

            if (localBankCardCardHolderPartyTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankCardCardHolderParty"));

                if (localBankCardCardHolderParty != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankCardCardHolderParty));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCardCardHolderParty cannot be null!!");
                }
            }

            if (localBankCardCardTypeTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankCardCardType"));

                if (localBankCardCardType != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankCardCardType));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCardCardType cannot be null!!");
                }
            }

            if (localBankAccountIDTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankAccountID"));

                if (localBankAccountID != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankAccountID));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankAccountID cannot be null!!");
                }
            }

            if (localBankAccountCurrencyCodeTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankAccountCurrencyCode"));

                if (localBankAccountCurrencyCode != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankAccountCurrencyCode));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankAccountCurrencyCode cannot be null!!");
                }
            }

            if (localBankRoutingIDTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankRoutingID"));

                if (localBankRoutingID != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankRoutingID));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankRoutingID cannot be null!!");
                }
            }

            if (localBankCountryCodeTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "BankCountryCode"));

                if (localBankCountryCode != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localBankCountryCode));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "BankCountryCode cannot be null!!");
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
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
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

                                return (Execute) ExtensionMapper.getTypeObject(nsUri,
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
                                "CardID").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CardID" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCardID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankBP").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankBP" +
                                "  cannot be null");
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
                                "BankCardProductID").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankCardProductID" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankCardProductID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankCardCardHolderParty").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankCardCardHolderParty" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankCardCardHolderParty(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankCardCardType").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankCardCardType" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankCardCardType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankAccountID").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankAccountID" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankAccountID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankAccountCurrencyCode").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankAccountCurrencyCode" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankAccountCurrencyCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankRoutingID").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankRoutingID" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankRoutingID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "BankCountryCode").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BankCountryCode" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBankCountryCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "The element: " + "CMSUserId" +
                                "  cannot be null");
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

    public static class ExtensionMapper {
        public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if ("http://compartamos.com/CM/CardManagement/DE-OA-I-104".equals(
                        namespaceURI) && "wsSalida".equals(typeName)) {
                return WsSalida.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class WsSalida implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = wsSalida
           Namespace URI = http://compartamos.com/CM/CardManagement/DE-OA-I-104
           Namespace Prefix = ns1
         */

        /**
         * field for RCCode
         */
        protected long localRCCode;

        /**
         * field for RCDescription
         */
        protected java.lang.String localRCDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRCDescriptionTracker = false;

        /**
         * Auto generated getter method
         * @return long
         */
        public long getRCCode() {
            return localRCCode;
        }

        /**
         * Auto generated setter method
         * @param param RCCode
         */
        public void setRCCode(long param) {
            this.localRCCode = param;
        }

        public boolean isRCDescriptionSpecified() {
            return localRCDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRCDescription() {
            return localRCDescription;
        }

        /**
         * Auto generated setter method
         * @param param RCDescription
         */
        public void setRCDescription(java.lang.String param) {
            localRCDescriptionTracker = param != null;

            this.localRCDescription = param;
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
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":wsSalida", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "wsSalida", xmlWriter);
                }
            }

            namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
            writeStartElement(null, namespace, "RCCode", xmlWriter);

            if (localRCCode == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RCCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRCCode));
            }

            xmlWriter.writeEndElement();

            if (localRCDescriptionTracker) {
                namespace = "http://compartamos.com/CM/CardManagement/DE-OA-I-104";
                writeStartElement(null, namespace, "RCDescription", xmlWriter);

                if (localRCDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "RCDescription cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRCDescription);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
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
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
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
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
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

            elementList.add(new javax.xml.namespace.QName(
                    "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                    "RCCode"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRCCode));

            if (localRCDescriptionTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "RCDescription"));

                if (localRCDescription != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRCDescription));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "RCDescription cannot be null!!");
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
            public static WsSalida parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                WsSalida object = new WsSalida();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
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

                            if (!"wsSalida".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (WsSalida) ExtensionMapper.getTypeObject(nsUri,
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
                                "RCCode").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "RCCode" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRCCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                content));

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
                            new javax.xml.namespace.QName(
                                "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                                "RCDescription").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "RCDescription" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRCDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

    public static class ExecuteResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                "ExecuteResponse", "ns1");

        /**
         * field for ExecuteResult
         */
        protected WsSalida localExecuteResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecuteResultTracker = false;

        public boolean isExecuteResultSpecified() {
            return localExecuteResultTracker;
        }

        /**
         * Auto generated getter method
         * @return WsSalida
         */
        public WsSalida getExecuteResult() {
            return localExecuteResult;
        }

        /**
         * Auto generated setter method
         * @param param ExecuteResult
         */
        public void setExecuteResult(WsSalida param) {
            localExecuteResultTracker = param != null;

            this.localExecuteResult = param;
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
                        namespacePrefix + ":ExecuteResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ExecuteResponse", xmlWriter);
                }
            }

            if (localExecuteResultTracker) {
                if (localExecuteResult == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "ExecuteResult cannot be null!!");
                }

                localExecuteResult.serialize(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "ExecuteResult"), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
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
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
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
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
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

            if (localExecuteResultTracker) {
                elementList.add(new javax.xml.namespace.QName(
                        "http://compartamos.com/CM/CardManagement/DE-OA-I-104",
                        "ExecuteResult"));

                if (localExecuteResult == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "ExecuteResult cannot be null!!");
                }

                elementList.add(localExecuteResult);
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
            public static ExecuteResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ExecuteResponse object = new ExecuteResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
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

                            if (!"ExecuteResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ExecuteResponse) ExtensionMapper.getTypeObject(nsUri,
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
                                "ExecuteResult").equals(reader.getName())) {
                        object.setExecuteResult(WsSalida.Factory.parse(reader));

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
}
