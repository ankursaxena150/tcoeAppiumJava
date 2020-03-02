package DDDD;

import com4j.*;

/**
 * Services for managing releases.
 */
@IID("{343BDE57-F42E-40BE-878C-465DC3282285}")
public interface IReleaseFactory2 extends IReleaseFactory {
  // Methods:
  /**
   * <p>
   * Paste the release and rename it.
   * </p>
   * @param clipboardData Mandatory java.lang.String parameter.
   * @param targetParentId Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject pasteReleaseFromTemplate(
          String clipboardData,
          String targetParentId);


  // Properties:
}
