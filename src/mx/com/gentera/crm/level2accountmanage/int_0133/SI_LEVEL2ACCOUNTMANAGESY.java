/**
 * SI_LEVEL2ACCOUNTMANAGESY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package mx.com.gentera.crm.level2accountmanage.int_0133;


/*
 *  SI_LEVEL2ACCOUNTMANAGESY java interface
 */
public interface SI_LEVEL2ACCOUNTMANAGESY {
    /**
     * Auto generated method signature
     *
     * @param mT_Level2AccountCreationReq_sync
     * @throws mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData :
     */
    public mx.com.gentera.global.MT_Level2AccountCreationResp_sync createLevel2Account(
        mx.com.gentera.global.MT_Level2AccountCreationReq_sync mT_Level2AccountCreationReq_sync)
        throws java.rmi.RemoteException,
            mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData;

    //
}
