package NewJavaProject.NewJavaProject;

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
	private static void create_Framework() 
	{
		set_Framework(new Framework());
		while(get_Framework() == null) { }
	}
		// get.
	private static Framework get_Framework()
	{
		return _framework;
	}
		// set.
	private static void set_Framework(Framework newClass) 
	{
		_framework = newClass;
	}
}