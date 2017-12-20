package
com.turvo.assesment.core.event.listener;

/**
 * SmartHomeListener : Interface that will be implemented by listener classes to
 * listen to respective entity's activity.
 * 
 * @author chandrashekarv
 *
 */
public interface EventListener {

	/**
	 * Registers the given item through respective listener.
	 * 
	 * @param obj
	 * @return
	 */
	public boolean register(Object obj);

	/**
	 * Takes id of the item to be unregistered and invoke respective listener for
	 * unregistering the item.
	 * 
	 * @param id
	 * @return
	 */
	public boolean deRegister(long id);
}
