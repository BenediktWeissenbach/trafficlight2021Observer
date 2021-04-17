import trafficlight.ctrl.TrafficLightCtrl;


public class MCP {

    //https://mattcarroll.medium.com/singletons-the-safe-way-9d1e019220fc
    public static void main(String[] args) {}

    private MCP(){
        TrafficLightCtrl ctrl = new TrafficLightCtrl();
        ctrl.run();
    }

    private static MCP instance;

    public static MCP getInstance(){
        if(null == MCP.instance){
            MCP.instance = new MCP();
        }
        return MCP.instance;
    }

}