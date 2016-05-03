package model.data.Cards.EventCard;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.data.DataGame;
import model.data.EmptyException;
import model.states.AwaitOption;
import model.states.IStates;

public class SmallInvasionForce extends EventCard{
private static final String name = "Small Invasion Force";

    public SmallInvasionForce(DataGame d) {
        super(d);
    }

    @Override
    public IStates makeEventActionYear1() {
    try {
        getDataGame().fightAgainstSystem(0, 1, "Planetary Defenses");
    } catch (EmptyException ex) {
        return new AwaitOption(getDataGame());
    }
        
        return new AwaitOption(getDataGame());
    }
    
    @Override
    public IStates makeEventActionYear2() {
    try {
        getDataGame().fightAgainstSystem(0, 2, "Planetary Defenses");
    } catch (EmptyException ex) {
        return new AwaitOption(getDataGame());
    }
        
        return new AwaitOption(getDataGame());
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public String getNameEvent(){
        return this.name;
    }

}
