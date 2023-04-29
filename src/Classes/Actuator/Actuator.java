package Classes.Actuator;

import Classes.Control.Mediator;

public abstract class Actuator<T> {
    private final int id;
    private final String type;
    protected final Mediator mediator;

    public Actuator(int id, Mediator mediator, String type) {
        this.id = id;
        this.mediator = mediator;
        this.type = type;
    }

    public abstract void performAction(T value);


    public int getId() {
        return this.id;
    }

    public String getType(){
        return this.type;
    }

}
