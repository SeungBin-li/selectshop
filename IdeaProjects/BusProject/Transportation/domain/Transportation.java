package Transportation.domain;

public abstract class Transportation {


    int maxPassenger;
    private int nowPassenger;
    private int fare;
    private int num;
    private int gas;
    private int NowSpeed;
    private boolean goStop;

    public Transportation() {
        this.gas=100;
        this.NowSpeed = 0;
        this.nowPassenger=0;
        System.out.println();
    }
    public void departure(){
        this.goStop = goStop;
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
    public boolean getGostop() {
        return goStop;
    }
    public void setGoStop(Boolean goStop){
        this.goStop = goStop;
    }
    public int getGas(){
        return gas;
    }
    public void setGas(int gas){
        this.gas = gas;
    }

    public int getSpeed(){
        return NowSpeed;
    }
    public void setNowSpeed(int NowSpeed){
        this.NowSpeed = NowSpeed;
    }
    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getNowPassenger() {
        return nowPassenger;
    }

    public void setNowPassenger(int nowPassenger) {
        this.nowPassenger = nowPassenger;
    }
}
