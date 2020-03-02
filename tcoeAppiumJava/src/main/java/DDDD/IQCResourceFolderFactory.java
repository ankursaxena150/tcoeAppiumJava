package DDDD;

import com4j.*;

/**
 * Services to manage QC resource folders.
 */
@IID("{E6C516D5-501F-4C71-BFDB-18CDB7C33C5F}")
public interface IQCResourceFolderFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Returns the root resource folder labeled 'Resources'.
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
