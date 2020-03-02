package DDDD;

import com4j.*;

/**
 * Services for managing BP Model Folder.
 */
@IID("{210C7D42-A5EC-423D-8548-BAB6FEEC24E5}")
public interface IBPModelFolderFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Gets the BPMmodel root folder.
   * </p>
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject root();


  // Properties:
}
