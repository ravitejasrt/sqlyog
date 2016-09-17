package com.run;

public class Actor {
   private Integer actorid;
   private String fname;
   private String lname;
   private String lstupdate;
   public Integer getActorid() {
	   return actorid;
   }
   public void setActorid(Integer actorid) {
	   this.actorid = actorid;
   }
   public String getFname() {
	   return fname;
   }
   public void setFname(String fname) {
	   this.fname = fname;
   }
   public String getLname() {
	   return lname;
   }
   public void setLname(String lname) {
	   this.lname = lname;
   }
   public String getLstupdate() {
	   return lstupdate;
   }
   public void setLstupdate(String lstupdate) {
	   this.lstupdate = lstupdate;
   }
   public String toString(){
	   return "actorid  = "+actorid+" , fname = "+fname+" , lname = "+lname+" , lstupdate  = "+lstupdate;
   }

}
