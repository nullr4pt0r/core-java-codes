package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.button.Button;
import DesignPattern.Creational.Factory.menu.Menu;

public interface UiFactory {
    Button createButton();

     Menu createMenu();
}
