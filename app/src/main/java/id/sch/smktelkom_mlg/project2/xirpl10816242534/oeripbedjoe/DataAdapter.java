package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import java.io.Serializable;

/**
 * Created by Smktelkom on 0029, 3/29/2017.
 */

public class DataAdapter implements Serializable {
    private String title;
    private String desc;
    private String indication;
    private String cure;


    public DataAdapter() {

    }

    public DataAdapter(String title, String desc, String indication, String cure) {
        this.title = title;
        this.desc = desc;
        this.indication = indication;
        this.cure = cure;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getCure() {
        return cure;
    }

    public void setCure(String cure) {
        this.cure = cure;
    }
}
