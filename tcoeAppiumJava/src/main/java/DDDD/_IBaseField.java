package DDDD;

import com4j.*;

/**
 * For HP use. _IBaseField Interface.
 */
@IID("{DCD217D3-9BE9-4BED-B386-1A105D84E1F0}")
public interface _IBaseField extends Com4jObject {
  // Methods:
  /**
   * @param vector Mandatory int parameter.
   * @param index Mandatory int parameter.
   */

  @VTID(3)
  void _SetNeighborhood_(
          int vector,
          int index);


  /**
   * @param pObject Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(4)
  @ReturnValue(index=0)
  String _BeforePost_(
          @MarshalAs(NativeType.Dispatch) Com4jObject pObject);


  /**
   * @param data Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(5)
  String _DoPost_(
          String data);


  /**
   * @param key Mandatory java.lang.String parameter.
   * @param pObject Mandatory com4j.Com4jObject parameter.
   */

  @VTID(6)
  void _AfterPost_(
          String key,
          @MarshalAs(NativeType.Dispatch) Com4jObject pObject);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @param val Mandatory boolean parameter.
   */

  @VTID(7)
  void _SetRequired_(
          String fieldName,
          boolean val);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(8)
  boolean _GetRequired_(
          String fieldName);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   */

  @VTID(9)
  void _RestoreRequired_(
          String fieldName);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @param val Mandatory com4j.Com4jObject parameter.
   */

  @VTID(10)
  void _SetRoot_(
          String fieldName,
          @MarshalAs(NativeType.Dispatch) Com4jObject val);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject _GetRoot_(
          String fieldName);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   */

  @VTID(12)
  void _RestoreRoot_(
          String fieldName);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   */

  @VTID(13)
  void _put_Field(
          String fieldName,
          @MarshalAs(NativeType.VARIANT) Object newVal);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean _VerifyPutField(
          String fieldName,
          @MarshalAs(NativeType.VARIANT) Object newVal);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @param oldFieldValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean _IsFieldModified(
          String fieldName,
          @Optional Object oldFieldValue);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   */

  @VTID(16)
  void _UndoField(
          String fieldName);


  /**
   * @param fieldName Mandatory java.lang.String parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean _VerifyPutFieldWithErrorOnFail(
          String fieldName,
          @MarshalAs(NativeType.VARIANT) Object newVal);


  /**
   * @param pBaseField Mandatory DDDD.IBaseField parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  String _GetEntityOwner(
          IBaseField pBaseField);


  /**
   * @param pBaseField Mandatory DDDD.IBaseField parameter.
   * @param tableName Mandatory java.lang.String parameter.
   */

  @VTID(19)
  void _VerifyRemoveItem(
          IBaseField pBaseField,
          String tableName);


  // Properties:
}
