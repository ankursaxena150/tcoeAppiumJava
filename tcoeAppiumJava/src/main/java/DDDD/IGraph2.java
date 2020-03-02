package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a graph built through a method.
 */
@IID("{79CC748A-20E0-416D-9E31-6298B5CAA730}")
public interface IGraph2 extends IGraph {
  // Methods:
  /**
   * <p>
   * Get additional metadata to graph.
   * </p>
   * <p>
   * Getter method for the COM property "MetadataAttribute"
   * </p>
   * @param attrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  String metadataAttribute(
          String attrName);


  // Properties:
}
