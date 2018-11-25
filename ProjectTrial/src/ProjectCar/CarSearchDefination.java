package ProjectCar;
import javax.swing.*;
import java.awt.*;
public class CarSearchDefination extends JFrame{
	protected JFrame mainFrame;
	protected JPanel leftPanel, vehicleDetailsPanel, topPanel, vehicleDetailsPane;
    protected JButton homeButton, viewDetails, searchButton, clearFiltersButton;
    protected JLabel topPicture, modelFilterLabel, yearFilterLabel, brandFilterLabel, priceFilterLabel,
                     bodyTypeFilterLabel,categoryFilterLabel, sortLabel, vehicleImageLabel, vehicleModel, vehicleMake,
                     vehicleBodyType, vehiclePrice, vehicleCategory, vehicleYear,searchVehicleLabel;
    protected JComboBox modelFilter, yearFilter, brandFilter, priceFilter, bodyTypeFilter, categoryFilter, sort;
    protected JTextField searchBar;
    protected JScrollPane scrollPane;
    protected Container container;
    protected CarSearchDefination(){
    	
    	container=this.getContentPane();
    	topPanel=new JPanel();
        leftPanel = new JPanel();
        vehicleDetailsPanel = new JPanel();
        
        
  
        this.setSize(1924,1080);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

    }

}
