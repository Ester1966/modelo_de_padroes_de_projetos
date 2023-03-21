package factories;

import button.Button;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
    	return new WindowsButton();
    }
    @Overrride
    public Checkbox createCheckbox() {
    	return new WindowsCheckbox();
    }
}
