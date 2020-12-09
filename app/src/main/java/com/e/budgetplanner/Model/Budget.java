package com.e.budgetplanner.Model;

public class Budget {
    private int id;
    private String desc;
    private String amt;
    public Budget(int id, String desc, String amt) {
        this.id = id;
        this.desc = desc;
        this.amt = amt;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }
}
