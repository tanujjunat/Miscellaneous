import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

	static List<List<String>> addressList = null;
	static List<EntityObject> entityList = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		populateList();
		populateListOfEntityObject();
		
		for(int i=0;i<addressList.size();i++)
		{
			System.out.println(addressList.get(i));
		}
		
		for(int i=0;i<entityList.size();i++)
		{
			System.out.println(entityList.get(i).addLine1);
		}
		
		
		/* for(int i=0;i<addressList.size();i++)
		{
			entityList.get(i).setAddLine1(addressList.get(i));
		} */
						
		List<EntityObject> entityListOne = IntStream.range(0, addressList.size())
													.mapToObj(i -> mapping(entityList.get(i), addressList.get(i)))
													.collect(Collectors.toList());

		
		for(int i=0;i<entityListOne.size();i++)
		{
			System.out.println(entityListOne.get(i).addLine1);
		}
	}
	
	private static EntityObject mapping(EntityObject entityObject, List<String> address) {
			entityObject.setAddLine1(address);
		return entityObject;
	}

	private static void populateList()
	{
		List<String> addList = Arrays.asList("House 123");
		List<String> addList1 = Arrays.asList("House 456");
		List<String> addList2 = Arrays.asList("House 789");
		addressList = Arrays.asList(addList, addList1, addList2);
		
	}
	
	private static void populateListOfEntityObject()
	{
		EntityObject enObj = new EntityObject();
		enObj.setAddLine1(Arrays.asList("H 123"));
		enObj.setAddLine2("Gurgaon");
		
		EntityObject enObj1 = new EntityObject();
		enObj1.setAddLine1(Arrays.asList("H 456"));
		enObj1.setAddLine2("Gurgaon");
		
		EntityObject enObj2 = new EntityObject();
		enObj2.setAddLine1(Arrays.asList("H 789"));
		enObj2.setAddLine2("Gurgaon");
		
		entityList = Arrays.asList(enObj,enObj1,enObj2);
		
		
	}

}
