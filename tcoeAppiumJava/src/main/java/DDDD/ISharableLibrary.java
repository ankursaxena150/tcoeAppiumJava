package DDDD;

import com4j.*;

/**
 * For HP use. Provides an interface for a library that can be shared.
 */
@IID("{8BFFECB5-B1CB-4A13-BDD1-D71ABD17197B}")
public interface ISharableLibrary extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns an IList of ILibraryInfo references of libraries that are using this library. The list is empty if none.
   * </p>
   * <p>
   * Getter method for the COM property "UsedByInfo"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList usedByInfo();


  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object usedByInfo(
          int index);

  /**
   * <p>
   * Performs validation before library import.
   * </p>
   * @param dstDomainName Mandatory java.lang.String parameter.
   * @param dstProjectName Mandatory java.lang.String parameter.
   * @param srcBaselineId Mandatory int parameter.
   * @return  Returns a value of type DDDD.ILibraryOperationResult
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  DDDD.ILibraryOperationResult importLibraryVerification(
          String dstDomainName,
          String dstProjectName,
          int srcBaselineId);


  // Properties:
}
