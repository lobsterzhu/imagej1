package ij;

	/** Plugins that implement this interface are notified
		when ImageJ is about to run a menu command. */
	public interface CommandListener {

	public String commandExecuting(String command);

}
