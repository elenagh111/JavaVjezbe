package projekat5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI extends JFrame {

    private JTextField nameField, healthField, xField, yField;
    private JComboBox<String> colliderBox;
    private JTextArea output;
    private Game game;

    public GameGUI() {
        super("Game Setup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        game = new Game();
        initUI();
    }

    private void initUI() {

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6, 6, 6, 6);
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0; c.gridy = 0;
        formPanel.add(new JLabel("Ime"), c);
        nameField = new JTextField();
        c.gridx = 1;
        formPanel.add(nameField, c);

        c.gridx = 0; c.gridy = 1;
        formPanel.add(new JLabel("Health (0–100)"), c);
        healthField = new JTextField();
        c.gridx = 1;
        formPanel.add(healthField, c);

        c.gridx = 0; c.gridy = 2;
        formPanel.add(new JLabel("X pozicija"), c);
        xField = new JTextField();
        c.gridx = 1;
        formPanel.add(xField, c);

        c.gridx = 0; c.gridy = 3;
        formPanel.add(new JLabel("Y pozicija"), c);
        yField = new JTextField();
        c.gridx = 1;
        formPanel.add(yField, c);

        c.gridx = 0; c.gridy = 4;
        formPanel.add(new JLabel("Kolajder"), c);
        colliderBox = new JComboBox<>(new String[]{"Rectangle", "Circle"});
        c.gridx = 1;
        formPanel.add(colliderBox, c);

        JButton startBtn = new JButton("Pokreni igru");
        startBtn.setPreferredSize(new Dimension(200, 40));
        c.gridx = 0; c.gridy = 5;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        formPanel.add(startBtn, c);

        output = new JTextArea();
        output.setEditable(false);
        JScrollPane scroll = new JScrollPane(output);
        startBtn.addActionListener(e -> onStart());

        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

	private Object onStart() {
		// TODO Auto-generated method stub
		return null;
	}
}
