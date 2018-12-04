package ProjectCar;

import java.awt.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;


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
		searchVehicleLabel.setFont(new Font("Times new Roman", Font.BOLD, 20));
		clearFiltersButton = new JButton("CLEAR FILTERS");
		applyFiltersButton= new JButton("APPLY FILTERS");


		defineFilters();
		BoxLayout leftPanelLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
		leftPanel.setLayout(leftPanelLayout);
		Box leftPanel = Box.createVerticalBox();
		

		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(searchVehicleLabel);
		leftPanel.add(categoryFilterLabel);
		leftPanel.add(categoryFilter1);
		categoryFilter1.setPreferredSize(new Dimension(20, 20));
		leftPanel.add(categoryFilter2);
		categoryFilter2.setPreferredSize(new Dimension(20, 20));
		leftPanel.add(categoryFilter3);
		categoryFilter3.setPreferredSize(new Dimension(20, 20));
		leftPanel.add(categoryFilter4);
		categoryFilter4.setPreferredSize(new Dimension(20, 20));
		
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(brandFilterLabel);
		leftPanel.add(brandFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
	
		leftPanel.add(modelFilterLabel);
		leftPanel.add(modelFilter);
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
		
		leftPanel.add(clearFiltersButton);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(applyFiltersButton);
		
		leftPanel.setBorder(BorderFactory.createTitledBorder("Filters"));
	    leftPanel.setPreferredSize(new Dimension(400,400));
		JScrollPane leftscrollPane = new JScrollPane(leftPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		leftscrollPane.getVerticalScrollBar().setUnitIncrement(20);
		container.add(leftscrollPane, BorderLayout.WEST);
		container.setVisible(true);

	}

	private void defineFilters() {
		String[] priceFilterItems = new String[] { "0-10000", "10000-20000", "20000-30000", "40000-50000",
				"50000-60000", "60000-70000", ">70000" };
		String[] modelFilterItems = new String[] { "A", "B", "C" };
		String[] brandFilterItems = new String[] { "Jaguar", "BMW", "Merc", "Land Rover" };
		String[] bodyTypeItems = new String[] { "Sedan", "SUV", "HatchBack", "Coupe" };
		String[] yearFilterItems = new String[] {"2016", "2017", "2018"};
		
		categoryFilter1 = new JCheckBox("Certified");
		categoryFilter2 = new JCheckBox("New");
		categoryFilter3 = new JCheckBox("Used");
		categoryFilter4 = new JCheckBox("All");
		
		modelFilter = new JComboBox(modelFilterItems);
		priceFilter = new JComboBox(priceFilterItems);
		brandFilter = new JComboBox(brandFilterItems);
		bodyTypeFilter = new JComboBox(bodyTypeItems);
		yearFilter = new JComboBox(yearFilterItems);
		
	}

	// @Override
	public void setTopPanel() {
		
		topPanel = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
            	ImageIcon backImage = new ImageIcon("ProjectTrial//Images//carw.png");
                 g.drawImage(backImage.getImage(), 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        topPanel.setOpaque(true);
		homeButton = new JButton("HOME");
		searchBar = new JTextField(40);
	    Icon homeIcon = new ImageIcon("Images//CarI.png");
		searchButton = new JButton("Search");
		sortLabel = new JLabel("SORT:");
		sort = new JComboBox(
		new String[] { "Year ascending", "Year descending", "Price low to high", "Price high to low" });
		topPanel.setBorder(BorderFactory.createTitledBorder("Dealer Name"));
		topPanel.add(Box.createRigidArea(new Dimension(300,300)));
		topPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		topPanel.add(homeButton);
		topPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		topPanel.add(searchBar);
		topPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		topPanel.add(searchButton);
		topPanel.add(Box.createRigidArea(new Dimension(30, 0)));
		topPanel.add(sortLabel);
		topPanel.add(sort);
		container.add(topPanel,BorderLayout.NORTH);
	}

	public void setvehicleDetailsPanel() {
		// call the function to return List of Vehicles
		// for example there are 7 vehicles
	    int length = 7;
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"ProjectTrial//Images//jaguar.png"));
		vehicleList.add(new Vehicle (2,"Audi","TT","Coupe",400,"ProjectTrial//Images//AudiTT.png"));
		vehicleList.add(new Vehicle (1,"BMW","M-5","Sedan",400,"ProjectTrial//Images//jaguar.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"ProjectTrial//Images//AudiTT.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"ProjectTrial//Images//jaguar.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"ProjectTrial//Images//jaguar.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"ProjectTrial//Images//jaguar.png"));
		for (int i = 0; i < length; i++) {
			JPanel carItemPanel = new JPanel();
			carItemPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel Picture = new JLabel(new ImageIcon(vehicleList.get(i).getImagePath()));
			JLabel vehicleIdLabel = new JLabel("VEHICLE ID : "+vehicleList.get(i).getVehicleId());
			JLabel brandLabel = new JLabel("BRAND : "+vehicleList.get(i).getBrand());
			JLabel modelLabel = new JLabel("MODEL: "+vehicleList.get(i).getModel());
			JLabel bodyTypeLabel = new JLabel("BODY TYPE : "+vehicleList.get(i).getModel());
			JLabel priceLabel = new JLabel("PRICE : "+vehicleList.get(i).getPrice());	
			JButton moreDetails = new JButton("More Details");
			carItemPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			carItemPanel.add(Picture);
			carItemPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			carItemPanel.add(brandLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			carItemPanel.add(modelLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			carItemPanel.add(bodyTypeLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			carItemPanel.add(priceLabel);
			carItemPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			carItemPanel.add(moreDetails);
			carItemPanel.setPreferredSize(new Dimension(300,220));
			carItemPanel.setBackground(new Color(225,0,0,0));
			carItemPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
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
		setvehicleDetailsPanel();
		scrollPane = new JScrollPane(vehicleDetailsPane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getVerticalScrollBar().setUnitIncrement(20);
 		container.add(scrollPane);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
