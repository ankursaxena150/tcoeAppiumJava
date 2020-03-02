package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a basic data field or entity, such as an attachment.
 */
@IID("{BE73DDAA-AD0F-4A89-8936-0EDA17599273}")
public interface IBaseField2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Indicates whether to make the item changeable to other users automatically after a Refresh or Post.
   * </p>
   * <p>
   * Getter method for the COM property "AutoUnlock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean autoUnlock();


  /**
   * <p>
   * Indicates whether to make the item changeable to other users automatically after a Refresh or Post.
   * </p>
   * <p>
   * Setter method for the COM property "AutoUnlock"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void autoUnlock(
          boolean pVal);


  /**
   * <p>
   * The MultiValue object of the specified field.
   * </p>
   * <p>
   * Getter method for the COM property "FieldMultiValue"
   * </p>
   * @param fieldName Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IMultiValue
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  DDDD.IMultiValue fieldMultiValue(
          String fieldName);


  /**
   * <p>
   * The MultiValue object of the specified field.
   * </p>
   * <p>
   * Setter method for the COM property "FieldMultiValue"
   * </p>
   * @param fieldName Mandatory java.lang.String parameter.
   * @param pMultiValue Mandatory DDDD.IMultiValue parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void fieldMultiValue(
          String fieldName,
          DDDD.IMultiValue pMultiValue);


  // Properties:
}
