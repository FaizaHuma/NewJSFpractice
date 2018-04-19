package controller;

import data.model.MyInfo;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "MyInfoControl")

public class MyInfoControl {


    MyInfo myInfo=new MyInfo();

    public MyInfo getMyInfo() {
        return myInfo;
    }

    public void setMyInfo(MyInfo myInfo) {
        this.myInfo = myInfo;
    }

    public String showName() {
        if (myInfo.getMyName().equals("faiza huma")) {
            return "huma";

        } else {

            return "fail";
        }
    }





}
