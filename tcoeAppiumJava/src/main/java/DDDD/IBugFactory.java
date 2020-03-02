package DDDD;

import com4j.*;

/**
 * Services to manage defect records.
 */
@IID("{E46670F8-B7CE-4DA6-AC5F-AE1FB9181337}")
public interface IBugFactory extends DDDD.IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Creates a summary graph either of the number of defects or the time to fix (estimated or actual).
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

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
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
   * Creates a graph that shows the lifetime of defects.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param maxAge Optional parameter. Default value is 0
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildAgeGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("0") int maxAge,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath);


  /**
   * <p>
   * Creates a graph showing status at specific points: either defect accumulation or  time to fix (estimated or actual).
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

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
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
   * Searches defect summaries and descriptions for matches to Pattern.
   * </p>
   * @param pattern Mandatory java.lang.String parameter.
   * @param similarityRatio Optional parameter. Default value is 10
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  IList findSimilarBugs(
          String pattern,
          @Optional @DefaultValue("10") int similarityRatio);


  /**
   * <p>
   * Creates a graph that shows the history of changes to specific Defect fields for each time interval displayed.
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
   * Obsolete. Do not invoke.
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


  // Properties:
}
