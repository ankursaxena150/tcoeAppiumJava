package DDDD;

import com4j.*;

/**
 * For HP use. Represents a result files manipulation async API.
 */
@IID("{55C57CF3-FA3E-488E-8E0E-BCDF0C49AFF1}")
public interface IAsyncResultStorage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Removes Result files from QC Repository
   * </p>
   * @param context Mandatory java.lang.Object parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void clean(
          @MarshalAs(NativeType.VARIANT) Object context);


  /**
   * <p>
   * Uploads result file/folder to QC Repository
   * </p>
   * @param resultLocalPath Mandatory java.lang.String parameter.
   * @param context Mandatory java.lang.Object parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void uploadResult(
          String resultLocalPath,
          @MarshalAs(NativeType.VARIANT) Object context);


  /**
   * <p>
   * Downloads result folder from QC Repository
   * </p>
   * @param resultLocalPath Mandatory java.lang.String parameter.
   * @param context Mandatory java.lang.Object parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void downloadResult(
          String resultLocalPath,
          @MarshalAs(NativeType.VARIANT) Object context);


  /**
   * <p>
   * Cancels current operation
   * </p>
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void cancel();


  // Properties:
}
