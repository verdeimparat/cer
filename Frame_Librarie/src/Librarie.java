import javax.swing.*;

public class Librarie {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frameLibrarie = new JFrame();
        frameLibrarie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLibrarie.setSize(850,450);

        Diverse panelDiverse = new Diverse();
        Carti   panelCarti   = new Carti();
        Jucarii panelJucarii = new Jucarii();

        ImageIcon tabToysIcon = new ImageIcon("D:\\Users\\t0236968\\Desktop\\Frame_Librarie\\Toys.png");
        ImageIcon tabBooksIcon = new ImageIcon("D:\\Users\\t0236968\\Desktop\\Frame_Librarie\\Books.png");
        ImageIcon tabDiverseIcon = new ImageIcon("D:\\Users\\t0236968\\Desktop\\Frame_Librarie\\Diverse.png");

        JTabbedPane tabPanel = new JTabbedPane();
        tabPanel.setBounds(5,5,800,400);

        tabPanel.addTab("Diverse", tabDiverseIcon, panelDiverse);
        tabPanel.addTab("Carti",tabBooksIcon, panelCarti);
        tabPanel.addTab("Jucarii", tabToysIcon, panelJucarii);

        frameLibrarie.add(tabPanel);
        frameLibrarie.pack();
        frameLibrarie.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }}