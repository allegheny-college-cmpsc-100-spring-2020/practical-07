package practicalseven;

import java.text.DecimalFormat;
import java.util.Random;

/** Creates a WidgetMachine object.
 *
 * @author Solutions Repository
 */
public class WidgetMachine {

  private final double efficiency;
  private final String machineId;
  private Random generator = new Random();
  private DecimalFormat df = new DecimalFormat("#.##");

  /** Constructor.
   *
   * @param id The ID of the machineID
   */
  public WidgetMachine(String id) {
    this.machineId = id;
    this.efficiency = generator.nextDouble() * 100;
  }
  
  /** Retrieves the efficiency score of the machine.
   *
   */
  public double getEfficiency() {
    return Double.valueOf(df.format(this.efficiency));
  }
  
  /** Retrieves the ID of the machine.
   *
   */
  public String getId() {
    return this.machineId;
  }
}