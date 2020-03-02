package DDDD;

import com4j.*;

/**
 * Services for managing automatic mail notifications.
 */
@IID("{FCA0B016-AC98-4E63-A7EE-34759BF8038C}")
public interface ITDMailConditions extends DDDD.IObjectLockingSupport {
  // Methods:
  /**
   * <p>
   * Loads Mail Conditions.
   * </p>
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void load();


  /**
   * <p>
   * The defect-matching rule.
   * </p>
   * <p>
   * Getter method for the COM property "Condition"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param isUserCondition Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  String condition(
          String name,
          boolean isUserCondition);


  /**
   * <p>
   * The defect-matching rule.
   * </p>
   * <p>
   * Setter method for the COM property "Condition"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param isUserCondition Mandatory boolean parameter.
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  void condition(
          String name,
          boolean isUserCondition,
          String pVal);


  /**
   * <p>
   * Deletes the Mail Condition.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param isUserCondition Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  void deleteCondition(
          String name,
          boolean isUserCondition);


  /**
   * <p>
   * Closes and updates Mail Condition.
   * </p>
   * @param needToSave Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  void close(
          boolean needToSave);


  /**
   * <p>
   * Gets the list of Mail Condition Users.
   * </p>
   * <p>
   * Getter method for the COM property "ItemList"
   * </p>
   * @param getRealNames Optional parameter. Default value is false
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  IList itemList(
          @Optional @DefaultValue("0") boolean getRealNames);


  // Properties:
}
