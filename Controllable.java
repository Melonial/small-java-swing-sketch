import javax.swing.*;

//Classes that inherits this can be controlled by JButtons
abstract class Controllable extends Module
{
	abstract void onButtonClick();
}