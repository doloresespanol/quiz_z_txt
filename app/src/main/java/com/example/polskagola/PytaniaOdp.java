package com.example.polskagola;

public class PytaniaOdp {
    private String pytanie;
    private int nrPytania;
    private String odpowiedz;
    private String odpowiedz2;
    private String odpowiedz3;
    private String odpowiedz4;
    private int poprawinaOdpowiedz;

    public PytaniaOdp(String pytanie,int nrPytania, String odpowiedz, String odpowiedz2, String odpowiedz3, String odpowiedz4, int poprawinaOdpowiedz) {
        this.pytanie = pytanie;
        this.nrPytania = nrPytania;
        this.odpowiedz = odpowiedz;
        this.odpowiedz2 = odpowiedz2;
        this.odpowiedz3 = odpowiedz3;
        this.odpowiedz4 = odpowiedz4;
        this.poprawinaOdpowiedz = poprawinaOdpowiedz;
    }

    public int getNrPytania() {
        return nrPytania;
    }

    public void setNrPytania(int nrPytania) {
        this.nrPytania = nrPytania;
    }

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    public String getOdpowiedz2() {
        return odpowiedz2;
    }

    public void setOdpowiedz2(String odpowiedz2) {
        this.odpowiedz2 = odpowiedz2;
    }

    public String getOdpowiedz3() {
        return odpowiedz3;
    }

    public void setOdpowiedz3(String odpowiedz3) {
        this.odpowiedz3 = odpowiedz3;
    }

    public String getOdpowiedz4() {
        return odpowiedz4;
    }

    public void setOdpowiedz4(String odpowiedz4) {
        this.odpowiedz4 = odpowiedz4;
    }

    public int getPoprawinaOdpowiedz() {
        return poprawinaOdpowiedz;
    }

    public void setPoprawinaOdpowiedz(int poprawinaOdpowiedz) {
        this.poprawinaOdpowiedz = poprawinaOdpowiedz;
    }
}
