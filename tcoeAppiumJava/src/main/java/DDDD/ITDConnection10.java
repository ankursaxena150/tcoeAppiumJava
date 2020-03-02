package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a single server connection.
 */
@IID("{642D1BA4-0B08-4257-867F-8C4C74341D3A}")
public interface ITDConnection10 extends ITDConnection9 {
  // Methods:
  /**
   * <p>
   * Set basic auth header mode
   * </p>
   * @param headerMode Mandatory DDDD.TDAPI_BASIC_AUTH_HEADER_MODES parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(227)
  void setBasicAuthHeaderMode(
          DDDD.TDAPI_BASIC_AUTH_HEADER_MODES headerMode);


  /**
   * <p>
   * Import of connection settings to connection
   * </p>
   * @param pSettings Mandatory DDDD.IConnectionSettings parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(228)
  void importConnectionSettings(
          DDDD.IConnectionSettings pSettings);


  /**
   * <p>
   * Use instance cache of settings storages
   * </p>
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(229)
  void useInstanceCache();


  // Properties:
}
