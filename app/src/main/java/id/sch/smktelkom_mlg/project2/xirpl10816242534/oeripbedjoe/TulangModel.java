package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import java.io.Serializable;

/**
 * Created by Bayu on 3/29/2017.
 */

public class TulangModel implements Serializable {
    public String titleTulang;
    public String descTulang;
    public String indicationTulang;
    public String cureTulang;
    public int imgTulang;

    public TulangModel(String titleTulang, String descTulang, String indicationTulang, String cureTulang, int imgTulang) {
        this.titleTulang = titleTulang;
        this.descTulang = descTulang;
        this.indicationTulang = indicationTulang;
        this.cureTulang = cureTulang;
        this.imgTulang = imgTulang;
    }

    public String getTitleTulang() {
        return titleTulang;
    }

    public void setTitleTulang(String titleTulang) {
        this.titleTulang = titleTulang;
    }

    public String getDescTulang() {
        return descTulang;
    }

    public void setDescTulang(String descTulang) {
        this.descTulang = descTulang;
    }

    public String getIndicationTulang() {
        return indicationTulang;
    }

    public void setIndicationTulang(String indicationTulang) {
        this.indicationTulang = indicationTulang;
    }

    public String getCureTulang() {
        return cureTulang;
    }

    public void setCureTulang(String cureTulang) {
        this.cureTulang = cureTulang;
    }

    public int getImgTulang() {
        return imgTulang;
    }

    public void setImgTulang(int imgTulang) {
        this.imgTulang = imgTulang;
    }
}
