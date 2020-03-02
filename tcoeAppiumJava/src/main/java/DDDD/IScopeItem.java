package DDDD;

import com4j.*;

/**
 * For HP use. Represents a ScopeItem.
 */
@IID("{943D95BA-6E71-4629-B932-92638740AF75}")
public interface IScopeItem extends DDDD.IBaseFieldEx {
  // Methods:
  /**
   * <p>
   * The scope item's name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  String name();


  /**
   * <p>
   * The scope item's name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  void name(
          String pVal);


  /**
   * <p>
   * The scope item's description.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  String description();


  /**
   * <p>
   * The scope item's description.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  void description(
          String pVal);


  /**
   * <p>
   * The priority of the scope item.
   * </p>
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  String priority();


  /**
   * <p>
   * The priority of the scope item.
   * </p>
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  void priority(
          String pVal);


  /**
   * <p>
   * The scope item's parent release.
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * ContentDefinition Factory
   * </p>
   * <p>
   * Getter method for the COM property "ContentDefinitionFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject contentDefinitionFactory();


  // Properties:
}
