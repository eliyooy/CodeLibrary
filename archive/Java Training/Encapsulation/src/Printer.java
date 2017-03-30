/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean doubleSided;

    public Printer(int tonerLevel, int pagesPrinted, boolean doubleSided) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.doubleSided = doubleSided;
    }

    public void fillToner(int addPercent) {
        if ((this.tonerLevel + addPercent) > 100) {
            System.out.println("Too much ink");
        } else {
            this.tonerLevel = this.tonerLevel + addPercent;
            System.out.println("New toner level: " + tonerLevel + "%");
        }
    }

    public void pagesPrinted(int numberPages, boolean doubleSided) {
        this.doubleSided = doubleSided;
        if (doubleSided == true) {
            this.pagesPrinted = this.pagesPrinted + (numberPages / 2);
        } else {
            this.pagesPrinted = this.pagesPrinted + numberPages;
        }
        System.out.println("Total pages printed: " + pagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDoubleSided() {
        return doubleSided;
    }
}
