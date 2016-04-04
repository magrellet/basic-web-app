package tutorial.mvc;

/**
 * Created by Martin on 03/04/2016.
 */
public class Car {

    private Engine engine;
    private String warningMessage;
    public Car(Engine engine){
        this.engine = engine;
    }

    public void accelerate(){
        engine.increaseRpm();
        if(engine.getRpm() > 5000){
            setWarningMessage("Slow Down!");
        }
    }
    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
}
