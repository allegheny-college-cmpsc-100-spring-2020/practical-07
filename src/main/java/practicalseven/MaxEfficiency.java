package practicalseven;

/** Plays out our machine auditing scenario.
 * 
 * @author Solutions Repository
 */
public class MaxEfficiency {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Initialize machine objects
    WidgetMachine machine1 = new WidgetMachine("Machine 1");
    WidgetMachine machine2 = new WidgetMachine("Machine 2");
    WidgetMachine machine3 = new WidgetMachine("Machine 3");

    double machine1Eff = /* TODO: Get efficiency for machine1 */;
    double machine2Eff = /* TODO: Get efficiency for machine2 */;
    double machine3Eff = /* TODO: Get efficiency for machine3 */;

    double maxEfficiency;
    String maxEffMachine;

    if (machine1Eff > machine2Eff) {
      if (/* TODO: Create correct condition */) {
        maxEfficiency = machine1Eff;
        maxEffMachine = machine1.getId();
      } else {
        maxEfficiency = machine3Eff;
        maxEffMachine = machine3.getId();
      }
    } else {
      if (/* TODO: Create correct condition */) {
        maxEfficiency = machine2Eff;
        maxEffMachine = machine2.getId();
      } else {
        maxEfficiency = machine3Eff;
        maxEffMachine = machine3.getId();
      }
    }

    /*
     * TODO: Print report of machine efficiency matching sample output.
     */
    /*
     * TODO: Print statement displaying the machine with best efficiency, matching sample output
     */
  }
}