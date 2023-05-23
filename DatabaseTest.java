
public class DatabaseTest {
    public static void main(String[] args) {
        
         DaoInterface dao = new DaoInterfaceImp();
        DataBaseGUI gui = new DataBaseGUI(dao);
    }
    
}
