/**
 * ReferenceManagerStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.tempuri;


/*
 *  ReferenceManagerStub java implementation
 */
public class ReferenceManagerStub extends org.apache.axis2.client.Stub
    implements ReferenceManager {
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
    public ReferenceManagerStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ReferenceManagerStub(
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
    }

    /**
     * Default Constructor
     */
    public ReferenceManagerStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://sl-gbeta003.compartamos.mx:210/WCFReferenceManager.ReferenceManager.svc");
    }

    /**
     * Default Constructor
     */
    public ReferenceManagerStub() throws org.apache.axis2.AxisFault {
        this(
            "http://sl-gbeta003.compartamos.mx:210/WCFReferenceManager.ReferenceManager.svc");
    }

    /**
     * Constructor taking the target endpoint
     */
    public ReferenceManagerStub(java.lang.String targetEndpoint)
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
                "ReferenceManager" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[4];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://tempuri.org/", "validateRequestReference"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://tempuri.org/", "createRequestReference"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://tempuri.org/", "queryRequestReference"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://tempuri.org/", "increaseRequestReference"));
        _service.addOperation(__operation);

        _operations[3] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see org.tempuri.ReferenceManager#validateRequestReference
     * @param executeValidate32
     * @param creationDateTime33
     * @param iD34
     * @param recipientBusinessSystemID35
     * @param recipientParty36
     * @param referenceID37
     * @param referenceUUID38
     * @param senderBusinessSystemID39
     * @param senderParty40
     * @param testDataIndicator41
     * @param uUID42
     */
    public org.tempuri.ExecuteResponse validateRequestReference(
        org.tempuri.ExecuteValidate executeValidate32,
        org.tempuri.CreationDateTime creationDateTime33, org.tempuri.ID iD34,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID35,
        org.tempuri.RecipientParty recipientParty36,
        org.tempuri.ReferenceID referenceID37,
        org.tempuri.ReferenceUUID referenceUUID38,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID39,
        org.tempuri.SenderParty senderParty40,
        org.tempuri.TestDataIndicator testDataIndicator41,
        org.tempuri.UUID uUID42) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://tempuri.org/IReferenceManager/validateRequestReference");
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
                    executeValidate32,
                    optimizeContent(
                        new javax.xml.namespace.QName("http://tempuri.org/",
                            "validateRequestReference")),
                    new javax.xml.namespace.QName("http://tempuri.org/",
                        "validateRequestReference"));

            env.build();

            // add the children only if the parameter is not null
            if (creationDateTime33 != null) {
                org.apache.axiom.om.OMElement omElementcreationDateTime33 = toOM(creationDateTime33,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementcreationDateTime33, env);
            }

            // add the children only if the parameter is not null
            if (iD34 != null) {
                org.apache.axiom.om.OMElement omElementiD34 = toOM(iD34,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementiD34, env);
            }

            // add the children only if the parameter is not null
            if (recipientBusinessSystemID35 != null) {
                org.apache.axiom.om.OMElement omElementrecipientBusinessSystemID35 =
                    toOM(recipientBusinessSystemID35,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementrecipientBusinessSystemID35, env);
            }

            // add the children only if the parameter is not null
            if (recipientParty36 != null) {
                org.apache.axiom.om.OMElement omElementrecipientParty36 = toOM(recipientParty36,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementrecipientParty36, env);
            }

            // add the children only if the parameter is not null
            if (referenceID37 != null) {
                org.apache.axiom.om.OMElement omElementreferenceID37 = toOM(referenceID37,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementreferenceID37, env);
            }

            // add the children only if the parameter is not null
            if (referenceUUID38 != null) {
                org.apache.axiom.om.OMElement omElementreferenceUUID38 = toOM(referenceUUID38,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementreferenceUUID38, env);
            }

            // add the children only if the parameter is not null
            if (senderBusinessSystemID39 != null) {
                org.apache.axiom.om.OMElement omElementsenderBusinessSystemID39 = toOM(senderBusinessSystemID39,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementsenderBusinessSystemID39, env);
            }

            // add the children only if the parameter is not null
            if (senderParty40 != null) {
                org.apache.axiom.om.OMElement omElementsenderParty40 = toOM(senderParty40,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementsenderParty40, env);
            }

            // add the children only if the parameter is not null
            if (testDataIndicator41 != null) {
                org.apache.axiom.om.OMElement omElementtestDataIndicator41 = toOM(testDataIndicator41,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementtestDataIndicator41, env);
            }

            // add the children only if the parameter is not null
            if (uUID42 != null) {
                org.apache.axiom.om.OMElement omElementuUID42 = toOM(uUID42,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "validateRequestReference")));
                addHeader(omElementuUID42, env);
            }

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
                    org.tempuri.ExecuteResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (org.tempuri.ExecuteResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "validateRequestReference"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "validateRequestReference"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "validateRequestReference"));
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
     * Auto generated method signature
     *
     * @see org.tempuri.ReferenceManager#createRequestReference
     * @param executeCreate44
     * @param creationDateTime45
     * @param iD46
     * @param recipientBusinessSystemID47
     * @param recipientParty48
     * @param referenceID49
     * @param referenceUUID50
     * @param senderBusinessSystemID51
     * @param senderParty52
     * @param testDataIndicator53
     * @param uUID54
     */
    public org.tempuri.ExecuteResponse createRequestReference(
        axis2.apache.org.ExecuteCreate executeCreate44,
        org.tempuri.CreationDateTime creationDateTime45, org.tempuri.ID iD46,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID47,
        org.tempuri.RecipientParty recipientParty48,
        org.tempuri.ReferenceID referenceID49,
        org.tempuri.ReferenceUUID referenceUUID50,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID51,
        org.tempuri.SenderParty senderParty52,
        org.tempuri.TestDataIndicator testDataIndicator53,
        org.tempuri.UUID uUID54) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("http://tempuri.org/IReferenceManager/createRequestReference");
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
                    executeCreate44,
                    optimizeContent(
                        new javax.xml.namespace.QName("http://tempuri.org/",
                            "createRequestReference")),
                    new javax.xml.namespace.QName("http://tempuri.org/",
                        "createRequestReference"));

            env.build();

            // add the children only if the parameter is not null
            if (creationDateTime45 != null) {
                org.apache.axiom.om.OMElement omElementcreationDateTime45 = toOM(creationDateTime45,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementcreationDateTime45, env);
            }

            // add the children only if the parameter is not null
            if (iD46 != null) {
                org.apache.axiom.om.OMElement omElementiD46 = toOM(iD46,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementiD46, env);
            }

            // add the children only if the parameter is not null
            if (recipientBusinessSystemID47 != null) {
                org.apache.axiom.om.OMElement omElementrecipientBusinessSystemID47 =
                    toOM(recipientBusinessSystemID47,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementrecipientBusinessSystemID47, env);
            }

            // add the children only if the parameter is not null
            if (recipientParty48 != null) {
                org.apache.axiom.om.OMElement omElementrecipientParty48 = toOM(recipientParty48,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementrecipientParty48, env);
            }

            // add the children only if the parameter is not null
            if (referenceID49 != null) {
                org.apache.axiom.om.OMElement omElementreferenceID49 = toOM(referenceID49,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementreferenceID49, env);
            }

            // add the children only if the parameter is not null
            if (referenceUUID50 != null) {
                org.apache.axiom.om.OMElement omElementreferenceUUID50 = toOM(referenceUUID50,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementreferenceUUID50, env);
            }

            // add the children only if the parameter is not null
            if (senderBusinessSystemID51 != null) {
                org.apache.axiom.om.OMElement omElementsenderBusinessSystemID51 = toOM(senderBusinessSystemID51,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementsenderBusinessSystemID51, env);
            }

            // add the children only if the parameter is not null
            if (senderParty52 != null) {
                org.apache.axiom.om.OMElement omElementsenderParty52 = toOM(senderParty52,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementsenderParty52, env);
            }

            // add the children only if the parameter is not null
            if (testDataIndicator53 != null) {
                org.apache.axiom.om.OMElement omElementtestDataIndicator53 = toOM(testDataIndicator53,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementtestDataIndicator53, env);
            }

            // add the children only if the parameter is not null
            if (uUID54 != null) {
                org.apache.axiom.om.OMElement omElementuUID54 = toOM(uUID54,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "createRequestReference")));
                addHeader(omElementuUID54, env);
            }

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
                    org.tempuri.ExecuteResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (org.tempuri.ExecuteResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "createRequestReference"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "createRequestReference"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "createRequestReference"));
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
     * Auto generated method signature
     *
     * @see org.tempuri.ReferenceManager#queryRequestReference
     * @param executeQuery56
     * @param creationDateTime57
     * @param iD58
     * @param recipientBusinessSystemID59
     * @param recipientParty60
     * @param referenceID61
     * @param referenceUUID62
     * @param senderBusinessSystemID63
     * @param senderParty64
     * @param testDataIndicator65
     * @param uUID66
     */
    public org.tempuri.ExecuteQueryResponse queryRequestReference(
        org.tempuri.ExecuteQuery executeQuery56,
        org.tempuri.CreationDateTime creationDateTime57, org.tempuri.ID iD58,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID59,
        org.tempuri.RecipientParty recipientParty60,
        org.tempuri.ReferenceID referenceID61,
        org.tempuri.ReferenceUUID referenceUUID62,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID63,
        org.tempuri.SenderParty senderParty64,
        org.tempuri.TestDataIndicator testDataIndicator65,
        org.tempuri.UUID uUID66) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("http://tempuri.org/IReferenceManager/queryRequestReference");
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
                    executeQuery56,
                    optimizeContent(
                        new javax.xml.namespace.QName("http://tempuri.org/",
                            "queryRequestReference")),
                    new javax.xml.namespace.QName("http://tempuri.org/",
                        "queryRequestReference"));

            env.build();

            // add the children only if the parameter is not null
            if (creationDateTime57 != null) {
                org.apache.axiom.om.OMElement omElementcreationDateTime57 = toOM(creationDateTime57,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementcreationDateTime57, env);
            }

            // add the children only if the parameter is not null
            if (iD58 != null) {
                org.apache.axiom.om.OMElement omElementiD58 = toOM(iD58,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementiD58, env);
            }

            // add the children only if the parameter is not null
            if (recipientBusinessSystemID59 != null) {
                org.apache.axiom.om.OMElement omElementrecipientBusinessSystemID59 =
                    toOM(recipientBusinessSystemID59,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementrecipientBusinessSystemID59, env);
            }

            // add the children only if the parameter is not null
            if (recipientParty60 != null) {
                org.apache.axiom.om.OMElement omElementrecipientParty60 = toOM(recipientParty60,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementrecipientParty60, env);
            }

            // add the children only if the parameter is not null
            if (referenceID61 != null) {
                org.apache.axiom.om.OMElement omElementreferenceID61 = toOM(referenceID61,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementreferenceID61, env);
            }

            // add the children only if the parameter is not null
            if (referenceUUID62 != null) {
                org.apache.axiom.om.OMElement omElementreferenceUUID62 = toOM(referenceUUID62,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementreferenceUUID62, env);
            }

            // add the children only if the parameter is not null
            if (senderBusinessSystemID63 != null) {
                org.apache.axiom.om.OMElement omElementsenderBusinessSystemID63 = toOM(senderBusinessSystemID63,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementsenderBusinessSystemID63, env);
            }

            // add the children only if the parameter is not null
            if (senderParty64 != null) {
                org.apache.axiom.om.OMElement omElementsenderParty64 = toOM(senderParty64,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementsenderParty64, env);
            }

            // add the children only if the parameter is not null
            if (testDataIndicator65 != null) {
                org.apache.axiom.om.OMElement omElementtestDataIndicator65 = toOM(testDataIndicator65,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementtestDataIndicator65, env);
            }

            // add the children only if the parameter is not null
            if (uUID66 != null) {
                org.apache.axiom.om.OMElement omElementuUID66 = toOM(uUID66,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/", "queryRequestReference")));
                addHeader(omElementuUID66, env);
            }

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
                    org.tempuri.ExecuteQueryResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (org.tempuri.ExecuteQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "queryRequestReference"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "queryRequestReference"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "queryRequestReference"));
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
     * Auto generated method signature
     *
     * @see org.tempuri.ReferenceManager#increaseRequestReference
     * @param executeIncrease68
     * @param creationDateTime69
     * @param iD70
     * @param recipientBusinessSystemID71
     * @param recipientParty72
     * @param referenceID73
     * @param referenceUUID74
     * @param senderBusinessSystemID75
     * @param senderParty76
     * @param testDataIndicator77
     * @param uUID78
     */
    public org.tempuri.ExecuteResponse increaseRequestReference(
        org.tempuri.ExecuteIncrease executeIncrease68,
        org.tempuri.CreationDateTime creationDateTime69, org.tempuri.ID iD70,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID71,
        org.tempuri.RecipientParty recipientParty72,
        org.tempuri.ReferenceID referenceID73,
        org.tempuri.ReferenceUUID referenceUUID74,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID75,
        org.tempuri.SenderParty senderParty76,
        org.tempuri.TestDataIndicator testDataIndicator77,
        org.tempuri.UUID uUID78) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("http://tempuri.org/IReferenceManager/increaseRequestReference");
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
                    executeIncrease68,
                    optimizeContent(
                        new javax.xml.namespace.QName("http://tempuri.org/",
                            "increaseRequestReference")),
                    new javax.xml.namespace.QName("http://tempuri.org/",
                        "increaseRequestReference"));

            env.build();

            // add the children only if the parameter is not null
            if (creationDateTime69 != null) {
                org.apache.axiom.om.OMElement omElementcreationDateTime69 = toOM(creationDateTime69,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementcreationDateTime69, env);
            }

            // add the children only if the parameter is not null
            if (iD70 != null) {
                org.apache.axiom.om.OMElement omElementiD70 = toOM(iD70,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementiD70, env);
            }

            // add the children only if the parameter is not null
            if (recipientBusinessSystemID71 != null) {
                org.apache.axiom.om.OMElement omElementrecipientBusinessSystemID71 =
                    toOM(recipientBusinessSystemID71,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementrecipientBusinessSystemID71, env);
            }

            // add the children only if the parameter is not null
            if (recipientParty72 != null) {
                org.apache.axiom.om.OMElement omElementrecipientParty72 = toOM(recipientParty72,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementrecipientParty72, env);
            }

            // add the children only if the parameter is not null
            if (referenceID73 != null) {
                org.apache.axiom.om.OMElement omElementreferenceID73 = toOM(referenceID73,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementreferenceID73, env);
            }

            // add the children only if the parameter is not null
            if (referenceUUID74 != null) {
                org.apache.axiom.om.OMElement omElementreferenceUUID74 = toOM(referenceUUID74,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementreferenceUUID74, env);
            }

            // add the children only if the parameter is not null
            if (senderBusinessSystemID75 != null) {
                org.apache.axiom.om.OMElement omElementsenderBusinessSystemID75 = toOM(senderBusinessSystemID75,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementsenderBusinessSystemID75, env);
            }

            // add the children only if the parameter is not null
            if (senderParty76 != null) {
                org.apache.axiom.om.OMElement omElementsenderParty76 = toOM(senderParty76,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementsenderParty76, env);
            }

            // add the children only if the parameter is not null
            if (testDataIndicator77 != null) {
                org.apache.axiom.om.OMElement omElementtestDataIndicator77 = toOM(testDataIndicator77,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementtestDataIndicator77, env);
            }

            // add the children only if the parameter is not null
            if (uUID78 != null) {
                org.apache.axiom.om.OMElement omElementuUID78 = toOM(uUID78,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://tempuri.org/",
                                "increaseRequestReference")));
                addHeader(omElementuUID78, env);
            }

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
                    org.tempuri.ExecuteResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (org.tempuri.ExecuteResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "increaseRequestReference"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "increaseRequestReference"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "increaseRequestReference"));
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

    //http://sl-gbeta003.compartamos.mx:210/WCFReferenceManager.ReferenceManager.svc
    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.ExecuteValidate param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ExecuteValidate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.ExecuteResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ExecuteResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.CreationDateTime param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.CreationDateTime.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(org.tempuri.ID param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.RecipientBusinessSystemID param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.RecipientBusinessSystemID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.RecipientParty param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.RecipientParty.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(org.tempuri.ReferenceID param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ReferenceID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.ReferenceUUID param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ReferenceUUID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.SenderBusinessSystemID param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.SenderBusinessSystemID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(org.tempuri.SenderParty param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.SenderParty.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.TestDataIndicator param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.TestDataIndicator.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(org.tempuri.UUID param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.UUID.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        axis2.apache.org.ExecuteCreate param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(axis2.apache.org.ExecuteCreate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(org.tempuri.ExecuteQuery param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ExecuteQuery.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.ExecuteQueryResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ExecuteQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.tempuri.ExecuteIncrease param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.tempuri.ExecuteIncrease.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.tempuri.ExecuteValidate param, boolean optimizeContent,
        javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.tempuri.ExecuteValidate.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        axis2.apache.org.ExecuteCreate param, boolean optimizeContent,
        javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    axis2.apache.org.ExecuteCreate.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.tempuri.ExecuteQuery param, boolean optimizeContent,
        javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.tempuri.ExecuteQuery.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.tempuri.ExecuteIncrease param, boolean optimizeContent,
        javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.tempuri.ExecuteIncrease.MY_QNAME, factory));

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
            if (axis2.apache.org.ExecuteCreate.class.equals(type)) {
                return axis2.apache.org.ExecuteCreate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.CreationDateTime.class.equals(type)) {
                return org.tempuri.CreationDateTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ExecuteIncrease.class.equals(type)) {
                return org.tempuri.ExecuteIncrease.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ExecuteQuery.class.equals(type)) {
                return org.tempuri.ExecuteQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ExecuteQueryResponse.class.equals(type)) {
                return org.tempuri.ExecuteQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ExecuteResponse.class.equals(type)) {
                return org.tempuri.ExecuteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ExecuteValidate.class.equals(type)) {
                return org.tempuri.ExecuteValidate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ID.class.equals(type)) {
                return org.tempuri.ID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.RecipientBusinessSystemID.class.equals(type)) {
                return org.tempuri.RecipientBusinessSystemID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.RecipientParty.class.equals(type)) {
                return org.tempuri.RecipientParty.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ReferenceID.class.equals(type)) {
                return org.tempuri.ReferenceID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.ReferenceUUID.class.equals(type)) {
                return org.tempuri.ReferenceUUID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.SenderBusinessSystemID.class.equals(type)) {
                return org.tempuri.SenderBusinessSystemID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.SenderParty.class.equals(type)) {
                return org.tempuri.SenderParty.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.TestDataIndicator.class.equals(type)) {
                return org.tempuri.TestDataIndicator.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.tempuri.UUID.class.equals(type)) {
                return org.tempuri.UUID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
