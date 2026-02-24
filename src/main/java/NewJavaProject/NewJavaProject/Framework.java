package NewJavaProject.NewJavaProject;

public class Framework 
{
// classes.
	private static App _App = null;
// registers.

// constructor.
	public Framework() 
	{
		create_App();
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
	private static void create_App()
	{
		set_App(new App());
		while(stat_get_App() == null) { }
	}
		// get.
	private static App stat_get_App()
	{
		return _App;
	}
		// set.
	private static void set_App(App newClass) 
	{
		_App = newClass;
	}
}