package src;

import src.App;

public class Framework 
{
// classes.
	private static App _App = null;
// registers.

// constructor.
	public Framework() 
	{
		stati_create_App();
	}
	
// public.
	// dynamic.
	public void initalise(Framework obj)
	{
		obj.get_App().get_Execute().initalise(obj.get_App().get_Execute());
	}
		// get.
	public App get_App()
	{
		return stat_get_App();
	}
		// set.
	// static.
		// get.
		// set.

// private.
	// dynamic.
		// get.
		// set.
	// static.
	private static void stat_create_App()
	{
		private static App _App = new App();
		while(stat_get_App() == null) { }
	}
		// get.
	private static App stat_get_App()
	{
		return _App;
	}
		// set.
}