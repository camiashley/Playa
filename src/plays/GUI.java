


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;


public class GUI implements ActionListener {
    private static JFrame frame;
    private static JButton login;
    private static JTextField text;
    private static JPasswordField pass;
    private static JButton SignUp;
    public GUI(){
        login = new JButton("login");
        login.setBounds(350, 400, 100, 30);
        login.addActionListener(this);
        frame.add(login);

        SignUp = new JButton("Sign Up");
        SignUp.setBounds(500, 400, 100, 30);
        SignUp.addActionListener(this);
        frame.add(SignUp);


    }
    public static void main(String[] args) {


        ImageIcon image = new ImageIcon("/Users/camihawkins/DataB/src/P.jpeg");
        Border border = BorderFactory.createLineBorder(Color.YELLOW,3);

        ImageIcon image2 = new ImageIcon("/Users/camihawkins/DataB/src/squig.png");
        Image scaleImage = image2.getImage().getScaledInstance(950, 100,Image.SCALE_DEFAULT);
        ImageIcon audio = new ImageIcon(scaleImage);








        JLabel label = new JLabel();
        label.setText("What's up Player?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.YELLOW);
        label.setFont(new Font(Font.SERIF, Font.ITALIC,20));
        label.setBorder(border);



        frame = new JFrame();


        JLabel white = new JLabel();
        white.setIcon(audio);
        white.setBounds(0,0,900,100);

        JLabel username = new JLabel("Username:");
        username.setBounds(250, 250, 100, 25);
        username.setForeground(Color.GREEN);
        username.setFont(new Font(Font.SERIF, Font.ITALIC,15));
        frame.add(username);

        JLabel password = new JLabel("Password:");
        password.setBounds(250, 315, 100, 25);
        password.setForeground(Color.GREEN);
        password.setFont(new Font(Font.SERIF, Font.ITALIC,15));
        frame.add(password);

        pass = new JPasswordField();
        pass.setBounds(350, 315, 250, 50);
        frame.add(pass);

//        login = new JButton("Login");
//        login.setBounds(350, 400, 100, 30);
//
//
//        frame.add(login);


//        SignUp = new JButton("Sign Up");
//        SignUp.setBounds(500, 400, 100, 30);
//        frame.add(SignUp);

        text= new  JTextField();
        text.setBounds(350, 250, 250, 50);
        frame.add(text);

        JLabel j = new JLabel();
        ImageIcon title = new ImageIcon("/Users/camihawkins/DataB/src/Red.png");
        j.setIcon(title);
        j.setBounds(335, 150, 500, 75);
        frame.add(j);




        frame.add(label);



        frame.setSize(900, 600);
        frame.setVisible(true);
        frame.setTitle("Welcome Playa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(white);
        frame.getContentPane().setBackground(Color.BLACK);
        new GUI();






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            System.out.println(text.getText());
        }


    }
}
