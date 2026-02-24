package NewJavaProject.NewJavaProject;

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
		create_Execute_Control();
	}
		// get.
	public Execute_Control get_Execute_Control()
	{
		return _Execute_Control;
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
	private static void create_Execute_Control()
	{
		set_Execute_Control(new Execute_Control());
		while(stat_get_Execute_Control() == null) { }
	}
		// get.
	private static Execute_Control stat_get_Execute_Control()
	{
		return _Execute_Control;
	}
		// set.
	private static void set_Execute_Control(Execute_Control newClass)
	{
		_Execute_Control = newClass;
	}
}