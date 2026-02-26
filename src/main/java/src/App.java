package src;

import src.Algorithms;
import src.Data;
import src.Execute;
import src.Global;

public class App 
{
// classes.

// registers.
	private static Algorithms _Algorithms = null;
	private static Data _Data = null;
	private static Execute _Execute = null;
	private static Global _Global = null;
	
// constructor.
	public App() 
	{
		create_Global();
		create_Algorithm();
		create_Data();
		create_Execute();
	}
	
// public.
	// dynamic.
		// get.
	public Algorithms get_Algorithms()
	{
		return stat_get_Algorithms();
	}
	public Data get_Data()
	{
		return stat_get_Data();
	}
	public Execute get_Execute()
	{
		return stat_get_Execute();
	}
	public Global get_Global()
	{
		return stat_get_Global();
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
	private static void create_Algorithm()
	{
		set_Algorithms(new Algorithms());
		while(stat_get_Algorithms() == null) { }
	}
	private static void create_Data()
	{
		set_Data(new Data());
		while(stat_get_Data() == null) { }
	}
	private static void create_Execute()
	{
		set_Execute(new Execute());
		while(stat_get_Execute() == null) { }
	}
	private static void create_Global()
	{
		set_Global(new Global());
		while(stat_get_Global() == null) { }
	}
		// get.
	private static Algorithms stat_get_Algorithms()
	{
		return _Algorithms;
	}
	private static Data stat_get_Data()
	{
		return _Data;
	}
	private static Execute stat_get_Execute()
	{
		return _Execute;
	}
	private static Global stat_get_Global()
	{
		return _Global;
	}
		// set.
	private static void set_Algorithms(Algorithms newClass) 
	{
		_Algorithms = newClass;
	}
	private static void set_Data(Data newClass) 
	{
		_Data = newClass;
	}
	private static void set_Execute(Execute newClass) 
	{
		_Execute = newClass;
	}
	private static void set_Global(Global newClass) 
	{
		_Global = newClass;
	}
}