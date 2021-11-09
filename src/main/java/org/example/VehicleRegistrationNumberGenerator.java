package org.example;

import java.util.ArrayList;
import java.util.List;


public class VehicleRegistrationNumberGenerator {

    List<String> regNumberList = new ArrayList();

    public VehicleRegistrationNumberGenerator (){
        setRegNumberList();

    }

    private void setRegNumberList() {
        this.regNumberList.add("FGT675");
        this.regNumberList.add( "WER899");
        this.regNumberList.add("LOI777");
        this.regNumberList.add("FFT332");
    }


    public String nextVehicleRegistrationNumber(){

        String nextRegNo = getRegNumberList().get(0);

        System.out.println(nextRegNo);
        getRegNumberList().remove(0);

        return nextRegNo;

    }

    public List<String> getRegNumberList() {
        return regNumberList;
    }


}
