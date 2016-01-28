/**
 * SI_LEVEL2ACCOUNTMANAGESYStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package mx.com.gentera.crm.level2accountmanage.int_0133;


/*
 *  SI_LEVEL2ACCOUNTMANAGESYStub java implementation
 */
public class SI_LEVEL2ACCOUNTMANAGESYStub extends org.apache.axis2.client.Stub
    implements SI_LEVEL2ACCOUNTMANAGESY {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    /////////////////////////////////////////////////////////////////////////
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public SI_LEVEL2ACCOUNTMANAGESYStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public SI_LEVEL2ACCOUNTMANAGESYStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _service.applyPolicy();

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
    public SI_LEVEL2ACCOUNTMANAGESYStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://bcbeta160.compartamos.mx:8443/sap/bc/srt/xip/cbcr/si_level2accountmanagesy/200/si_level2accountmanagesy/ssl");
    }

    /**
     * Default Constructor
     */
    public SI_LEVEL2ACCOUNTMANAGESYStub() throws org.apache.axis2.AxisFault {
        this(
            "https://bcbeta160.compartamos.mx:8443/sap/bc/srt/xip/cbcr/si_level2accountmanagesy/200/si_level2accountmanagesy/ssl");
    }

    /**
     * Constructor taking the target endpoint
     */
    public SI_LEVEL2ACCOUNTMANAGESYStub(java.lang.String targetEndpoint)
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
                "SI_LEVEL2ACCOUNTMANAGESY" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://gentera.com.mx/CRM/Level2AccountManage/INT-0133",
                "createLevel2Account"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"f93ff9e0385e112ac35d0a571afbc3b2cc4570c2c4c17f1a\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\"></saptrnbnd:OptimizedXMLTransfer><wsoma:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:wsoma=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"/><sapattahnd:Enabled xmlns:sapattahnd=\"http://www.sap.com/710/features/attachment/\">false</sapattahnd:Enabled><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpBasicAuthentication/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"f93ff9e0385e112ac35d0a571afbc3b2cc4570c2c4c17f1a\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\"></saptrnbnd:OptimizedXMLTransfer><wsoma:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:wsoma=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"/><sapattahnd:Enabled xmlns:sapattahnd=\"http://www.sap.com/710/features/attachment/\">false</sapattahnd:Enabled><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpBasicAuthentication/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://compartamos.com/global",
                    "ExchangeFaultData"), "CreateLevel2Account"),
            "mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://compartamos.com/global",
                    "ExchangeFaultData"), "CreateLevel2Account"),
            "mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("http://compartamos.com/global",
                    "ExchangeFaultData"), "CreateLevel2Account"),
            "com.compartamos.global.ExchangeFaultData");
    }

    /**
     * Auto generated method signature
     *
     * @see mx.com.gentera.crm.level2accountmanage.int_0133.SI_LEVEL2ACCOUNTMANAGESY#createLevel2Account
     * @param mT_Level2AccountCreationReq_sync0
     * @throws mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData :
     */
    public mx.com.gentera.global.MT_Level2AccountCreationResp_sync createLevel2Account(
        mx.com.gentera.global.MT_Level2AccountCreationReq_sync mT_Level2AccountCreationReq_sync0)
        throws java.rmi.RemoteException,
            mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://gentera.com.mx/CRM/Level2AccountManage/INT-0133/SI_Level2AccountManageSyncIn/CreateLevel2AccountRequest");
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
                    mT_Level2AccountCreationReq_sync0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://gentera.com.mx/CRM/Level2AccountManage/INT-0133",
                            "createLevel2Account")),
                    new javax.xml.namespace.QName(
                        "http://gentera.com.mx/CRM/Level2AccountManage/INT-0133",
                        "createLevel2Account"));

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
                    mx.com.gentera.global.MT_Level2AccountCreationResp_sync.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (mx.com.gentera.global.MT_Level2AccountCreationResp_sync) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CreateLevel2Account"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateLevel2Account"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateLevel2Account"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData) {
                            throw (mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData) ex;
                        }

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

    ////////////////////////////////////////////////////////////////////////
    private static org.apache.neethi.Policy getPolicy(
        java.lang.String policyString) {
        return org.apache.neethi.PolicyEngine.getPolicy(org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                new java.io.StringReader(policyString)).getDocument()
                                                                                               .getXMLStreamReader(false));
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

    //https://bcbeta160.compartamos.mx:8443/sap/bc/srt/xip/cbcr/si_level2accountmanagesy/200/si_level2accountmanagesy/ssl
    private org.apache.axiom.om.OMElement toOM(
        mx.com.gentera.global.MT_Level2AccountCreationReq_sync param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(mx.com.gentera.global.MT_Level2AccountCreationReq_sync.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        mx.com.gentera.global.MT_Level2AccountCreationResp_sync param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(mx.com.gentera.global.MT_Level2AccountCreationResp_sync.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.compartamos.global.ExchangeFaultData param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.compartamos.global.ExchangeFaultData.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        mx.com.gentera.global.MT_Level2AccountCreationReq_sync param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    mx.com.gentera.global.MT_Level2AccountCreationReq_sync.MY_QNAME,
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
            if (com.compartamos.global.ExchangeFaultData.class.equals(type)) {
                return com.compartamos.global.ExchangeFaultData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (mx.com.gentera.global.MT_Level2AccountCreationReq_sync.class.equals(
                        type)) {
                return mx.com.gentera.global.MT_Level2AccountCreationReq_sync.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (mx.com.gentera.global.MT_Level2AccountCreationResp_sync.class.equals(
                        type)) {
                return mx.com.gentera.global.MT_Level2AccountCreationResp_sync.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
