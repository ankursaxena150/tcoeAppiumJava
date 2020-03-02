package DDDD;

import com4j.*;

/**
 * Represents a defect.
 */
@IID("{2AF970F7-6CCC-4DFB-AA78-08F689481F94}")
public interface IBug extends DDDD.IBaseFieldExMail {
  // Methods:
  /**
   * <p>
   * The defect status.
   * </p>
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  String status();


  /**
   * <p>
   * The defect status.
   * </p>
   * <p>
   * Setter method for the COM property "Status"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  void status(
          String pVal);


  /**
   * <p>
   * The testing project to which the defect belongs. 
   * </p>
   * <p>
   * Getter method for the COM property "Project"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  String project();


  /**
   * <p>
   * The testing project to which the defect belongs. 
   * </p>
   * <p>
   * Setter method for the COM property "Project"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  void project(
          String pVal);


  /**
   * <p>
   * A short description of the defect.
   * </p>
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(28)
  String summary();


  /**
   * <p>
   * A short description of the defect.
   * </p>
   * <p>
   * Setter method for the COM property "Summary"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(29)
  void summary(
          String pVal);


  /**
   * <p>
   * The defect priority.
   * </p>
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(30)
  String priority();


  /**
   * <p>
   * The defect priority.
   * </p>
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(31)
  void priority(
          String pVal);


  /**
   * <p>
   * The name of the user who detected the defect.
   * </p>
   * <p>
   * Getter method for the COM property "DetectedBy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(32)
  String detectedBy();


  /**
   * <p>
   * The name of the user who detected the defect.
   * </p>
   * <p>
   * Setter method for the COM property "DetectedBy"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(33)
  void detectedBy(
          String pVal);


  /**
   * <p>
   * The name of the user to whom the defect is assigned.
   * </p>
   * <p>
   * Getter method for the COM property "AssignedTo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(34)
  String assignedTo();


  /**
   * <p>
   * The name of the user to whom the defect is assigned.
   * </p>
   * <p>
   * Setter method for the COM property "AssignedTo"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(35)
  void assignedTo(
          String pVal);


  /**
   * <p>
   * Searches the defect summaries for similarities to this defect.
   * </p>
   * @param similarityRatio Optional parameter. Default value is 10
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(36)
  DDDD.IList findSimilarBugs(
          @Optional @DefaultValue("10") int similarityRatio);


  /**
   * <p>
   * Obsolete. Do not invoke.
   * </p>
   * <p>
   * Getter method for the COM property "HasChange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(37)
  boolean hasChange();


  /**
   * <p>
   * Obsolete. Do not invoke.
   * </p>
   * <p>
   * Getter method for the COM property "ChangeLinks"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(38)
  DDDD.IList changeLinks();


  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={DDDD.IList.class})
  Object changeLinks(
          int index);

  // Properties:
}
