package DDDD;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;

/**
 * Services for moving requirements.
 */
@IID("{B496D843-987D-4498-B10D-EE9CD66045B6}")
public interface IReqFactory5 extends IReqFactory4 {
  // Methods:
  /**
   * <p>
   * Moves the requirements to be child nodes of the specified parent.
   * </p>
   * @param reqIDs Mandatory java.lang.String parameter.
   * @param newPositions Mandatory java.lang.String parameter.
   * @param newParentId Mandatory int parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(38)
  void moveRequirements(
          String reqIDs,
          String newPositions,
          int newParentId);


  /**
   * <p>
   * For HP use. A filter must be passed, also at least one traceability matrix relation setting.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @param relationSettings Mandatory DDDD.IList parameter.
   * @param statistics Mandatory Holder<DDDD.IList> parameter.
   * @param rows Mandatory Holder<DDDD.IList> parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(39)
  IList calculateTraceabilityMatrix(
          String filter,
          IList relationSettings,
          Holder<IList> statistics,
          Holder<IList> rows);


  /**
   * <p>
   * For HP use.
   * </p>
   * @param relationName Mandatory java.lang.String parameter.
   * @param logicalCondition Mandatory java.lang.String parameter.
   * @param existInIds Mandatory boolean parameter.
   * @param filter Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.ITraceabilityMatrixRelationSettings
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(40)
  DDDD.ITraceabilityMatrixRelationSettings createTraceabilityMatrixRelationSettings(
          String relationName,
          String logicalCondition,
          boolean existInIds,
          String filter);


  /**
   * <p>
   * For HP use.
   * </p>
   * @param settings Mandatory DDDD.ITraceabilityMatrixRelationSettings parameter.
   * @param reqID Mandatory int parameter.
   * @param tableName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(41)
  IList getLinkedEntities(
          DDDD.ITraceabilityMatrixRelationSettings settings,
          int reqID,
          Holder<String> tableName);


  /**
   * <p>
   * For HP use.
   * </p>
   * @param reqIDs Mandatory java.lang.String parameter.
   * @param relationSettings Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(42)
  IList getAllLinkedEntities(
          String reqIDs,
          IList relationSettings);


  /**
   * <p>
   * For HP use.
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(43)
  String downloadExportTraceabilityMatrixTemplateFile();


  /**
   * <p>
   * Returns the list of test configurations that cover the requirements that match the requirement filter.
   * </p>
   * @param reqFilter Mandatory java.lang.String parameter.
   * @param testIDs Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(44)
  IList getCoverageTestConfigsByReqFilter(
          String reqFilter,
          String testIDs);


  // Properties:
}
