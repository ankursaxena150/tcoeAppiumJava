package DDDD;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{190E893A-6DE3-4117-A5D8-B563719B5995}")
public interface ITDConnection7 extends ITDConnection6 {
  // Methods:
  /**
   * <p>
   * The TestFolderFactory object for this connection.
   * </p>
   * <p>
   * Getter method for the COM property "TestFolderFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(206)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject testFolderFactory();


  /**
   * <p>
   * The TestLabFolderFactory object for this connection.
   * </p>
   * <p>
   * Getter method for the COM property "TestLabFolderFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(207)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject testLabFolderFactory();


  /**
   * <p>
   * For HP use. The Facet Factory object for this connection.
   * </p>
   * <p>
   * Getter method for the COM property "FacetFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(208)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject facetFactory();


  /**
   * <p>
   * For HP use. The factory that manages the analysis segments.
   * </p>
   * <p>
   * Getter method for the COM property "AnalysisSegmentFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(209)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject analysisSegmentFactory();


  /**
   * <p>
   * For HP use. Report Manager.
   * </p>
   * <p>
   * Getter method for the COM property "BusinessViewsExcelReportManager"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(210)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject businessViewsExcelReportManager();


  /**
   * <p>
   * For HP use. The factory that manages analysis item files.
   * </p>
   * <p>
   * Getter method for the COM property "AnalysisItemFileFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(211)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject analysisItemFileFactory();


  /**
   * <p>
   * For HP use. The BpStepParamFactory Factory object for this connection.
   * </p>
   * <p>
   * Getter method for the COM property "BPStepParamFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(212)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject bpStepParamFactory();


  /**
   * <p>
   * Checks if asynchronous mailing is enabled for the project.
   * </p>
   * <p>
   * Getter method for the COM property "AsyncMailEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(213)
  boolean asyncMailEnabled();


  /**
   * <p>
   * Checks if asynchronous mailing is enabled for the project.
   * </p>
   * <p>
   * Setter method for the COM property "AsyncMailEnabled"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(214)
  void asyncMailEnabled(
          boolean pVal);


  /**
   * <p>
   * For HP use. Lightweight SSO LDAP authentication token for current user.
   * </p>
   * <p>
   * Getter method for the COM property "LDAPToken"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(215)
  String ldapToken();


  // Properties:
}
