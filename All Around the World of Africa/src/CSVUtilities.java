import java.io.File;
import java.util.List;

public interface CSVUtilities
{
	public void CSVUtilities(File csv);
	
	public void printData();
	
	public List<String> getDataString(int column);
	
	public List<Integer> getDataInt(int column);
	
	public List<Double> getDataDouble(int column);
	
}
