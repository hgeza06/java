package db;

/**
 *
 * @author Géza
 */
public enum osztalyzatok {
    ELÉGTELEN, ELÉGÉSGES, KÖZEPES, JÓ, JELES;
    
    private osztalyzatok grd;
    
    private osztalyzatok() {
        
    }

    public void getOsztalyzatok(osztalyzatok grd) {
        this.grd = grd;
    }

    public osztalyzatok getOsztalyzat(){
        return grd;
    }

}
