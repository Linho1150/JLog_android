package com.anselmo.jlog;

class Domain {
    private String date;
    private String adr;

    public Domain(String date,String adr){
        this.date=date;
        this.adr=adr;
    }
    public String getDate() {
        return date;
    }

    public String getAdr() {
        return adr;
    }
}