package DDDD;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. ITDConnection methods for internal use from UI.
 */
@IID("{103564D1-C93A-4C00-81D7-89327EDC766F}")
public interface ITDConnection_Internal extends Com4jObject {
  // Methods:
  /**
   * <p>
   * For HP use. Generic one string parameter call
   * </p>
   * @param requestName Mandatory java.lang.String parameter.
   * @param input Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(3)
  String genericOneParamCall(
          String requestName,
          String input);


  /**
   * <p>
   * For HP use. Generic stream download call
   * </p>
   * @param requestName Mandatory java.lang.String parameter.
   * @param input Mandatory java.lang.String parameter.
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(4)
  String genericOneParamStreamDownloadCall(
          String requestName,
          String input,
          String filePath);


  // Properties:
}
