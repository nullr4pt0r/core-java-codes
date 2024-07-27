package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.button.Button;
import DesignPattern.Creational.Factory.button.IosButton;
import DesignPattern.Creational.Factory.menu.IosMenu;
import DesignPattern.Creational.Factory.menu.Menu;

public class IosUiFactory implements UiFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }


}
