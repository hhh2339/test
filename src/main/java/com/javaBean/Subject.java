package com.javaBean;

import java.sql.Timestamp;

public class Subject {
     public int sid;
     public String sname;
     public Timestamp sdate;
     public String oldSname;

    public String getOldSname() {
        return oldSname;
    }

    public void setOldSname(String oldSname) {
        this.oldSname = oldSname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Timestamp getSdate() {
        return sdate;
    }

    public void setSdate(Timestamp sdate) {
        this.sdate = sdate;
    }
}
