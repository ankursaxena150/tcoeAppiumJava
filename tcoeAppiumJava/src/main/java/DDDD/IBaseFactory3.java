package DDDD;

import com4j.*;

/**
 * Provides basic object basic factory services, such as adding and removing factory child objects and creating lists of child objects.
 */
@IID("{07365BD7-C297-449C-889C-3B734B4B657C}")
public interface IBaseFactory3 extends IBaseFactory2 {
  // Methods:
  /**
   * <p>
   * For HP use. Initialize the factory with project data.
   * </p>
   * @param vRemApi Mandatory java.lang.Object parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void initializeFactoryEx(
          @MarshalAs(NativeType.VARIANT) Object vRemApi);


  // Properties:
}
