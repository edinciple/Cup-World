package holder;

import java.io.*;

import cupobjects.*;

public class holder {

	private static String dataFileName = "world.data";
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		CupWorld world = readWorld(dataFileName);
		world = process(world);
		writeWorld(dataFileName, world);
	}
	
	private static CupWorld process(CupWorld world)
	{
		return world;
	}
	
	private static CupWorld readWorld(String filename) throws IOException, ClassNotFoundException
	{
        FileInputStream istream = new FileInputStream(filename); 
        ObjectInputStream q = new ObjectInputStream(istream);
        CupWorld world = (CupWorld)q.readObject();
        q.close();
        return world;
	}
	
	private static void writeWorld(String filename, CupWorld world) throws IOException
	{
		FileOutputStream f = new FileOutputStream(filename);  
	    ObjectOutputStream s = new ObjectOutputStream(f);  
	    s.writeObject(world);  
	    s.flush(); 
	    s.close();
	}

}
