package DDDD;

import com4j.*;

/**
 * Represents a graph built through a method.
 */
@IID("{16D6E6A8-E711-40AE-9B22-9471B1DC6F8C}")
public interface IGraph3 extends IGraph2 {
  // Methods:
  /**
   * <p>
   * Request for drill down data. Pass entity type and a list of IDs and get a list of entities (as in NewList request)
   * </p>
   * @param entityType Mandatory java.lang.String parameter.
   * @param idList Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  IList drillDownData(
          String entityType,
          String idList);


  /**
   * <p>
   * Cross project graph data drill-down.
   * </p>
   * @param areas Mandatory java.lang.Object parameter.
   * @param parameterMap Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  IList crossDrillDownEx(
          @MarshalAs(NativeType.VARIANT) Object areas,
          @MarshalAs(NativeType.Dispatch) Com4jObject parameterMap);


  // Properties:
}
