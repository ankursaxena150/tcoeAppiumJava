package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * The data that describes a specific use-case of the Tests that owns this configuration.
 */
@IID("{A9AA9D16-EBD7-46EC-AB5D-38495232D7F6}")
public interface ITestConfig extends DDDD.IBaseFieldExMail {
  // Methods:
  /**
   * <p>
   * The ID of the Tests that owns this test configuration.
   * </p>
   * <p>
   * Getter method for the COM property "TestId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  int testId();


  /**
   * <p>
   * The configuration name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  String name();


  /**
   * <p>
   * The configuration name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  void name(
          String pVal);


  /**
   * <p>
   * The configuration description.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  String description();


  /**
   * <p>
   * The configuration description.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(28)
  void description(
          String pVal);


  /**
   * <p>
   * The configuration execution status.
   * </p>
   * <p>
   * Getter method for the COM property "ExecStatus"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(29)
  String execStatus();


  /**
   * <p>
   * The configuration execution status.
   * </p>
   * <p>
   * Setter method for the COM property "ExecStatus"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(30)
  void execStatus(
          String pVal);


  /**
   * <p>
   * The user who created the configuration.
   * </p>
   * <p>
   * Getter method for the COM property "CreatedBy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(31)
  String createdBy();


  /**
   * <p>
   * The configuration creation date.
   * </p>
   * <p>
   * Getter method for the COM property "CreationDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(32)
  java.util.Date creationDate();


  /**
   * <p>
   * Indicates if the test configuration covers at least one requirement.
   * </p>
   * <p>
   * Getter method for the COM property "HasCoverage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(33)
  boolean hasCoverage();


  /**
   * <p>
   * The configuration filtering information of the data resource.
   * </p>
   * <p>
   * Getter method for the COM property "Filtering"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(34)
  String filtering();


  /**
   * <p>
   * The configuration filtering information of the data resource.
   * </p>
   * <p>
   * Setter method for the COM property "Filtering"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(35)
  void filtering(
          String pVal);


  /**
   * <p>
   * The configuration data usage.
   * </p>
   * <p>
   * Getter method for the COM property "TheDataUsage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(36)
  String theDataUsage();


  /**
   * <p>
   * The configuration data usage.
   * </p>
   * <p>
   * Setter method for the COM property "TheDataUsage"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(37)
  void theDataUsage(
          String pVal);


  /**
   * <p>
   * Resets the selected parameter actual values of all the instances of the configuration.
   * </p>
   * @param parameterIDs Mandatory java.lang.String parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(38)
  void resetSelectedInstancesParameters(
          String parameterIDs);


  // Properties:
}
