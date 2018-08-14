package com.css.entity;

public class RepairInfo {
    private String projectName;
    private String jobName;
    private int bizdate;
    private long fbk;
    private long jx;
    private long cj;
    private double cyl;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getBizdate() {
        return bizdate;
    }

    public void setBizdate(int bizdate) {
        this.bizdate = bizdate;
    }

    public long getFbk() {
        return fbk;
    }

    public void setFbk(long fbk) {
        this.fbk = fbk;
    }

    public long getJx() {
        return jx;
    }

    public void setJx(long jx) {
        this.jx = jx;
    }

    public long getCj() {
        return cj;
    }

    public void setCj(long cj) {
        this.cj = cj;
    }

    public double getCyl() {
        return cyl;
    }

    public void setCyl(double cyl) {
        this.cyl = cyl;
    }
}
