package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Cache-related services.
 */
@IID("{0EEC8C98-2379-4B90-BB09-EBBA9B2A73E1}")
public interface ICacheManager extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The cache ID for the current connection.
   * </p>
   * <p>
   * Getter method for the COM property "CacheKey"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int cacheKey();


  /**
   * <p>
   * The entity cache data for the specified entity type and ID.
   * </p>
   * <p>
   * Getter method for the COM property "CachedData"
   * </p>
   * @param dataType Mandatory java.lang.String parameter.
   * @param dataCacheKey Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String cachedData(
          String dataType,
          String dataCacheKey);


  /**
   * <p>
   * The entity cache data for the specified entity type and ID.
   * </p>
   * <p>
   * Setter method for the COM property "CachedData"
   * </p>
   * @param dataType Mandatory java.lang.String parameter.
   * @param dataCacheKey Mandatory java.lang.String parameter.
   * @param data Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void cachedData(
          String dataType,
          String dataCacheKey,
          String data);


  /**
   * <p>
   * Remove entity cache data according entity type and ID.
   * </p>
   * @param dataType Mandatory java.lang.String parameter.
   * @param dataCacheKey Mandatory java.lang.String parameter.
   * @param timeDelay Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  void removeCachedData(
          String dataType,
          String dataCacheKey,
          int timeDelay);


  // Properties:
}
