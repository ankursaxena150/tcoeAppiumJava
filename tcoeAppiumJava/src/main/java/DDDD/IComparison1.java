package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents a Comparison.
 */
@IID("{8E422E74-3D8B-4507-B992-C5224F2742D0}")
public interface IComparison1 extends IComparison {
  // Methods:
  /**
   * <p>
   * Get a Comparison detailed report as a CSV String - this string can be saved by the UI/OTA Script to a file
   * </p>
   * @param comparisonSettingsList Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(38)
  IList getCSVReportOnLastComparison(
          IList comparisonSettingsList);


  // Properties:
}
