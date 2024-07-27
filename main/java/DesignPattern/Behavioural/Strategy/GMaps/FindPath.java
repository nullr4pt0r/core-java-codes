package DesignPattern.Behavioural.Strategy.GMaps;

import DesignPattern.Behavioural.Strategy.GMaps.ModeObjFactory.ObjectFactory;
import DesignPattern.Behavioural.Strategy.GMaps.PathFinder.PathFinder;
import exceptions.InvalidInputException;

public class FindPath {
    PathFinder pathFinder  = null;
    void findPath(String source, String destination, Mode mode) throws InvalidInputException {
        //we cannot use if else here. it violates the OCP, SRP
        //As per strategy pattern, we create each class for each mode
        pathFinder = ObjectFactory.getModeObject(mode);
        //we should use Factory for obj creation
        pathFinder.findPath(source, destination);
    }
}
