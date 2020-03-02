package DDDD;

import com4j.*;

/**
 * Services for managing requirements.
 */
@IID("{FDF842AD-361C-4F9A-82E6-6A2DB156FD27}")
public interface IReqFactory3 extends IReqFactory2 {
  // Methods:
  /**
   * <p>
   * Returns the list of requirements either traced directly from or directly to the specified requirement.
   * </p>
   * @param reqID Mandatory int parameter.
   * @param traceDirection Mandatory int parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(28)
  IList getTracedList(
          int reqID,
          int traceDirection);


  /**
   * <p>
   * Returns the list of requirement customization types.
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(29)
  IList getRequirementTypes();


  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object getRequirementTypes(
          int index);

  /**
   * <p>
   * Returns the requirement customization type object specified by the type ID.
   * </p>
   * @param typeId Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getRequirementType(
          String typeId);


  /**
   * <p>
   * Returns the name of the requirement type specified by the type ID.
   * </p>
   * @param typeId Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(31)
  String reqTypeIdToName(
          int typeId);


  /**
   * <p>
   * For HP use. Returns a list of ReqSummaryStatus objects depending on the list of ids and filter.
   * </p>
   * @param reqIDs Mandatory java.lang.String parameter.
   * @param filter Mandatory java.lang.String parameter.
   * @param coverageByCycles Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(32)
  IList getRequirementsSummaryStatus(
          String reqIDs,
          String filter,
          IList coverageByCycles);


  /**
   * <p>
   * For HP use.Returns a list of Requirements depending on their status, the list of cycles and the filter.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @param status Mandatory java.lang.String parameter.
   * @param coverageByCycles Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(33)
  IList getRequirementsByStatus(
          String filter,
          String status,
          IList coverageByCycles);


  /**
   * <p>
   * Returns the list of tests that cover the requirements that match the requirement filter.
   * </p>
   * @param reqFilter Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(34)
  IList getCoverageTestsByReqFilter(
          String reqFilter);


  // Properties:
}
