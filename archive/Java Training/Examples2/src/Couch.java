/**
 * Created by eliyahudorsky on 1/24/16. BS"D
 */
public class Couch {

    private int recline;
    private String couchBrand;

    public Couch(int recline, String couchBrand) {
        this.recline = recline;
        this.couchBrand = couchBrand;
    }

    public void formCouch() {
        System.out.println("Couch formed.  Couch is of brand " + getCouchBrand());
    }

    public void reclineCouch(int reclineLevel) {
        System.out.println("Couch is reclining, the recline is " + getRecline());
    }

    public int getRecline() {
        return recline;
    }

    public String getCouchBrand() {
        return couchBrand;
    }
}
