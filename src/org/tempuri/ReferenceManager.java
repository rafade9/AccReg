/**
 * ReferenceManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.tempuri;


/*
 *  ReferenceManager java interface
 */
public interface ReferenceManager {
    /**
     * Auto generated method signature
     *
     * @param executeValidate
     * @param creationDateTime
     * @param iD
     * @param recipientBusinessSystemID
     * @param recipientParty
     * @param referenceID
     * @param referenceUUID
     * @param senderBusinessSystemID
     * @param senderParty
     * @param testDataIndicator
     * @param uUID
     */
    public org.tempuri.ExecuteResponse validateRequestReference(
        org.tempuri.ExecuteValidate executeValidate,
        org.tempuri.CreationDateTime creationDateTime, org.tempuri.ID iD,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID,
        org.tempuri.RecipientParty recipientParty,
        org.tempuri.ReferenceID referenceID,
        org.tempuri.ReferenceUUID referenceUUID,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID,
        org.tempuri.SenderParty senderParty,
        org.tempuri.TestDataIndicator testDataIndicator, org.tempuri.UUID uUID)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param executeCreate
     * @param creationDateTime0
     * @param iD1
     * @param recipientBusinessSystemID2
     * @param recipientParty3
     * @param referenceID4
     * @param referenceUUID5
     * @param senderBusinessSystemID6
     * @param senderParty7
     * @param testDataIndicator8
     * @param uUID9
     */
    public org.tempuri.ExecuteResponse createRequestReference(
        axis2.apache.org.ExecuteCreate executeCreate,
        org.tempuri.CreationDateTime creationDateTime0, org.tempuri.ID iD1,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID2,
        org.tempuri.RecipientParty recipientParty3,
        org.tempuri.ReferenceID referenceID4,
        org.tempuri.ReferenceUUID referenceUUID5,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID6,
        org.tempuri.SenderParty senderParty7,
        org.tempuri.TestDataIndicator testDataIndicator8, org.tempuri.UUID uUID9)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param executeQuery
     * @param creationDateTime11
     * @param iD12
     * @param recipientBusinessSystemID13
     * @param recipientParty14
     * @param referenceID15
     * @param referenceUUID16
     * @param senderBusinessSystemID17
     * @param senderParty18
     * @param testDataIndicator19
     * @param uUID20
     */
    public org.tempuri.ExecuteQueryResponse queryRequestReference(
        org.tempuri.ExecuteQuery executeQuery,
        org.tempuri.CreationDateTime creationDateTime11, org.tempuri.ID iD12,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID13,
        org.tempuri.RecipientParty recipientParty14,
        org.tempuri.ReferenceID referenceID15,
        org.tempuri.ReferenceUUID referenceUUID16,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID17,
        org.tempuri.SenderParty senderParty18,
        org.tempuri.TestDataIndicator testDataIndicator19,
        org.tempuri.UUID uUID20) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param executeIncrease
     * @param creationDateTime21
     * @param iD22
     * @param recipientBusinessSystemID23
     * @param recipientParty24
     * @param referenceID25
     * @param referenceUUID26
     * @param senderBusinessSystemID27
     * @param senderParty28
     * @param testDataIndicator29
     * @param uUID30
     */
    public org.tempuri.ExecuteResponse increaseRequestReference(
        org.tempuri.ExecuteIncrease executeIncrease,
        org.tempuri.CreationDateTime creationDateTime21, org.tempuri.ID iD22,
        org.tempuri.RecipientBusinessSystemID recipientBusinessSystemID23,
        org.tempuri.RecipientParty recipientParty24,
        org.tempuri.ReferenceID referenceID25,
        org.tempuri.ReferenceUUID referenceUUID26,
        org.tempuri.SenderBusinessSystemID senderBusinessSystemID27,
        org.tempuri.SenderParty senderParty28,
        org.tempuri.TestDataIndicator testDataIndicator29,
        org.tempuri.UUID uUID30) throws java.rmi.RemoteException;

    //
}
