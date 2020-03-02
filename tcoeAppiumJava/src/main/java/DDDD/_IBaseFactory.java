package DDDD;

import com4j.*;

/**
 * For HP use. _IBaseFactory Interface.
 */
@IID("{47E4C767-87DA-409F-A70E-04B3FCE28BCE}")
public interface _IBaseFactory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * For HP use.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(3)
  @ReturnValue(type=NativeType.VARIANT)
  Object listRefresh(
          String filter);


  /**
   * <p>
   * For HP use.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   */

  @VTID(4)
  void removeCachedList(
          String filter);


  /**
   * <p>
   * For HP use.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @VTID(5)
  IList getCachedList(
          String filter);


  /**
   * <p>
   * For HP use.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @param pList Mandatory DDDD.IList parameter.
   */

  @VTID(6)
  void putCachedList(
          String filter,
          IList pList);


  // Properties:
}
