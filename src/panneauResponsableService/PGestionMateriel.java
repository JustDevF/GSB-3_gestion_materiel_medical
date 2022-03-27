package panneauResponsableService;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class PGestionMateriel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PGestionMateriel() {
		setLayout(null);
		
		JComboBox comboBoxSuppVehicule = new JComboBox();
		comboBoxSuppVehicule.setBounds(146, 277, 127, 22);
		add(comboBoxSuppVehicule);
		
		JLabel lblNewLabel = new JLabel("Supprimer le vehicule");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 278, 125, 22);
		add(lblNewLabel);
		
		JComboBox comboBoxSuppMatMedical = new JComboBox();
		comboBoxSuppMatMedical.setBounds(190, 140, 263, 22);
		add(comboBoxSuppMatMedical);
		
		JLabel supprimerMaterielMedical = new JLabel("Supprimer le materiel médical");
		supprimerMaterielMedical.setFont(new Font("Roboto", Font.PLAIN, 12));
		supprimerMaterielMedical.setForeground(Color.WHITE);
		supprimerMaterielMedical.setBounds(20, 141, 159, 24);
		add(supprimerMaterielMedical);
		
		JPanel ajouterMaterielMedical = new JPanel();
		ajouterMaterielMedical.setOpaque(false);
		ajouterMaterielMedical.setBorder(new CompoundBorder(
								new CompoundBorder(	new EmptyBorder(5, 5, 5, 5), 
													(Border) new TitledBorder(
															new LineBorder(new Color(0, 0, 0), 1, true),
															"Ajouter un materiel medical", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE)),
								new EmptyBorder(5, 5, 5, 5)));
		ajouterMaterielMedical.setBounds(10, 35, 456, 60);
		add(ajouterMaterielMedical);
		GridBagLayout gbl_ajouterMaterielMedical = new GridBagLayout();
		gbl_ajouterMaterielMedical.columnWidths = new int[]{79, 182, 91, 182, 119, 0};
		gbl_ajouterMaterielMedical.rowHeights = new int[]{26, 0};
		gbl_ajouterMaterielMedical.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_ajouterMaterielMedical.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		ajouterMaterielMedical.setLayout(gbl_ajouterMaterielMedical);
		
		JLabel lblCode = new JLabel("Nom");
		lblCode.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
		GridBagConstraints gbc_lblCode = new GridBagConstraints();
		gbc_lblCode.anchor = GridBagConstraints.EAST;
		gbc_lblCode.insets = new Insets(0, 0, 0, 5);
		gbc_lblCode.gridx = 0;
		gbc_lblCode.gridy = 0;
		ajouterMaterielMedical.add(lblCode, gbc_lblCode);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 0;
		ajouterMaterielMedical.add(textField_2, gbc_textField_2);
		
		JLabel lblDatecreation = new JLabel("Date");
		lblDatecreation.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
		GridBagConstraints gbc_lblDatecreation = new GridBagConstraints();
		gbc_lblDatecreation.anchor = GridBagConstraints.LINE_END;
		gbc_lblDatecreation.insets = new Insets(0, 0, 0, 5);
		gbc_lblDatecreation.gridx = 2;
		gbc_lblDatecreation.gridy = 0;
		ajouterMaterielMedical.add(lblDatecreation, gbc_lblDatecreation);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 0;
		ajouterMaterielMedical.add(textField_3, gbc_textField_3);
		
		JButton btnAction = new JButton("Sauvegarder");
		GridBagConstraints gbc_btnAction = new GridBagConstraints();
		gbc_btnAction.gridx = 4;
		gbc_btnAction.gridy = 0;
		ajouterMaterielMedical.add(btnAction, gbc_btnAction);
		btnAction.setHorizontalAlignment(SwingConstants.LEFT);
		btnAction.setForeground(Color.BLACK);
		btnAction.setFont(new Font("Roboto Lt", Font.BOLD, 12));
		
		JPanel panel_formulaire = new JPanel();
		panel_formulaire.setOpaque(false);
		panel_formulaire.setBorder(new CompoundBorder(
								new CompoundBorder(	new EmptyBorder(5, 5, 5, 5), 
													(Border) new TitledBorder(
															new LineBorder(new Color(0, 0, 0), 1, true),
															"Ajouter Vehicule", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE)),
								new EmptyBorder(5, 5, 5, 5)));
		panel_formulaire.setBounds(10, 190, 456, 71);
		add(panel_formulaire);
		GridBagLayout gbl_panel_formulaire = new GridBagLayout();
		gbl_panel_formulaire.columnWidths = new int[]{79, 182, 91, 182, 119, 0};
		gbl_panel_formulaire.rowHeights = new int[]{26, 0};
		gbl_panel_formulaire.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_formulaire.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_formulaire.setLayout(gbl_panel_formulaire);
		
		JLabel lblCode_1 = new JLabel("Nom");
		lblCode_1.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
		GridBagConstraints gbc_lblCode_1 = new GridBagConstraints();
		gbc_lblCode_1.anchor = GridBagConstraints.EAST;
		gbc_lblCode_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblCode_1.gridx = 0;
		gbc_lblCode_1.gridy = 0;
		panel_formulaire.add(lblCode_1, gbc_lblCode_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 0;
		panel_formulaire.add(textField_4, gbc_textField_4);
		
		JLabel lblDatecreation_1 = new JLabel("Type");
		lblDatecreation_1.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
		GridBagConstraints gbc_lblDatecreation_1 = new GridBagConstraints();
		gbc_lblDatecreation_1.anchor = GridBagConstraints.LINE_END;
		gbc_lblDatecreation_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblDatecreation_1.gridx = 2;
		gbc_lblDatecreation_1.gridy = 0;
		panel_formulaire.add(lblDatecreation_1, gbc_lblDatecreation_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 0;
		panel_formulaire.add(textField_5, gbc_textField_5);
		
		JButton btnAjoutervehicule = new JButton("Sauvegarder");
		GridBagConstraints gbc_btnAjoutervehicule = new GridBagConstraints();
		gbc_btnAjoutervehicule.gridx = 4;
		gbc_btnAjoutervehicule.gridy = 0;
		panel_formulaire.add(btnAjoutervehicule, gbc_btnAjoutervehicule);
		btnAjoutervehicule.setHorizontalAlignment(SwingConstants.LEFT);
		btnAjoutervehicule.setForeground(Color.BLACK);
		btnAjoutervehicule.setFont(new Font("Roboto Lt", Font.BOLD, 12));
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(PGestionMateriel.class.getResource("/images/bg_rs_gestion.png")));
		background.setBounds(0, 0, 661, 371);
		add(background);
		setLayout(null);
		
		
		

	}
}
