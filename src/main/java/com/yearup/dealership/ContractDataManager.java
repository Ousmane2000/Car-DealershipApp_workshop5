package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
public void saveContract(Contract contract){
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("contract.csv",true))) {
        if(contract instanceof SalesContract) {
        bw.write("SALE"+"|"+contract.getDate()+"|"+contract.getName()+
       "|"+contract.getEmail()+"|"+ contract.getVehicleSold().getVin()+"|"+
      contract.getVehicleSold().getYear()+"|"+contract.getVehicleSold().getMake()+"|"
       +contract.getVehicleSold().getModel()+"|"+contract.getVehicleSold().getVehicleType()+ "|"+
       contract.getVehicleSold().getColor()+"|"+contract.getVehicleSold().getOdometer()+contract.getVehicleSold().getPrice()+"|"
       +((SalesContract) contract).getSalesTaxAmount()+"|"+((SalesContract) contract).getRecordingFee()+"|"
           +((SalesContract) contract).getProcessingFee()+"|"+contract.getTotalPrice()+"|"+((SalesContract) contract).isFinanceOption()
          +"|"+contract.getMonthlyPayment());
        bw.newLine();

        }
        if(contract instanceof LeaseContract){
            bw.write("SALE"+"|"+contract.getDate()+"|"+contract.getName()+
                    "|"+contract.getEmail()+"|"+ contract.getVehicleSold().getVin()+"|"+
                    contract.getVehicleSold().getYear()+"|"+contract.getVehicleSold().getMake()+"|"
                    +contract.getVehicleSold().getModel()+"|"+contract.getVehicleSold().getVehicleType()+ "|"+
                    contract.getVehicleSold().getColor()+"|"+contract.getVehicleSold().getOdometer()+contract.getVehicleSold().getPrice()+"|"
                    +((LeaseContract) contract).getExpectedEndingValue()+"|"+((LeaseContract) contract).getLeaseFee()+"|"+contract.getTotalPrice()
                    +"|"+contract.getMonthlyPayment());

        }



}catch (IOException e) {
        e.printStackTrace();
    }

}
}
