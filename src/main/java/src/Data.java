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
		create_Input();
		create_Output();
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
	private static void create_Input()
	{
		set_Input(new Input());
		while(stat_get_Output() == null) { }
	}
	private static void create_Output()
	{
		set_Output(new Output());
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
	private static void set_Input(Input newClass)
	{
		_Input = newClass;
	}
	private static void set_Output(Output newClass)
	{
		_Output = newClass;
	}
}