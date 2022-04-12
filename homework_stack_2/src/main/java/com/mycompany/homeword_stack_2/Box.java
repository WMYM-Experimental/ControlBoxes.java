package com.mycompany.homeword_stack_2;

/**
 *
 * @author Washington Yandun @WashingtonYandun
 */
public class Box {

    String companyID;
    String boxID;
    int content; // 1-s , 2-f, 3-r

    public Box(String boxID, String companyID, int content) {
        this.boxID = boxID;
        this.companyID = companyID;
        this.content = content;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getBoxID() {
        return boxID;
    }

    public void setBoxID(String boxID) {
        this.boxID = boxID;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString() {
        
        String contentString = "";
        
        if(this.content == 1){
            contentString = "FIREWALLS";
        }
        if(this.content == 2){
            contentString = "SWITCH's";
        }
        if(this.content == 3){
            contentString = "ROUTERS";
        }
        return    "----------------------------------------\n"
                + "|  BOX_ID : " + boxID + "\n"
                + "|  COMPANY_ID : " + companyID + "\n"
                + "|  CONTENT OF THE BOX : " + contentString + "\n"
                + "----------------------------------------";
    }
}
