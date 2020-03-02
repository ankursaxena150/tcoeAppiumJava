package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. General Information on a Library.
 */
@IID("{16201C2D-9330-4598-AC93-4332F63D7294}")
public interface ILibraryInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The domain that contains the project that contains the library.
   * </p>
   * <p>
   * Getter method for the COM property "Domain"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String domain();


  /**
   * <p>
   * The project that contains the library.
   * </p>
   * <p>
   * Getter method for the COM property "Project"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String project();


  /**
   * <p>
   * The ID of the exporting library that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "LibraryID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int libraryID();


  /**
   * <p>
   * the NAME of the exporting library that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "LibraryName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  String libraryName();


  /**
   * <p>
   * the Last Sync Date of the exporting library that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "LastSyncDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  String lastSyncDate();


  /**
   * <p>
   * the Import Date of the exporting library that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "ImportDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  String importDate();


  /**
   * <p>
   * the Importing User of the exporting library that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "ImportingUser"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  String importingUser();


  /**
   * <p>
   * The ID of the exporting library baseline that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "BaselineId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  int baselineId();


  /**
   * <p>
   * The name of the exporting library baseline that is referenced here.
   * </p>
   * <p>
   * Getter method for the COM property "BaselineName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  String baselineName();


  // Properties:
}
