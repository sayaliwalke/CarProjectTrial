package ProjectCar;
import javax.swing.*;
import java.awt.*;
public class CarSearchDefination extends JFrame{
	//protected JFrame mainFrame;
	private static final String JLable = null;
	protected JPanel leftPanel, vehicleDetailsPanel, topPanel, vehicleDetailsPane;
	protected JButton homeButton, viewDetails, searchButton, clearFiltersButton, moreButton1, moreButton2, moreButton3, moreButton4, 
	moreButton5, moreButton6,moreDetails, clearButton, clearButton1, clearButton2, clearButton3, clearButton4, clearButton5, clearButton6;
	protected JLabel topPicture, modelFilterLabel, yearFilterLabel, brandFilterLabel,
	priceFilterLabel, bodyTypeFilterLabel,categoryFilterLabel, sortLabel, vehicleImageLabel, vehicleModel, vehicleMake,
	vehicleBodyType, vehiclePrice, vehicleCategory, vehicleYear,searchVehicleLabel;
	JCheckBox modelFilterA, modelFilterB, modelFilterC, bodyTypeFilter1, bodyTypeFilter2, bodyTypeFilter3, bodyTypeFilter4,
	priceFiltera, priceFilterb, priceFilterc, priceFilterd, priceFiltere, priceFilterf, priceFilterg, 
	brandFilter1, brandFilter2, brandFilter3, brandFilter4, yearFilter1, yearFilter2, yearFilter3,categoryFilter1,
	categoryFilter2, categoryFilter3, categoryFilter4;
	protected JComboBox yearFilter, brandFilter, priceFilter, bodyTypeFilter, categoryFilter, sort;
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
