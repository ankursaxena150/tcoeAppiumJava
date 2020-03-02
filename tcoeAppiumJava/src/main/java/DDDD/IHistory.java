package DDDD;

import com4j.*;

/**
 * Obsolete. Use AuditRecord.
 */
@IID("{15FBB8D4-7034-413E-A8F0-1E03B7FA4F0B}")
public interface IHistory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Obsolete.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList newList(
          String filter);


  /**
   * <p>
   * Obsolete
   * </p>
   * <p>
   * Getter method for the COM property "Filter"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject filter();


  /**
   * <p>
   * Obsolete
   * </p>
   * @param filter Optional parameter. Default value is ""
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void clearHistory(
          @Optional @DefaultValue("") String filter);


  // Properties:
}
