package DDDD;

import com4j.*;

/**
 * Custom audit events.
 */
@IID("{9B3BD95C-EA46-4E8D-8458-D3D263506901}")
public interface IAuditRecordUpdater extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Updates a custom audit record.
   * </p>
   * @param pAuditRecordData Mandatory com4j.Com4jObject parameter.
   * @param pAuditRecord Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void updateAuditRecord(
          @MarshalAs(NativeType.Dispatch) Com4jObject pAuditRecordData,
          @MarshalAs(NativeType.Dispatch) Com4jObject pAuditRecord);


  // Properties:
}
