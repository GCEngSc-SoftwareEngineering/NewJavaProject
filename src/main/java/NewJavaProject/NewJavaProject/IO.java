package NewJavaProject.NewJavaProject;

import src.Framework;

public class IO 
{
// classes.
	private static Framework _framework = null;
	
// registers.

// constructor.

// public.
	// dynamic.
		// get.
		// set.
	// static.
	public static Framework initialise_Program()
	{
		create_Framework();
		get_Framework().initalise(get_Framework());
		return get_Framework();
	}
		// get.
		// set.

// private.
	// dynamic.
		// get.
		// set.
	// static.
	private static void stat_create_Framework() 
	{
		private static Framework _framework = new Framework());
		while(get_Framework() == null) { }
	}
		// get.
	private static Framework stat_get_Framework()
	{
		return _framework;
	}
		// set.
}