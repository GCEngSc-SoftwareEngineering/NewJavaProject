package src;

import src.Input;
import src.Output;

public class Data 
{
// classes.
	private static Input _Input = null;
	private static Output _Output = null;
	
// registers.

// constructor.
	public Data() 
	{
		stat_create_Input();
		stat_create_Output();
	}
// public.
	// dynamic.
		// get.
	public Input get_Input() 
	{
		return stat_get_Input();
	}
	public Output get_Output()
	{
		return stat_get_Output();
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
	private static void stat_create_Input()
	{
		private static Input _Input = new Input();
		while(stat_get_Output() == null) { }
	}
	private static void stat_create_Output()
	{
		private static Output _Output = new Output();
		while(stat_get_Input() == null) { }
	}
		// get.
	private static Input stat_get_Input()
	{
		return _Input;
	}
	private static Output stat_get_Output()
	{
		return _Output;
	}
		// set.
}