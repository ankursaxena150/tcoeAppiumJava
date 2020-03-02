package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. The Business View.
 */
@IID("{58BB7E94-EF1C-44E8-9E6D-B6C0086A417C}")
public interface ICustomizationBusinessView extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Business View name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String name();


  /**
   * <p>
   * Business View name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
          String pVal);


  /**
   * <p>
   * Business View ID.
   * </p>
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  int id();


  /**
   * <p>
   * Indicates if a Business View object has changed locally since last synchronized with the server.
   * </p>
   * <p>
   * Getter method for the COM property "Updated"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  boolean updated();


  /**
   * <p>
   * Indicates if a Business View has been removed, but the deletion has not been posted to the server.
   * </p>
   * <p>
   * Getter method for the COM property "Deleted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  boolean deleted();


  /**
   * <p>
   * Indicates if a Business View has been created but not posted to the server.
   * </p>
   * <p>
   * Getter method for the COM property "New"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  boolean _new();


  /**
   * <p>
   * Business View dql.
   * </p>
   * <p>
   * Getter method for the COM property "Dql"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  String dql();


  /**
   * <p>
   * Business View dql.
   * </p>
   * <p>
   * Setter method for the COM property "Dql"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void dql(
          String pVal);


  /**
   * <p>
   * Indicates if the business view is published.
   * </p>
   * <p>
   * Getter method for the COM property "IsPublished"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isPublished();


  /**
   * <p>
   * Indicates if the business view is published.
   * </p>
   * <p>
   * Setter method for the COM property "IsPublished"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void isPublished(
          boolean pVal);


  /**
   * <p>
   * Indicates if the business view is a template view.
   * </p>
   * <p>
   * Getter method for the COM property "IsTemplate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  boolean isTemplate();


  /**
   * <p>
   * Business View description.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  String description();


  /**
   * <p>
   * Business View description.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  void description(
          String pVal);


  /**
   * <p>
   * Business View Label.
   * </p>
   * <p>
   * Getter method for the COM property "Label"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  String label();


  /**
   * <p>
   * Business View Label.
   * </p>
   * <p>
   * Setter method for the COM property "Label"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  void label(
          String pVal);


  /**
   * <p>
   * Business View Column Labels.
   * </p>
   * <p>
   * Getter method for the COM property "ColumnLabelMapping"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(22)
  String columnLabelMapping();


  /**
   * <p>
   * Business View Column Labels.
   * </p>
   * <p>
   * Setter method for the COM property "ColumnLabelMapping"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  void columnLabelMapping(
          String pVal);


  /**
   * <p>
   * Get Business View Keywords.
   * </p>
   * <p>
   * Getter method for the COM property "Keywords"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(24)
  String keywords();


  /**
   * <p>
   * Get Business View Keywords.
   * </p>
   * <p>
   * Setter method for the COM property "Keywords"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  void keywords(
          String pVal);


  // Properties:
}
