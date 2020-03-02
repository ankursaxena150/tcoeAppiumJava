package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services for metrics on requirments
 */
@IID("{ABE52EF8-71AF-42F1-A1A5-90CB371E8D8C}")
public interface ISupportTransientFieldsFactory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Internal HP - refresh the Fields to include the transient
   * </p>
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(7)
  void refillTransientTDFields();


  // Properties:
}
