package DDDD;

import com4j.*;

/**
 * Services to manage defect records multi project reporting.
 */
@IID("{E556F17C-E1A2-4AB7-B957-EA480E8DEB22}")
public interface IBugFactory2 extends IBugFactory {
  // Methods:
  /**
   * <p>
   * Creates multi project summary graph either of the number of defects or the time to fix (estimated or actual).
   * </p>
   * @param xAxisField Optional parameter. Default value is ""
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param selectedProjects Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildMultiProjectSummaryGraph(
          @Optional @DefaultValue("") String xAxisField,
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("") String selectedProjects,
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
   * @param selectedProjects Optional parameter. Default value is ""
   * @param maxAge Optional parameter. Default value is 0
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildMultiProjectAgeGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("") String selectedProjects,
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
   * @param selectedProjects Optional parameter. Default value is ""
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

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildMultiProjectProgressGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("") String selectedProjects,
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
   * For HP use. Creates a graph that shows the history of changes to specific Defect fields for each time interval displayed.
   * </p>
   * @param groupByField Optional parameter. Default value is ""
   * @param sumOfField Optional parameter. Default value is ""
   * @param selectedProjects Optional parameter. Default value is ""
   * @param maxCols Optional parameter. Default value is 0
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param forceRefresh Optional parameter. Default value is false
   * @param showFullPath Optional parameter. Default value is false
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject buildMultiProjectTrendGraph(
          @Optional @DefaultValue("") String groupByField,
          @Optional @DefaultValue("") String sumOfField,
          @Optional @DefaultValue("") String selectedProjects,
          @Optional @DefaultValue("0") int maxCols,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object frDate,
          @Optional @DefaultValue("0") boolean forceRefresh,
          @Optional @DefaultValue("0") boolean showFullPath);


  // Properties:
}
