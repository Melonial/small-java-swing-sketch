//Classes that inherits this can be controlled by other Modules
abstract class Notifiable extends Module
{
	abstract void doAction();
	abstract void doAction(int i);
}