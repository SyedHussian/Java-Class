package ClothsIO;

import java.util.*;

import ClothsIO.ClothsIO;

import java.io.*;
import java.nio.file.*;


public class ClothsIO
{
private static final Path ClothsPath = Paths.get("Cloths.txt"); 
private static final File ClothsFile = ClothsPath.toFile();
private static final String FIELD_SEP = "\t"; 
private static List< Cloths > cloths = getAll();

private ClothsIO() {}; 


public static List< Cloths > getAll()
{
	
	if (cloths !=null)
	{
		return cloths;
	}
	
	cloths = new ArrayList<> ();
	
	if (Files.exists(ClothsPath))
	{
		try (BufferedReader in = new BufferedReader( new FileReader(ClothsFile)))
		{
			
			
			String line = in.readLine();
			while (line != null)
			{
				String [] columns = line.split(FIELD_SEP);
				String code = columns[0];
				String description = columns[1];
				String price = columns[2];
				
				Cloths p = new Cloths();
				p.setCode(code);
				p.setDescription(description);
				p.setPrice(Double.parseDouble(price));
				cloths.add(p);
				
				line = in.readLine(); 
			}
			
			
		}
		catch(IOException e)
		{
			System.out.println(e);
			return null;
		}
	}
	return cloths;
}

public static Cloths get(String code) 
{
	for (Cloths p : cloths)
	{
		if (p.getCode().equals(code))
			return p;
	}
	
	return null;
}


private static boolean saveAll()
{
	try(PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter(ClothsFile))))
	{
		
		
		for (Cloths p : cloths)
		{
			out.print(p.getCode() + FIELD_SEP);
			out.print(p.getDescription() + FIELD_SEP);
			out.println(p.getPrice());
			
		}
	}
	catch(IOException e)
	{
	System.out.println(e);
	return false;
    }
return true;
}

//add new product
public static boolean add(Cloths p)
{
	
	cloths.add(p);
	return saveAll();
	
	
}
//delete an existing file
public static boolean delete(Cloths p)
{
	
	cloths.remove(p);
	return saveAll();
	
	
}
//updating a record
public static boolean update(Cloths newCloth)
{
	Cloths oldCloth = get(newCloth.getCode());
	int i = cloths.indexOf(oldCloth);
	cloths.remove(i);


	cloths.add(i, newCloth);

return saveAll();

}
}