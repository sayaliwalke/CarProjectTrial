package ProjectCar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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


public class CarSearch extends CarSearchDefination implements CarSearchInterface{
	public CarSearch()
	{
		super();
	}
	
	
	@Override
	public void setRightPanel() {
		
		
	}

	@Override
	public void setLeftPanel() {

		brandFilterLabel = new JLabel("BRAND");
		modelFilterLabel = new JLabel("MODEL");
		bodyTypeFilterLabel = new JLabel("BODY TYPE");
		yearFilterLabel = new JLabel("YEAR");
		priceFilterLabel = new JLabel("PRICE");
		categoryFilterLabel = new JLabel("CATEGORY");
		searchVehicle = new JLabel("Search Cars");
		searchVehicle.setFont(new Font("Times new Roman", Font.BOLD, 22));
		clearFilters = new JButton("CLEAR FILTERS");
		clearFilters.setPreferredSize(new Dimension(250,30));
		clearFilters.setMinimumSize(new Dimension(250,30));
		clearFilters.setMaximumSize(new Dimension(250,30));
		
		defineFilters();
		BoxLayout leftPanelLayout = new BoxLayout(leftPanel,BoxLayout.PAGE_AXIS);
		leftPanel.setLayout(leftPanelLayout);
		leftPanel.add(Box.createVerticalGlue());
		leftPanel.add(Box.createRigidArea(new Dimension(0,100)));
		leftPanel.add(searchVehicle);
		leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		leftPanel.add(modelFilterLabel);
		//leftPanel.add(modelFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		leftPanel.add(brandFilterLabel);
		//leftPanel.add(brandFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		leftPanel.add(bodyTypeFilterLabel);
		//leftPanel.add(bodyTypeFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		leftPanel.add(yearFilterLabel);
		//leftPanel.add(yearFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		leftPanel.add(priceFilterLabel);
		leftPanel.add(priceFilter);
		leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		leftPanel.add(categoryFilterLabel);
		//leftPanel.add(categoryFilter);
		//leftPanel.add(Box.createRigidArea(new Dimension(0,40)));
		//leftPanel.add(clearFilters);
		

		leftPanel.setBorder(BorderFactory.createEmptyBorder(0,40,500,40));
		leftPanel.setBackground(new Color(90,120,90));

		leftPanel.setPreferredSize(new Dimension(300,0));
		leftPanel.setMaximumSize(new Dimension(300,0));
		leftPanel.setMinimumSize(new Dimension(300,0));

		container.add(leftPanel, BorderLayout.WEST);
		
		
	}
	private void defineFilters() {
		String[] priceFilterItems = new String[]{"0-20000","20000-30000","30000-40000","40000-50000",
										"50000-60000","60000-70000",">70000"};
		
		priceFilter = new JComboBox(priceFilterItems);
		
		
	}

	@Override
	public void setTopPanel() {
		topPicture = new JLabel(new ImageIcon("Images\\image.jpg"));
		homeButton = new JButton("HOME");
		searchBar = new JTextField(50);
		searchButton = new JButton("Search");
		sortLabel = new JLabel("SORT:");
		sort = new JComboBox(new String[]{"Year ascending","Year descending","Price low to high","Price high to low"});
		
		
		topPanel.setLayout (new FlowLayout(FlowLayout.LEFT));
		topPanel.add(Box.createRigidArea(new Dimension(200,0)));
		topPanel.add(topPicture);
		topPanel.add(homeButton);
		topPanel.add(Box.createRigidArea(new Dimension(100,0)));
		topPanel.add(searchBar);
		topPanel.add(Box.createRigidArea(new Dimension(10,0)));
		topPanel.add(searchButton);
		topPanel.add(Box.createRigidArea(new Dimension(300,0)));
		topPanel.add(sortLabel);
		topPanel.add(sort);
		topPanel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		topPanel.setBackground(new Color(90,120,50));
		container.add(topPanel,BorderLayout.NORTH);
		}

	@Override
	public void setLayout() {
		
		setTopPanel();
		setLeftPanel();
		vehicleDetailsPane = new JPanel();
		BoxLayout layout = new BoxLayout(vehicleDetailsPane,BoxLayout.PAGE_AXIS);
		vehicleDetailsPane.setLayout(layout);
		vehicleDetailsPane.setBackground(Color.white);
		vehicleDetailsPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		scrollPane = new JScrollPane(vehicleDetailsPane);
		container.add(scrollPane);
		setRightPanel();
		
		this.setVisible(true);
		
		
	}
	
	

}
