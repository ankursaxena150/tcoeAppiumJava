package DDDD;

import com4j.*;

/**
 * For HP use. extends IBaseEntityFolder since Maya SP1
 */
@IID("{872D0FE9-2155-40CE-BA6F-2312425EE646}")
public interface IBaseEntityFolder2 extends IBaseEntityFolder {
  // Methods:
  /**
   * <p>
   * Indicates whether to make the item changeable to other users automatically after a Refresh or Post.
   * </p>
   * <p>
   * Getter method for the COM property "Modified"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(38)
  boolean modified();


  /**
   * <p>
   * Indicates whether the given field is modified, optionally returning the original field value.
   * </p>
   * @param fieldName Mandatory java.lang.String parameter.
   * @param oldFieldValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean isFieldModified(
          String fieldName,
          @Optional Object oldFieldValue);


  /**
   * <p>
   * Verifies if the given value can be put in the given field. The checks are local, i.e. no round trips are made.
   * </p>
   * @param fieldName Mandatory java.lang.String parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(40)
  boolean verifyPutFieldWithErrorOnFail(
          String fieldName,
          @MarshalAs(NativeType.VARIANT) Object newVal);


  // Properties:
}
