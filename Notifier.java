//Implementing classes are expected to maintain a list of notifiables.
public interface Notifier
{
	void addNotifiable(Notifiable n);	//This should add a new notifiable to the list of notifiables
	void removeNotifiable(Notifiable n);
	void notifyNotifiable();			//This should be able to be called by other classes without issue
}