package DDDD;

import com4j.Com4jObject;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Assists in passing warning information to and from QC modules.
 */
@IID("{551A15F5-289D-4C25-AAFA-75CB0171668E}")
public interface IWarningInfo extends Com4jObject {
  // Methods:
  /**
   * @param warningCode Mandatory int parameter.
   * @param warningDescription Mandatory java.lang.String parameter.
   * @param pCaller Mandatory com4j.Com4jObject parameter.
   */

  @VTID(3)
  void setWarning(
          int warningCode,
          String warningDescription,
          Com4jObject pCaller);


  /**
   * @param warningFrec Mandatory java.lang.String parameter.
   * @param pCaller Mandatory com4j.Com4jObject parameter.
   */

  @VTID(4)
  void setWarningFromFrec(
          String warningFrec,
          Com4jObject pCaller);


  /**
   * @return  Returns a value of type boolean
   */

  @VTID(5)
  boolean warningExists();


  /**
   * @param pWarningCode Mandatory Holder<Integer> parameter.
   * @param pWarningDescription Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(6)
  void getWarning(
          Holder<Integer> pWarningCode,
          Holder<String> pWarningDescription);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  Com4jObject getCaller();


  /**
   */

  @VTID(8)
  void clearWarning();


  // Properties:
}
