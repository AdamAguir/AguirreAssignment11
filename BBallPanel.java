import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *  @author: Adam Aguirre
 *  Assignment 10
 *  Date: 4/14/21
 */
public class BBallPanel extends JPanel {

    private ArrayList<Player> players = new ArrayList<Player>();
    private int index = 0;
    private JLabel fNameLBL = new JLabel("First Name");
    private JLabel lNameLBL = new JLabel("Last Name");
    private JLabel shootPctLBL = new JLabel("Shooting %");
    private JLabel reboundsLBL = new JLabel("Rebounds");
    private JLabel assistsLBL = new JLabel("Assists");
    private JLabel turnoversLBL = new JLabel("Turnovers");
    private JLabel currentLBL = new JLabel("0 of 0");
    private JTextField fNameTXT = new JTextField(10);
    private JTextField lNameTXT = new JTextField(10);
    private JTextField shootPctTXT = new JTextField(10);
    private JTextField reboundsTXT = new JTextField(10);
    private JTextField assistsTXT = new JTextField(10);
    private JTextField turnoverseTXT = new JTextField(10);
    private JButton newBTN = new JButton("New");
    private JButton saveBTN = new JButton("Save");
    private JButton exitBTN = new JButton("Exit");
    private JButton toFirstBTN = new JButton("<<<");
    private JButton previousBTN = new JButton("<");
    private JButton nextBTN = new JButton(">");
    private JButton toLastBTN = new JButton(">>>");
    private JPanel panelNorth = new JPanel();
    private JPanel panelCenter = new JPanel();
    private JPanel panelSouth = new JPanel();
    private String fname;
    private String lname;
    private double shootPct;
    private int rebounds;
    private int assists;
    private int turnOvers;

    public BBallPanel() {
        // setBackground(Color.CYAN);
        setLayout(new BorderLayout());

        fNameLBL.setPreferredSize(new Dimension(120, 25));
        lNameLBL.setPreferredSize(new Dimension(120, 25));
        shootPctLBL.setPreferredSize(new Dimension(120, 25));
        assistsLBL.setPreferredSize(new Dimension(120, 25));
        reboundsLBL.setPreferredSize(new Dimension(120, 25));
        turnoversLBL.setPreferredSize(new Dimension(120, 25));
        fNameLBL.setHorizontalAlignment(SwingConstants.RIGHT);
        lNameLBL.setHorizontalAlignment(SwingConstants.RIGHT);
        shootPctLBL.setHorizontalAlignment(SwingConstants.RIGHT);
        assistsLBL.setHorizontalAlignment(SwingConstants.RIGHT);
        reboundsLBL.setHorizontalAlignment(SwingConstants.RIGHT);
        turnoversLBL.setHorizontalAlignment(SwingConstants.RIGHT);

        panelNorth.setBackground(new Color(18, 150, 176));
        panelCenter.setBackground(new Color(14, 192, 227));
        panelSouth.setBackground(new Color(18, 150, 176));

        add(panelNorth, BorderLayout.NORTH);
        add(panelCenter, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);

        panelNorth.add(newBTN);
        panelNorth.add(saveBTN);
        panelNorth.add(exitBTN);
        panelNorth.add(currentLBL);
        panelCenter.add(fNameLBL);
        panelCenter.add(fNameTXT);
        panelCenter.add(lNameLBL);
        panelCenter.add(lNameTXT);
        panelCenter.add(shootPctLBL);
        panelCenter.add(shootPctTXT);
        panelCenter.add(reboundsLBL);
        panelCenter.add(reboundsTXT);
        panelCenter.add(assistsLBL);
        panelCenter.add(assistsTXT);
        panelCenter.add(turnoversLBL);
        panelCenter.add(turnoverseTXT);
        panelSouth.add(toFirstBTN);
        panelSouth.add(previousBTN);
        panelSouth.add(nextBTN);
        panelSouth.add(toLastBTN);

        newBTN.addActionListener(e -> newRecord());
        saveBTN.addActionListener(e -> saveRecord());
        exitBTN.addActionListener(e -> System.exit(0));
        toFirstBTN.addActionListener(e -> firstRecord());
        previousBTN.addActionListener(e -> previousRecord());
        nextBTN.addActionListener(e -> nextRecord());
        toLastBTN.addActionListener(e -> lastRecord());

    }

    private void newRecord() {
        index = players.size();
        currentLBL.setText(players.size() + " of " + (players.size() + 1));
        fNameTXT.setText("");
        lNameTXT.setText("");
        shootPctTXT.setText("");
        reboundsTXT.setText("");
        assistsTXT.setText("");
        turnoverseTXT.setText("");
    }

    private void saveRecord() {
        fname = fNameTXT.getText();
        lname = lNameTXT.getText();
        shootPct = Double.parseDouble(shootPctTXT.getText());
        rebounds = Integer.parseInt(reboundsTXT.getText());
        assists = Integer.parseInt(assistsTXT.getText());
        turnOvers = Integer.parseInt(turnoverseTXT.getText());

        players.add(new Player(fname, lname, shootPct, rebounds, assists, turnOvers));
        newRecord();

    }

    private void firstRecord() {
        index = 0;
        displayRecord();
    }

    private void lastRecord() {
        index = players.size() - 1;
        displayRecord();
    }

    private void nextRecord() {
        if ((index + 1) > players.size() - 1) {
            JOptionPane.showMessageDialog(null, "There are no saved records to show");
        } else {
            index++;
            displayRecord();
        }
    }

    private void previousRecord() {
        if ((index - 1) < 0) {
            JOptionPane.showMessageDialog(null, "There are no saved records to show");
        } else {
            index--;
            displayRecord();
        }
    }

    private void displayRecord() {
        currentLBL.setText((index + 1) + " of " + players.size());
        fNameTXT.setText(players.get(index).getfName());
        lNameTXT.setText(players.get(index).getlName());
        shootPctTXT.setText(String.valueOf(players.get(index).getShootPct()));
        reboundsTXT.setText(String.valueOf(players.get(index).getRebounds()));
        assistsTXT.setText(String.valueOf(players.get(index).getAssists()));
        turnoverseTXT.setText(String.valueOf(players.get(index).getTurnOvers()));
    }
}
