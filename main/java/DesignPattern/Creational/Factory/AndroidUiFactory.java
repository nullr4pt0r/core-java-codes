package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.button.AndroidButton;
import DesignPattern.Creational.Factory.button.Button;
import DesignPattern.Creational.Factory.button.IosButton;
import DesignPattern.Creational.Factory.menu.AndroidMenu;
import DesignPattern.Creational.Factory.menu.Menu;

public class AndroidUiFactory implements UiFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
