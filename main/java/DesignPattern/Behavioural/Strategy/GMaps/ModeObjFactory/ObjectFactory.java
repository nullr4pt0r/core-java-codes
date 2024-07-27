package DesignPattern.Behavioural.Strategy.GMaps.ModeObjFactory;

import DesignPattern.Behavioural.Strategy.GMaps.Mode;
import DesignPattern.Behavioural.Strategy.GMaps.PathFinder.*;
import exceptions.InvalidInputException;

public class ObjectFactory {
    //we can also make use of registry to reuse the objects
    public static PathFinder getModeObject(Mode mode) throws InvalidInputException {
        if(mode == Mode.WALK){
            return new WalkPathFinder();
        }else if(mode == Mode.CAR){
            return new CarPathFinder();
        }else if(mode == Mode.BIKE){
            return new BikePathFinder();
        }else if(mode == Mode.TRAIN){
            return new TrainPathFinder();
        }else{
            throw new InvalidInputException("Invalid Mode");
        }
    }
}
