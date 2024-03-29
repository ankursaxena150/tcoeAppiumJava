package DDDD;

import com4j.Com4jObject;
import com4j.GUID;
import com4j.IID;
import com4j.VTID;

@IID("{1CF2B120-547D-101B-8E65-08002B2BD119}")
public interface IErrorInfo extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type GUID
   */

  @VTID(3)
  GUID getGUID();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @VTID(4)
  String getSource();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @VTID(5)
  String getDescription();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @VTID(6)
  String getHelpFile();


  /**
   * @return  Returns a value of type int
   */

  @VTID(7)
  int getHelpContext();


  // Properties:
}
