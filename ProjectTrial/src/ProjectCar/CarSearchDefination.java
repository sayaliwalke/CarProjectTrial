package ProjectCar;
import javax.swing.*;
import java.awt.*;
public class CarSearchDefination extends JFrame{
	//protected JFrame mainFrame;
	private static final String JLable = null;
	protected JPanel leftPanel, vehicleDetailsPanel, topPanel, vehicleDetailsPane;
	protected JButton homeButton, viewDetails, searchButton, clearFiltersButton, moreDetails, clearButton;
	protected JLabel topPicture, modelFilterLabel, yearFilterLabel, brandFilterLabel,
	priceFilterLabel, bodyTypeFilterLabel,categoryFilterLabel, sortLabel, vehicleImageLabel, vehicleModel, vehicleMake,
	vehicleBodyType, vehiclePrice, vehicleCategory, vehicleYear,searchVehicleLabel;
	protected JCheckBox categoryFilter1, categoryFilter2, categoryFilter3, categoryFilter4;
	protected JComboBox yearFilter, brandFilter, modelFilter, priceFilter, bodyTypeFilter, categoryFilter, sort;
	protected JTextField searchBar;
	protected JScrollPane scrollPane,leftscrollPane;
	protected Container container;
	protected CarSearchDefination(){

		this.setSize(1924,500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		container=this.getContentPane();
		topPanel=new JPanel();
		leftPanel = new JPanel();
		vehicleDetailsPanel = new JPanel();


	}

}
