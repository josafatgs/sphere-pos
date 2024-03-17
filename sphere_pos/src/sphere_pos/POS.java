package sphere_pos;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;

public class POS {

	private JFrame frmSpherePos;
	private JTextField txtBuscarProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POS window = new POS();
					window.frmSpherePos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public POS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpherePos = new JFrame();
		frmSpherePos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Josafat\\Downloads\\DALL·E 2024-03-04 12.56.53 - Logo SPHERE POS.png"));
		frmSpherePos.setBackground(Color.WHITE);
		frmSpherePos.getContentPane().setBackground(Color.WHITE);
		frmSpherePos.setTitle("Sphere POS");
		frmSpherePos.setBounds(100, 100, 1024, 768);
		frmSpherePos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSpherePos.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Josafat\\Downloads\\DALL·E 2024-03-04 12.56.53 - Logo SPHERE POS.png");
		Image img = icon.getImage();
		img = img.getScaledInstance(46, 46, Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		
		ImageIcon x_icon = new ImageIcon("C:\\Users\\Josafat\\Downloads\\x_icon.png");
		Image x_img = x_icon.getImage();
		x_img = x_img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		x_icon = new ImageIcon(x_img);
		
		ImageIcon discount_icon = new ImageIcon("C:\\Users\\Josafat\\Downloads\\discount_icon.png");
		Image discount_img = discount_icon.getImage();
		discount_img = discount_img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		discount_icon = new ImageIcon(discount_img);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setBackground(new Color(238, 234, 234));
		panelHeader.setPreferredSize(new Dimension(1024, 60));
		frmSpherePos.getContentPane().add(panelHeader, BorderLayout.NORTH);
		
		UIManager.put("TabbedPane.selected", Color.decode("#F5A547"));
		UIManager.put("TabbedPane.tabInsets", new Insets(7, 30, 7, 30));
		UIManager.put("TabbedPane.font", new Font("Arial", Font.PLAIN, 16));
		
		JTabbedPane tabbedMenu = new JTabbedPane(JTabbedPane.TOP);
		tabbedMenu.setBorder(null);
		tabbedMenu.setBackground(Color.WHITE);
		tabbedMenu.setBorder(BorderFactory.createEmptyBorder());
		frmSpherePos.getContentPane().add(tabbedMenu, BorderLayout.CENTER);
		
		
		/* ============================ Dashboard Panel ============================ */
		
		JPanel panelDashboard = new JPanel();
		panelDashboard.setBorder(null);
		panelDashboard.setBackground(Color.WHITE);
		tabbedMenu.addTab("Dashboard", null, panelDashboard, null);
		tabbedMenu.setBackgroundAt(0, Color.decode("#D9D9D9"));
		panelDashboard.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(40, 25, 125, 35);
		panelDashboard.add(lblNewLabel);
		
		/* ============================ Ventas Panel ============================ */
		
		JPanel panelSales = new JPanel();
		panelSales.setBackground(Color.WHITE);
		tabbedMenu.addTab("Ventas", null, panelSales, null);
		tabbedMenu.setBackgroundAt(1, Color.decode("#D9D9D9"));
		panelSales.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 234, 234));
		panel.setBounds(0, 0, 688, 641);
		panelSales.add(panel);
		panel.setLayout(null);
		
		txtBuscarProducto = new JTextField();
		txtBuscarProducto.setFont(new Font("Arial", Font.PLAIN, 16));
		txtBuscarProducto.setText("Buscar Producto");
		txtBuscarProducto.setBounds(27, 10, 358, 28);
		panel.add(txtBuscarProducto);
		txtBuscarProducto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Categoría");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(27, 44, 154, 19);
		panel.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"UNO", "DOS", "TRES", "CUATRO"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Arial", Font.PLAIN, 16));
		list.setBounds(120, 44, 100, 18);
		panel.add(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(686, 0, 323, 641);
		panelSales.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Carrito");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 10, 80, 16);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("TOTAL             $00.00");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(20, 585, 282, 46);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Descuento");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(20, 509, 80, 16);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("$00.00");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(200, 511, 100, 16);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Subtotal");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(20, 486, 80, 16);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("$00.00");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(200, 488, 100, 16);
		panel_1.add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(x_icon);
		btnNewButton_1.setBounds(20, 537, 135, 46);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(discount_icon);
		btnNewButton_1_1_1.setBounds(166, 537, 135, 46);
		panel_1.add(btnNewButton_1_1_1);
		
		/* ============================ Compras Panel ============================ */
		
		JPanel panelShopping = new JPanel();
		panelShopping.setBackground(Color.WHITE);
		tabbedMenu.addTab("Compras", null, panelShopping, null);
		tabbedMenu.setBackgroundAt(2, Color.decode("#D9D9D9"));
		panelShopping.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Compras");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(40, 25, 89, 32);
		panelShopping.add(lblNewLabel_2);
		
		/* ============================ Inventario Panel ============================ */
		
		JPanel panelInventary = new JPanel();
		panelInventary.setBackground(Color.WHITE);
		tabbedMenu.addTab("Inventario", null, panelInventary, null);
		tabbedMenu.setBackgroundAt(3, Color.decode("#D9D9D9"));
		panelInventary.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Inventario");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(40, 25, 106, 36);
		panelInventary.add(lblNewLabel_3);
		
		/* ============================ Corte Panel ============================ */
		
		JPanel panelCloseSales = new JPanel();
		panelCloseSales.setBackground(Color.WHITE);
		tabbedMenu.addTab("Corte", null, panelCloseSales, null);
		tabbedMenu.setBackgroundAt(4, Color.decode("#D9D9D9"));
		panelCloseSales.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Corte");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(40, 25, 85, 35);
		panelCloseSales.add(lblNewLabel_4);
		
		/* ============================ Configuración Panel ============================ */
		
		JPanel panelConfiguration = new JPanel();
		panelConfiguration.setBackground(Color.WHITE);
		tabbedMenu.addTab("Configuración", null, panelConfiguration, null);
		tabbedMenu.setBackgroundAt(5, Color.decode("#D9D9D9"));
		panelConfiguration.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Configuración");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(40, 25, 150, 30);
		panelConfiguration.add(lblNewLabel_5);
		
		
	}
}
