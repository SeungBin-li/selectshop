package Transportation.domain;

import Transportation.service.BusService;

public class Bus extends Transportation {
    public Bus(int num){
        super();
        this.setNum(num);
        this.setGoStop(true);
        this.setMaxPassenger(30);

    }

    public static void main(String[] args) {
        // 여러가지 참고해서 만들었지만 무엇을 어떻게 불러와서 확인할지 아직 모르겠습니다...


    }
}
