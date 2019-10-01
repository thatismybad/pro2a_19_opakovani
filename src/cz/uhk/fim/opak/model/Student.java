package cz.uhk.fim.opak.model;

public class Student {
    private String jmeno;
    private String prijmeni;
    private String osCislo;
    private String login;
    private String emailDlouhy;
    private String emaiKratky;
    private int pocetKreditu;
    private int rokStudia;
    private boolean muzeDoDalsihoRoku;

    public Student() {
    }

    public Student(String jmeno, String prijmeni, String osCislo, String login, String emailDlouhy, int pocetKreditu, int rokStudia) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.osCislo = osCislo;
        this.login = login;
        this.emailDlouhy = emailDlouhy;
        this.emaiKratky = login + "@uhk.cz";
        this.pocetKreditu = pocetKreditu;
        this.rokStudia = rokStudia;
        this.muzeDoDalsihoRoku = rokStudia * 40 <= pocetKreditu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getOsCislo() {
        return osCislo;
    }

    public void setOsCislo(String osCislo) {
        this.osCislo = osCislo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmailDlouhy() {
        return emailDlouhy;
    }

    public void setEmailDlouhy(String emailDlouhy) {
        this.emailDlouhy = emailDlouhy;
    }

    public String getEmaiKratky() {
        return emaiKratky;
    }

    public void setEmaiKratky(String emaiKratky) {
        this.emaiKratky = emaiKratky;
    }

    public int getPocetKreditu() {
        return pocetKreditu;
    }

    public void setPocetKreditu(int pocetKreditu) {
        this.pocetKreditu = pocetKreditu;
    }

    public int getRokStudia() {
        return rokStudia;
    }

    public void setRokStudia(int rokStudia) {
        this.rokStudia = rokStudia;
    }

    public boolean isMuzeDoDalsihoRoku() {
        return muzeDoDalsihoRoku;
    }

    public void setMuzeDoDalsihoRoku(boolean muzeDoDalsihoRoku) {
        this.muzeDoDalsihoRoku = muzeDoDalsihoRoku;
    }
}
