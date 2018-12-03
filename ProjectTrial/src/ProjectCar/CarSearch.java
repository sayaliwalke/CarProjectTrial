package ProjectCar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;
import com.sun.prism.Image;

import javafx.scene.control.ComboBox;
import javafx.scene.layout.Border;

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
		moreButton1 = new JButton("MORE");
		moreButton2 = new JButton("MORE");
		moreButton3 = new JButton("MORE");
		moreButton4 = new JButton("MORE");
		moreButton5 = new JButton("MORE");
		moreButton6 = new JButton("MORE");
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
		leftPanel.add(brandFilter1);
		brandFilter1.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(brandFilter2);
		brandFilter2.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(brandFilter3);
		brandFilter3.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(brandFilter4);
		brandFilter4.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(moreButton1);
		moreButton1.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(modelFilterLabel);
		leftPanel.add(modelFilterA);
		modelFilterA.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(modelFilterB);
		modelFilterB.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(modelFilterC);
		modelFilterC.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(moreButton2);
		moreButton2.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(bodyTypeFilterLabel);
		leftPanel.add(bodyTypeFilter1);
		bodyTypeFilter1.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(bodyTypeFilter2);
		bodyTypeFilter2.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(bodyTypeFilter3);
		bodyTypeFilter3.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(bodyTypeFilter4);
		bodyTypeFilter4.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(moreButton3);
		moreButton3.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(yearFilterLabel);
		leftPanel.add(yearFilter1);
		yearFilter1.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(yearFilter2);
		yearFilter2.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(yearFilter3);
		yearFilter3.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(moreButton4);
		moreButton4.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(priceFilterLabel);
		leftPanel.add(priceFiltera);
		priceFiltera.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(priceFilterb);
		priceFilterb.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(priceFilterc);
		priceFilterc.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(priceFilterd);
		priceFilterd.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(priceFiltere);
		priceFiltere.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(priceFilterf);
		priceFilterf.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(priceFilterg);
		priceFilterg.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(moreButton5);
		moreButton5.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(categoryFilterLabel);
		leftPanel.add(categoryFilter1);
		categoryFilter1.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(categoryFilter2);
		categoryFilter2.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(categoryFilter3);
		categoryFilter3.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(categoryFilter4);
		categoryFilter4.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(moreButton6);
		moreButton6.setPreferredSize(new Dimension(50, 50));
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(clearFiltersButton);
		leftPanel.setBorder(BorderFactory.createTitledBorder("Filters"));
		leftPanel.setBackground(new Color(192, 192, 192));
		leftPanel.setPreferredSize(new Dimension(300,1500));
		JScrollPane leftscrollPane = new JScrollPane(leftPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		leftscrollPane.getVerticalScrollBar().setUnitIncrement(20);
		container.add(leftscrollPane, BorderLayout.WEST);
		container.setVisible(true);

	}

	private void defineFilters() {
		String[] priceFilterItems = new String[] { "0-20000", "20000-30000", "30000-40000", "40000-50000",
				"50000-60000", "60000-70000", ">70000" };
		String[] modelFilterItems = new String[] { "A", "B", "C" };
		String[] brandFilterItems = new String[] { "Jaguar", "BMW", "Merc", "Land Rover" };
		String[] bodyTypeItems = new String[] { "Sedan", "SUV", "HatchBack", "Coupe" };
		String[] yearFilterItems = new String[] {"2016", "2017", "2018"};

		//modelFilter = new JComboBox(modelFilterItems);
		modelFilterA = new JCheckBox("A");
		modelFilterB = new JCheckBox("B");
		modelFilterC = new JCheckBox("C");
		//priceFilter = new JComboBox(priceFilterItems);
		priceFiltera = new JCheckBox("0-20000");
		priceFilterb = new JCheckBox("20000-30000");
		priceFilterc = new JCheckBox("30000-40000");
		priceFilterd = new JCheckBox("40000-50000");
		priceFiltere = new JCheckBox("50000-60000");
		priceFilterf = new JCheckBox("60000-70000");
		priceFilterg = new JCheckBox(">70000");
		//brandFilter = new JComboBox(brandFilterItems);
		brandFilter1 = new JCheckBox("Jaguar");
		brandFilter2 = new JCheckBox("BMW");
		brandFilter3 = new JCheckBox("Merc");
		brandFilter4 = new JCheckBox("Land Rover");
		//bodyTypeFilter = new JComboBox(bodyTypeItems);
		bodyTypeFilter1 = new JCheckBox("Sedan");
		bodyTypeFilter2 = new JCheckBox("SUV");
		bodyTypeFilter3 = new JCheckBox("HatchBack");
		bodyTypeFilter4 = new JCheckBox("Coupe");
		//yearFilter = new JComboBox();
		yearFilter1 = new JCheckBox("2016");
		yearFilter2 = new JCheckBox("2017");
		yearFilter3 = new JCheckBox("2018");
		//categoryFilter = new JComboBox();
		categoryFilter1 = new JCheckBox("Certified");
		categoryFilter2 = new JCheckBox("New");
		categoryFilter3 = new JCheckBox("Used");
		categoryFilter4 = new JCheckBox("All");
		
	}

	// @Override
	public void setTopPanel() {
		
		topPanel = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
            	ImageIcon backImage = new ImageIcon("Images//carw.png");
                 g.drawImage(backImage.getImage(), 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        topPanel.setOpaque(true);
		homeButton = new JButton("HOME");
		searchBar = new JTextField(40);
		
		topPicture = new JLabel(new ImageIcon("Images//Image.jpg"));
	    Icon homeIcon = new ImageIcon("Images//CarI.png");
		searchButton = new JButton("Search");
		sortLabel = new JLabel("SORT:");
		sort = new JComboBox(
		new String[] { "Year ascending", "Year descending", "Price low to high", "Price high to low" });
		topPanel.setBorder(BorderFactory.createTitledBorder("Dealer Name"));
		topPanel.add(Box.createRigidArea(new Dimension(200,200)));
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
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//jaguar.png"));
		vehicleList.add(new Vehicle (2,"Audi","TT","Coupe",400,"Images//AudiTT.png"));
		vehicleList.add(new Vehicle (1,"BMW","M-5","Sedan",400,"Images//jaguar.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//AudiTT.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//jaguar.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//jaguar.png"));
		vehicleList.add(new Vehicle (1,"Jaguar","XE","Sedan",400,"Images//jaguar.png"));
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
