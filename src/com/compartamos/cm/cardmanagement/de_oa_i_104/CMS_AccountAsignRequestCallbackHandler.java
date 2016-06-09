/**
 * CMS_AccountAsignRequestCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.compartamos.cm.cardmanagement.de_oa_i_104;


/**
 *  CMS_AccountAsignRequestCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class CMS_AccountAsignRequestCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public CMS_AccountAsignRequestCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CMS_AccountAsignRequestCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for execute method
     * override this method for handling normal response from execute operation
     */
    public void receiveResultexecute(
        com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from execute operation
     */
    public void receiveErrorexecute(java.lang.Exception e) {
    }
}
