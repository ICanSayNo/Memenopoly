import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> objects;
	ArrayList<Space> spaces=new ArrayList<Space>() ;
	ObjectManager(){
		initSpaces();
	}
	
public void initSpaces() {
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
	spaces.add(new Space(1150,800,120,90));
}
}

