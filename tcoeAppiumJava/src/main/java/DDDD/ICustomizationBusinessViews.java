package DDDD;

import com4j.*;

/**
 * For HP use. The collection of Business Views.
 */
@IID("{8DA7F820-19C8-456A-B471-EF1B064B226F}")
public interface ICustomizationBusinessViews extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Gets the ICustomizationBusinessView specified by the name
   * </p>
   * <p>
   * Getter method for the COM property "BusinessView"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject businessView(
          String name);


  /**
   * <p>
   * Gets the ICustomizationBusinessView with the specified ID.
   * </p>
   * <p>
   * Getter method for the COM property "BusinessViewByID"
   * </p>
   * @param id Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject businessViewByID(
          int id);


  /**
   * <p>
   * Gets the list of ICustomizationBusinessView objects.
   * </p>
   * <p>
   * Getter method for the COM property "BusinessViews"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  IList businessViews();


  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object businessViews(
          int index);

  /**
   * <p>
   * Creates a new CustomizationBusinessView.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param _Label Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject addBusinessView(
          String name,
          String _Label);


  /**
   * <p>
   * Deletes the specified CustomizationBusinessView.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void removeBusinessView(
          String name);


  // Properties:
}
