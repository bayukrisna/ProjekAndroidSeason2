package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import java.io.Serializable;

/**
 * Created by user on 17/11/2016.
 */

//deklarasi variabel
public class Data implements Serializable {
    public String text1;
    public int img1;
    public int img2;
    public String text2;
    public String text3;

    //membuat constructor
    public Data(String text1, int img1, int img2, String text2, String text3) {
        this.text1 = text1;
        this.img1 = img1;
        this.img2 = img2;
        this.text2 = text2;
        this.text3 = text3;
    }
}
