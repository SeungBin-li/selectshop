package Transportation.service;


import Transportation.domain.Transportation;

public interface TransportationInterface {
        default void transport(Transportation transportation){
            transportation.setGoStop(true);
        }
        default void changeSpeed(Transportation transportation, int nowSpeed){
            if(transportation.getGas() < 10){
                System.out.println("기름 넣어주세요");
                return;
            }
            if(nowSpeed < 0){
                nowSpeed=0;
            }
            transportation.setNowSpeed(nowSpeed);
        }
        default void changeGoStop(Transportation transportation, boolean goStop){
            if(goStop){
                transportation.setGoStop(goStop);
                return;
            }
            transportation.setGoStop(goStop);
            transportation.setNowPassenger(0);
        }
        default void passengerRide(Transportation transportation, int num){
            if (transportation.getNowPassenger() + num > transportation.getMaxPassenger()){
                System.out.println("인원 초과");
                return;
            }
            transportation.setNowPassenger(transportation.getNowPassenger()+num);
        }
        default void chargeFuel(Transportation transportation, int num){
            int tmp = transportation.getGas()+num;
            if(tmp < 0){
                tmp=0;
            }
            transportation.setGas(tmp);
            if(tmp<10){
                transportation.setGoStop(false);
                System.out.println("기름 넣어주세요");
            }
        }
}
