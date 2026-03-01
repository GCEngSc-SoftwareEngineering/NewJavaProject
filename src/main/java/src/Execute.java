package src;

import src.Execute_Control;

public class Execute 
{
// classes.
	private static Execute_Control _Execute_Control = null;
	
// registers.

// constructor.
	public Execute()
	{
		
	}
	
// public.
	// dynamic.
	public void initalise(Execute obj)
	{
		stat_create_Execute_Control();
	}
		// get.
	public Execute_Control get_Execute_Control()
	{
		return stat_get_Execute_Control;
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
	private static void stat_create_Execute_Control()
	{
		private static Execute_Control _Execute_Control = new Execute_Control();
		while(stat_get_Execute_Control() == null) { }
	}
		// get.
	private static Execute_Control stat_get_Execute_Control()
	{
		return _Execute_Control;
	}
		// set.
}