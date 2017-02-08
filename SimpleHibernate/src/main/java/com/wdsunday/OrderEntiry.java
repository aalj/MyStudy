package com.wdsunday;

/**
 * Created by liangjun on 2017/1/21.
 */
public class OrderEntiry {

    private Integer oid;
    private String oname;
    private UserEntiry user;

    public OrderEntiry() {
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public UserEntiry getUser() {
        return user;
    }

    public void setUser(UserEntiry user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrderEntiry{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                '}';
    }
}
