package DDDD;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Patch interface for skipping permission checking , used for standard reports
 */
@IID("{15D6DF74-0911-483C-AB17-90F9CE13D3DC}")
public interface ICustomizationPermissionsReports extends Com4jObject {
  // Methods:
  /**
   * <p>
   * For HP use.Force Skip permission check on add item - patch only for Atlantis for report creation 
   * </p>
   * @param bEnable Mandatory boolean parameter.
   * @param verificationCode Mandatory java.lang.String parameter.
   */

  @VTID(3)
  void enableReportsMarch2009(
          boolean bEnable,
          String verificationCode);


  // Properties:
}
