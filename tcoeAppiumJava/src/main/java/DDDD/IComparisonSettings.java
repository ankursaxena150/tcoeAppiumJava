package DDDD;

import com4j.*;

/**
 * For HP use. Represents comparison settings for a single entitylink type.
 */
@IID("{45FF281C-B518-494A-A720-392B36BD7729}")
public interface IComparisonSettings extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns a copy of The Name of the Type of the compared element.
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String type();


  /**
   * <p>
   * Returns a copy of The list of the fields to be considered for the comparison.
   * </p>
   * <p>
   * Getter method for the COM property "Fields"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  IList fields();


  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object fields(
          int index);

  /**
   * <p>
   * Checks if attachments are considered for this comparison.
   * </p>
   * <p>
   * Getter method for the COM property "Attachments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean attachments();


  /**
   * <p>
   * Checks if rich content is considered for this comparison.
   * </p>
   * <p>
   * Getter method for the COM property "RichContent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  boolean richContent();


  // Properties:
}
