package DDDD;

import com4j.IID;
import com4j.VTID;

/**
 * TDFilter Internal functionality
 */
@IID("{EA4B3846-4AA2-4C98-8FE6-4FAE5DFE842F}")
public interface _IDateConverter2 extends _IDateConverter {
  // Methods:
  /**
   * <p>
   * Converts date format from visual to logical.
   * </p>
   * @param fieldType Mandatory int parameter.
   * @param skipEqualityInVerification Mandatory boolean parameter.
   * @param visualDate Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(5)
  String convertVisualToLogicalDateType(
          int fieldType,
          boolean skipEqualityInVerification,
          String visualDate);


  /**
   * <p>
   * Converts date format from logical to visual.
   * </p>
   * @param fieldType Mandatory int parameter.
   * @param skipEqualityInVerification Mandatory boolean parameter.
   * @param logicalDate Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(6)
  String convertLogicalToVisualDateType(
          int fieldType,
          boolean skipEqualityInVerification,
          String logicalDate);


  // Properties:
}
