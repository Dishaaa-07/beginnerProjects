import javax.swing.*;
public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        // text field
        JTextField textField = new JTextField();
        textField.setBounds(20, 50, 150, 35);
        // text button
        JButton button = new JButton("Click me");
        button.setBounds(180, 50, 100, 35);
        // label
        JLabel label = new JLabel("Hello!");
        label.setBounds(40, 90, 1000, 45);

        // add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        button.addActionListener(e ->{
            String name = textField.getText();
            label.setText("Hello, "+ name + ".!");
        });

    }
}