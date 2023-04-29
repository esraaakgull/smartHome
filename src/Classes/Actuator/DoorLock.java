package Classes.Actuator;

import Classes.Control.Mediator;

public class DoorLock extends Actuator<Boolean> {

    public DoorLock(int id, Mediator mediator) {
        super(id, mediator, "motion");
    }

    @Override
    public void performAction(Boolean isOpen) {
        super.mediator.setDoorValue(isOpen);
    }
}
