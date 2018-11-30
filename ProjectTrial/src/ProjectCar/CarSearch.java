package ProjectCar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;



import javafx.scene.control.ComboBox;

public class CarSearch extends CarSearchDefination implements CarSearchInterface {
	public CarSearch() {
		super();
	}

	// @Override
	public void setRightPanel() {

	}

	// @Override
	public void setLeftPanel() {

		brandFilterLabel = new JLabel("BRAND");
		modelFilterLabel = new JLabel("MODEL");
		bodyTypeFilterLabel = new JLabel("BODY TYPE");
		yearFilterLabel = new JLabel("YEAR");
		priceFilterLabel = new JLabel("PRICE");
		categoryFilterLabel = new JLabel("CATEGORY");
		searchVehicleLabel = new JLabel("Search Cars");
		searchVehicleLabel.setFont(new Font("Times new Roman", Font.BOLD, 22));
		clearFiltersButton = new JButton("CLEAR FILTERS");
		// clearFilters.setPreferredSize(new Dimension(250,30));
		// clearFilters.setMinimumSize(new Dimension(250,30));
		// clearFilters.setMaximumSize(new Dimension(250,30));

		defineFilters();
		BoxLayout leftPanelLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
		leftPanel.setLayout(leftPanelLayout);
		// Box leftPanel = Box.createVerticalBox();

		leftPanel.add(Box.createVerticalGlue());
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(searchVehicleLabel);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(brandFilterLabel);
		leftPanel.add(brandFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(modelFilterLabel);
		leftPanel.add(modelFilter);
		modelFilter.setPreferredSize(new Dimension(10, 10));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(bodyTypeFilterLabel);
		leftPanel.add(bodyTypeFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(yearFilterLabel);
		leftPanel.add(yearFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(priceFilterLabel);
		leftPanel.add(priceFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(categoryFilterLabel);
		leftPanel.add(categoryFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(clearFiltersButton);
		leftPanel.setBorder(BorderFactory.createTitledBorder("Filters"));
		leftPanel.setBackground(new Color(192, 192, 192));
		leftPanel.setPreferredSize(new Dimension(300, 0));
		leftPanel.setMaximumSize(new Dimension(300, 0));
		leftPanel.setMinimumSize(new Dimension(300, 0));
		container.add(leftPanel, BorderLayout.WEST);

	}

	private void defineFilters() {
		String[] priceFilterItems = new String[] { "0-20000", "20000-30000", "30000-40000", "40000-50000",
				"50000-60000", "60000-70000", ">70000" };
		String[] modelFilterItems = new String[] { "A", "B", "C" };
		String[] brandFilterItems = new String[] { "Jaguar", "BMW", "Merc", "Land Rover" };
		String[] bodyTypeItems = new String[] { "Sedan", "SUV", "HatchBack", "Coupe" };

		modelFilter = new JComboBox(modelFilterItems);
		priceFilter = new JComboBox(priceFilterItems);
		brandFilter = new JComboBox(brandFilterItems);
		bodyTypeFilter = new JComboBox(bodyTypeItems);
		yearFilter = new JComboBox();
		categoryFilter = new JComboBox();
	}
	

	// @Override
	public void setTopPanel() {
		
		
		topPicture = new JLabel(new ImageIcon("Images//VehicleImage.jpg"));
		homeButton = new JButton("HOME");
		searchBar = new JTextField(40);
		searchButton = new JButton("Search");
		sortLabel = new JLabel("SORT:");
		sort = new JComboBox(
				new String[] { "Year ascending", "Year descending", "Price low to high", "Price high to low" });

		topPanel.setBorder(BorderFactory.createTitledBorder("Search"));
	    topPanel.setLayout(new GridBagLayout());
		topPanel.setLayout (new FlowLayout(FlowLayout.CENTER));
		topPanel.add(Box.createRigidArea(new Dimension(200,200)));
		topPanel.add(topPicture);
		topPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		topPanel.add(homeButton);
		topPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		topPanel.add(searchBar);
		topPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		topPanel.add(searchButton);
		topPanel.add(Box.createRigidArea(new Dimension(30, 0)));
		topPanel.add(sortLabel);
		topPanel.add(sort);
		
		topPanel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		topPanel.setBackground(new Color(192,192,192));
		container.add(topPanel,BorderLayout.NORTH);
	}

	public void setvehicleDetailsPanel() {
		// call the function to return List of Vehicles
		// for example there are 5 vehicles
		
		int length = 5;
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//Jaguar.jpg"));
		vehicleList.add(new Vehicle (2,"Audi","TT","Coupe",400,"Images//AudiTT.jpg"));
		vehicleList.add(new Vehicle (1,"BMW","M-5","Sedan",400,"Images//Jaguar.jpg"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//AudiTT.jpg"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//Jaguar.jpg"));
		
		for (int i = 0; i < length; i++) {
			JPanel carItemPanel = new JPanel();
			carItemPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel Picture = new JLabel(new ImageIcon(vehicleList.get(i).getImagePath()));
			JLabel vehicleIdLabel = new JLabel("VEHICLE ID : "+vehicleList.get(i).getVehicleId());
			JLabel brandLabel = new JLabel("BRAND : "+vehicleList.get(i).getBrand());
			JLabel modelLabel = new JLabel("MODEL: "+vehicleList.get(i).getModel());
			JLabel bodyTypeLabel = new JLabel("BODY TYPE : "+vehicleList.get(i).getModel());
			JLabel priceLabel = new JLabel("PRICE : "+vehicleList.get(i).getPrice());	
			carItemPanel.add(Box.createRigidArea(new Dimension(20, 0)));
			carItemPanel.add(Picture);
			carItemPanel.add(Box.createRigidArea(new Dimension(20, 0)));
			carItemPanel.add(brandLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(20, 0)));
			carItemPanel.add(modelLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(20, 0)));
			carItemPanel.add(bodyTypeLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(20, 0)));
			carItemPanel.add(priceLabel);
			carItemPanel.setPreferredSize(new Dimension(1, 1));
			carItemPanel.setBackground(new Color(225,0,0,0));
			vehicleDetailsPane.add(carItemPanel);			
			}

	}

	// @Override
	public void setLayout() {
		setTopPanel();
		setLeftPanel();
		vehicleDetailsPane = new JPanel();
		BoxLayout layout = new BoxLayout(vehicleDetailsPane, BoxLayout.Y_AXIS);
		vehicleDetailsPane.setLayout(layout);
		vehicleDetailsPane.setBackground(Color.WHITE);
		vehicleDetailsPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		scrollPane = new JScrollPane(vehicleDetailsPane);
		container.add(scrollPane);
		setRightPanel();
		setvehicleDetailsPanel();
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
