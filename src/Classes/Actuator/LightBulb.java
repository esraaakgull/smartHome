package Classes.Actuator;

import Classes.Control.Mediator;

public class LightBulb extends Actuator<Boolean> {

    public LightBulb(int id, Mediator mediator) {
        super(id, mediator, "light");
    }

    @Override
    public void performAction(Boolean isTurnedOn) {
        super.mediator.setLightValue(isTurnedOn);
    }
}
