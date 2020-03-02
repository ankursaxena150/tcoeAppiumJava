package DDDD;

import com4j.*;

/**
 * Services for managing requirements.
 */
@IID("{833093EE-C983-46F7-88BF-DE5D7E2FCBBD}")
public interface IReqFactory extends DDDD.IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Gets list of child requirements.
   * </p>
   * @param fatherID Mandatory int parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IList getChildrenList(
          int fatherID);


  /**
   * <p>
   * Gets a list of requirements containing the Pattern value in specified field.
   * </p>
   * @param startRootID Mandatory int parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   * @param pattern Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   * @param limit Optional parameter. Default value is 100
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  IList find(
          int startRootID,
          String fieldName,
          String pattern,
          @Optional @DefaultValue("0") int mode,
          @Optional @DefaultValue("100") int limit);


  /**
   * <p>
   * Builds Req summary graph.
   * </p>
   * @param xAxisField Optional parameter. Default value is ""
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildSummaryGraph(
          @Optional @DefaultValue("") String xAxisField,
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath);


  /**
   * <p>
   * Builds Req progress graph.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param byHistory Optional parameter. Default value is false
   * @param majorSkip Optional parameter. Default value is 0
   * @param minorSkip Optional parameter. Default value is 1
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildProgressGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("-1") boolean byHistory,
          @Optional @DefaultValue("0") int majorSkip,
          @Optional @DefaultValue("1") int minorSkip,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath);


  /**
   * <p>
   * Creates graph that shows the number of defect status changes over time.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildTrendGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath);


  /**
   * <p>
   * Builds Performance Graph.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildPerfGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath);


  /**
   * <p>
   * Builds Req summary graph. Extends BuildSummaryGraph with ability to display Null parent folders.
   * </p>
   * @param xAxisField Optional parameter. Default value is ""
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @param showNullParents Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildSummaryGraphEx(
          @Optional @DefaultValue("") String xAxisField,
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath,
          @Optional @DefaultValue("0") boolean showNullParents);


  /**
   * <p>
   * Builds Requirement progress graph. Extends BuildProgressGraph with ability to display Null parent folders.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param byHistory Optional parameter. Default value is false
   * @param majorSkip Optional parameter. Default value is 0
   * @param minorSkip Optional parameter. Default value is 1
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @param showNullParents Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildProgressGraphEx(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("-1") boolean byHistory,
          @Optional @DefaultValue("0") int majorSkip,
          @Optional @DefaultValue("1") int minorSkip,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath,
          @Optional @DefaultValue("0") boolean showNullParents);


  /**
   * <p>
   * Creates graph that shows the number of defect status changes over time.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @param showNullParents Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildTrendGraphEx(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath,
          @Optional @DefaultValue("0") boolean showNullParents);


  /**
   * <p>
   * Builds Performance Graph.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @param showNullParents Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildPerfGraphEx(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath,
          @Optional @DefaultValue("0") boolean showNullParents);


  // Properties:
}
