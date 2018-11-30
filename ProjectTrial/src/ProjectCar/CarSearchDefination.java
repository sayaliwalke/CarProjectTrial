package ProjectCar;
import javax.swing.*;
import java.awt.*;
public class CarSearchDefination extends JFrame{
	private static final String JLable = null;
	protected JPanel leftPanel, vehicleDetailsPanel, topPanel, vehicleDetailsPane;
    protected JButton homeButton, viewDetails, searchButton, clearFiltersButton;
    protected JLabel topPicture, modelFilterLabel, yearFilterLabel, brandFilterLabel,background,
    				 priceFilterLabel, bodyTypeFilterLabel,categoryFilterLabel, sortLabel, vehicleImageLabel, vehicleModel, vehicleMake,
                     vehicleBodyType, vehiclePrice, vehicleCategory, vehicleYear,searchVehicleLabel;
    protected JComboBox modelFilter, yearFilter, brandFilter, priceFilter, bodyTypeFilter, categoryFilter, sort;
    protected JTextField searchBar;
    protected JScrollPane scrollPane;
    protected Container container;
    protected CarSearchDefination(){
    	
    	 this.setSize(1924,1080);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
    	container=this.getContentPane();
    	topPanel=new JPanel();
        leftPanel = new JPanel();
        vehicleDetailsPanel = new JPanel();
       

    }

}
