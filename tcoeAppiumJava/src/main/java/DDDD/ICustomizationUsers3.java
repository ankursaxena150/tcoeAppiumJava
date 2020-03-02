package DDDD;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationUser objects.
 */
@IID("{7236494B-BBE3-40D2-8176-E26F65D0F995}")
public interface ICustomizationUsers3 extends ICustomizationUsers2 {
  // Methods:
  /**
   * <p>
   * For HP use. Returns list of IDs of siter users.
   * </p>
   * @param nameLike Mandatory java.lang.String parameter.
   * @param isExcludeUsersInCurrentProject Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(16)
  String getUsersIdsInSite(
          String nameLike,
          boolean isExcludeUsersInCurrentProject);


  /**
   * <p>
   * For HP use. Returns list of details of Users in site by IDs.
   * </p>
   * @param vFields Mandatory java.lang.Object parameter.
   * @param vIds Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(17)
  String getUsersPropertiesInSite(
          @MarshalAs(NativeType.VARIANT) Object vFields,
          @MarshalAs(NativeType.VARIANT) Object vIds);


  // Properties:
}
