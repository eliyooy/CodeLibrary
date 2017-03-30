/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class PC {
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.thecase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        getThecase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Graphics coding
        getMonitor().drawPixelAt(1200, 50, "green");
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    private Case getThecase() {
//        getThecase().pressPowerButton();
        return thecase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
