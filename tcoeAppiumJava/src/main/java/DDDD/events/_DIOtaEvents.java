package DDDD.events;

import com4j.DISPID;
import com4j.IID;

/**
 * For HP use. _DIOtaEvents.
 */
@IID("{C79EC040-A067-11D5-9D6E-000102E0AC0C}")
public abstract class _DIOtaEvents {
  // Methods:
  /**
   * @param domain Mandatory java.lang.String parameter.
   * @param server Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  public boolean onConnectingServer(
    String domain,
    String server) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(2)
  public void onConnectServer() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param project Mandatory java.lang.String parameter.
   * @param user Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  public boolean onConnectingProject(
    String project,
    String user,
    String password) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(4)
  public void onConnectProject() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(5)
  public boolean onDisconnectingServer() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(6)
  public void onDisconnectServer() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(7)
  public boolean onDisconnectingProject() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(8)
  public void onDisconnectProject() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   */

  @DISPID(9)
  public boolean onAddingItem(
    String objType,
    Object object_) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   */

  @DISPID(10)
  public void onAddItem(
    String objType,
    Object object_) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   */

  @DISPID(11)
  public boolean onDeletingItem(
    String objType,
    Object object_) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   */

  @DISPID(12)
  public void onDeleteItem(
    String objType) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   * @param fieldValue Mandatory java.lang.Object parameter.
   */

  @DISPID(13)
  public boolean onSettingItemValue(
    String objType,
    Object object_,
    String fieldName,
    Object fieldValue) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   * @param fieldValue Mandatory java.lang.Object parameter.
   */

  @DISPID(14)
  public void onSetItemValue(
    String objType,
    Object object_,
    String fieldName,
    Object fieldValue) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   */

  @DISPID(15)
  public boolean onGettingItemValue(
    String objType,
    Object object_,
    String fieldName) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   * @param fieldValue Mandatory java.lang.Object parameter.
   */

  @DISPID(16)
  public void onGetItemValue(
    String objType,
    Object object_,
    String fieldName,
    Object fieldValue) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   */

  @DISPID(17)
  public boolean onUpdatingItem(
    String objType,
    Object object_) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param objType Mandatory java.lang.String parameter.
   * @param object_ Mandatory java.lang.Object parameter.
   */

  @DISPID(18)
  public void onUpdateItem(
    String objType,
    Object object_) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param filter Mandatory java.lang.Object parameter.
   */

  @DISPID(19)
  public boolean onFetchingNewList(
    Object filter) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param list Mandatory java.lang.Object parameter.
   */

  @DISPID(20)
  public void onFetchNewList(
    Object list) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param errorCode Mandatory int parameter.
   */

  @DISPID(21)
  public void onServerErrRecieved(
    int errorCode) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
