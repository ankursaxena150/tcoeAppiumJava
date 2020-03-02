package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Customization services, such as adding users to user groups, maintaining user-defined fields, configuring user access privileges.
 */
@IID("{14B0249E-A086-4F09-BC7B-479E2E62879D}")
public interface ICustomization7 extends ICustomization6 {
  // Methods:
  /**
   * <p>
   * For HP use. Posts customization lists data changes to the project database and skips customization reload.
   * </p>
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(44)
  void commitListsWithoutReload();


  // Properties:
}
