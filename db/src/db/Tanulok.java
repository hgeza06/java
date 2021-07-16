package db;

import ann.Annotation.annotation;

/**
 *
 * @author Géza
 */
public class Tanulok extends Database {

    @annotation(value = "")
    String id; //neptun kód
    @annotation(value = "")
    String keresztnev;
    @annotation(value = "")
    String vezeteknev;
    @annotation(value = "")
    String email;
    @annotation(min = 0, max = 100)
    Integer zh;
    @annotation(min = 0, max = 100)
    Integer zh1;
    @annotation(min = 0, max = 100)
    Integer vizsga;

     
    public Integer getVizsga() {
        return vizsga;
    }

    public void setVizsga(Integer vizsga) {
        this.vizsga = vizsga;
    }


    public Integer getZh() {
        return zh;
    }

    public void setZh(Integer zh) {
        this.zh = zh;
    }

    public Integer getZh1() {
        return zh1;
    }

    public void setZh1(Integer zh1) {
        this.zh1 = zh1;
    }
    
    
    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
