/**
 * Created by eliyahudorsky on 1/20/16. BS"D
 */
public class Main4 {

    // Classes
    private int doors; /*<--- State components (fields) */
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        /*field ---> */
        this.model = model; /*<--- updated as parameter */
    }

    // In Main
    public static void main(String[] args) {
        Main4 porsche = new Main4(); /*Object - new data type called porsche (constructor) of type Main4 */
        Main4 holden = new Main4();
        // porsche = null; eliminates object porsche

    /*if the fields above were made public would be accessible in Main4*/
        porsche.model = "Carrera";

    /*if the fields are private */
        porsche.setModel("Carrera");
    }

    // In Main 4
    public String getModel() {
        return this.model;
    }

    // Back in Main, return it with System.out.println("Model is " + porsche.getModel());
    // If put before, it will return "null"

    // In Main 4, increasing method functionality
//    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if(validModel.equals("carrera") || validModel.equals("commodor")) {
//          this.model = "Unknown";
//} else {
//          this.model = unknown;
//
//    }



}
