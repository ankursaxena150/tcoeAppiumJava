package DDDD;

import com4j.*;

/**
 * Services for supporting copy and paste.
 */
@IID("{D051928E-696B-42F3-94B1-F99B6A65A8E8}")
public interface ISupportCopyPaste3 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Pastes data from clipboard.
   * </p>
   * @param clipboardData Mandatory java.lang.String parameter.
   * @param targetID Optional parameter. Default value is ""
   * @param mode Optional parameter. Default value is 0
   * @param orderID Optional parameter. Default value is -1
   */

  @VTID(7)
  void pasteFromClipBoard(
          String clipboardData,
          @Optional @DefaultValue("") String targetID,
          @Optional @DefaultValue("0") int mode,
          @Optional @DefaultValue("-1") int orderID);


  /**
   * <p>
   * Copies data into clipboard.
   * </p>
   * @param idsFilter Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   * @param path Optional parameter. Default value is ""
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  String copyToClipBoard(
          String idsFilter,
          @Optional @DefaultValue("0") int mode,
          @Optional @DefaultValue("") String path);


  /**
   * <p>
   * Checks if the paste target is in the same project from which the material was copied.
   * </p>
   * <p>
   * Getter method for the COM property "PasteToCurrentProject"
   * </p>
   * @param clipboardData Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(9)
  boolean pasteToCurrentProject(
          String clipboardData);


  // Properties:
}
