
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class MyFrame extends JFrame {


    MyFrame() {

        this.setSize(500, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.setTitle("Run");
        this.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 300);
        setContentPane(panel);
        panel.setLayout(null);


        JButton btnRunButton = new JButton("Run");
        btnRunButton.setBounds(200, 190, 90, 40);
      btnRunButton.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseEntered(MouseEvent e) {
              super.mouseEntered(e);
              btnRunButton.setLocation(20,20);
          }
      });


    }
}

